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

class ClassRuleFactory {
	
	extension IModelManipulations manipulation	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> classRule
	
	public def getClassRule(PSMToUI psm2ui, ViatraQueryEngine engine) {
		if (classRule === null) {
			manipulation = new SimpleModelManipulations(engine);
			
			classRule = createRule.name("ClassRule").precondition(JClassWithGuardConditionQuery.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.CREATED) [	
					
					val JClass jClass = it.getJClass() as JClass
					
					System.out.println("Transforming class: " + jClass.uuid)
					
					//Get the UIModule for the class
					val match = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(jClass.package, null)
												.get()
					
					var UIModule module = match.getIdentifiable as UIModule
					
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
					
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return classRule
	}
	
}