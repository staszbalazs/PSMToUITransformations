package transformations

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import psm.JVisibility
import queries.JClassWithGuardConditionQuery
import queries.JClassWithGuardConditionQueryForModify
import queries.PatternProvider
import traceability.PSMToUI
import traceability.TraceabilityPackage
import ui.UIClass
import ui.UIClassView
import ui.UIListView
import ui.UIViewFieldSet
import ui.UiPackage

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
										
					System.out.println("Transforming class: " + JClass.uuid)
										
					//Get or create the UIClass
					val possibleMatch =  PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(JClass, null)
																
					var UIClass uiClass
					if (possibleMatch.isPresent) {
						uiClass = possibleMatch.get().getIdentifiable as UIClass
						uiClass.moveTo(uiModule, UIModule_Classes)
					} else {
						uiClass = uiModule.createChild(getUIModule_Classes, UIClass) as UIClass
						
						val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
						trace.addTo(PSMToUITrace_PsmElements, JClass)
						trace.addTo(PSMToUITrace_UiElements, uiClass)
					}
					
					//Set attributes
					uiClass.name = JClass.name
					uiClass.uuid = JClass.uuid
					uiClass.abstract = JClass.isAbstract
					uiClass.enumClass = JClass.isRepresentsEnum
					uiClass.singleton = JClass.isBusinessSingleton
					
					if (JClass.visibility == JVisibility::PUBLIC) {
						uiClass.readonly = false	
					} else {
						uiClass.readonly = true
					}
					
					//Set supertype
					if (JClass.getSupertype !== null) {
						val potentialSuper = PatternProvider.instance().getPsmToUiTrace(engine)
												.getOneArbitraryMatch(JClass.supertype, null)
									
						if (potentialSuper.isPresent) {
							uiClass.^super = (potentialSuper.get().getIdentifiable as UIClass)
						} else {
							val superType = psm2ui.uiBase.eResource.create(UIClass) as UIClass
							uiClass.^super = superType
							
							val trace = psm2ui.createChild(PSMToUI_Traces, PSMToUITrace)
							trace.addTo(PSMToUITrace_PsmElements, JClass.getSupertype)
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
					
					//create default viewFieldSet for listView
					val UIViewFieldSet viewFieldSet = listView.createChild(UIView_ViewFieldSets, UIViewFieldSet) as UIViewFieldSet
					viewFieldSet.name = listView.name;
					viewFieldSet.uuid = listView.uuid + "_viewfieldset_" + listView.name;
					
				].addLifeCycle(Lifecycles.getDefault(false, false)).build
		}
		return classRule
	}
	
	public def getModifyClassRule() {
		if (modifyClassRule === null) {			
			modifyClassRule = createRule.name("ModifyClassRule").precondition(JClassWithGuardConditionQueryForModify.Matcher.querySpecification())
				.action(CRUDActivationStateEnum.UPDATED) [
															
					System.out.println("Updating class: " + JClass.uuid)
					
					uiClass.name = JClass.name
					uiClass.uuid = JClass.uuid
					uiClass.abstract = JClass.isAbstract
					uiClass.enumClass = JClass.isRepresentsEnum
					uiClass.singleton = JClass.isBusinessSingleton
					
					if (JClass.visibility == JVisibility::PUBLIC) {
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
					
					val UIViewFieldSet viewFieldSet = listView.viewFieldSets.get(0)
					viewFieldSet.name = listView.name;
					viewFieldSet.uuid = listView.uuid + "_viewfieldset_" + listView.name;
					
				].action(CRUDActivationStateEnum.DELETED) [
										
					System.out.println("Deleting class: " + JClass.uuid)
										
					uiModule.remove(UIModule_Classes, uiClass)
					psm2ui.remove(PSMToUI_Traces, trace)
					
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modifyClassRule
	}
	
}