package transformations

import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JVisibility
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIModule
import ui.UiPackage
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import psm.JClass
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import ui.UIListView
import ui.UIClassView
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import queries.JClassWithGuardConditionQuery
import queries.JClassWithGuardConditionQueryForModify

class ClassRuleFactory {
	
	extension IModelManipulations manipulation	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	extension ViatraQueryEngine engine
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	
	extension PSMToUI psm2ui
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> classRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modifyClassRule
	
	
	new(PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.manipulation = new SimpleModelManipulations(engine);
		this.engine = engine;
		this.psm2ui = psm2ui;
	}
	
	public def getClassRule() {
		if (classRule === null) {			
			classRule = createRule.name("ClassRule").precondition(JClassWithGuardConditionQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [	
					
					val JClass jClass = it.getJClass() as JClass
					
					System.out.println("Transforming class: " + jClass.uuid)
					
					//Get the UIModule for the class
					var UIModule module = it.getUiModule as UIModule
					
					//Get or create the UIClass
					val possibleMatch =  PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jClass, null)
																
					var UIClass uiClass
					if (possibleMatch.isPresent) {
						uiClass = possibleMatch.get().getIdentifiable as UIClass
						uiClass.moveTo(module, UIModule_Classes)
					} else {
						uiClass = module.createChild(getUIModule_Classes, UIClass) as UIClass
						
						val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
						trace.addTo(PSMToUITrace_PsmElements, jClass)
						trace.addTo(PSMToUITrace_UiElements, uiClass)
					}
					
					//Set attributes
					uiClass.name = jClass.name
					uiClass.uuid = jClass.uuid
					uiClass.abstract = jClass.isAbstract
					uiClass.enumClass = jClass.isRepresentsEnum
					uiClass.singleton = jClass.isBusinessSingleton
					
					if (jClass.visibility == JVisibility::PUBLIC) {
						uiClass.readonly = false	
					} else {
						uiClass.readonly = true
					}
					
					//Set supertype
					if (jClass.getSupertype !== null) {
						val potentialSuper = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jClass.supertype, null)
									
						if (potentialSuper.isPresent) {
							uiClass.^super = (potentialSuper.get().getIdentifiable as UIClass)
						} else {
							val superType = psm2ui.uiBase.eResource.create(UIClass) as UIClass
							uiClass.^super = superType
							
							val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
							trace.addTo(PSMToUITrace_PsmElements, jClass.getSupertype)
							trace.addTo(PSMToUITrace_UiElements, superType)
						}
					}
					
					//create classView
					val classView = uiClass.createChild(getUIClass_ClassView, UIClassView) as UIClassView
					classView.uuid = uiClass.uuid.replace("\\.", "_") + "_oview_default"
					classView.name = uiClass.name
					
					//create listView
					val listView = uiClass.createChild(getUIClass_ListView, UIListView) as UIListView
					listView.uuid = uiClass.uuid.replace("\\.", "_") + "_lview_default"
					listView.name = uiClass.name;
					listView.pageSize = 20;
					listView.detailView = classView;
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return classRule
	}
	
	public def getModifyClassRule() {
		if (modifyClassRule === null) {			
			modifyClassRule = createRule.name("ModifyClassRule").precondition(JClassWithGuardConditionQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
					
					val JClass jClass = it.getJClass() as JClass
					
					System.out.println("Updating class: " + jClass.uuid)
					
					val UIClass uiClass = it.getUiClass as UIClass
					uiClass.name = jClass.name
					uiClass.uuid = jClass.uuid
					uiClass.abstract = jClass.isAbstract
					uiClass.enumClass = jClass.isRepresentsEnum
					uiClass.singleton = jClass.isBusinessSingleton
					
					if (jClass.visibility == JVisibility::PUBLIC) {
						uiClass.readonly = false	
					} else {
						uiClass.readonly = true
					}
					
					val UIClassView classView = uiClass.classView
					classView.uuid = uiClass.uuid.replace("\\.", "_") + "_oview_default"
					classView.name = uiClass.name
					
					val UIListView listView = uiClass.listView
					listView.uuid = uiClass.uuid.replace("\\.", "_") + "_lview_default"
					listView.name = uiClass.name;
					
				].action(CRUDActivationStateEnum.DELETED) [
					
					val JClass jClass = it.getJClass() as JClass
					
					System.out.println("Deleting class: " + jClass.uuid)
					
					val uiModule = it.getUiModule as UIModule
					
					uiModule.remove(UIModule_Classes, it.getUiClass)
					psm2ui.remove(PSMToUI_Traces, it.getTrace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyClassRule
	}
	
}