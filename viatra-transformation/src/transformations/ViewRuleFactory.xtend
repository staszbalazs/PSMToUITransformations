package transformations

import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import queries.PatternProvider
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import psm.JClass
import operations.Views
import ui.UIClass
import ui.UIClassView
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import ui.UIListView
import psm.JUIAlias

class ViewRuleFactory {
	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	extension Views view
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> viewRule
	
	public def getViewRule(ViatraQueryEngine engine) {
		if (viewRule === null) {
			viewRule = createRule.name("ViewRule").precondition(PatternProvider.instance().getJClassWithGuardConditionQuery())
				.action(CRUDActivationStateEnum.CREATED) [
					
					val JClass jClass = it.JClass as JClass
					
					val match = PatternProvider.instance().getPsmToUiTrace(engine)
									.getOneArbitraryMatch(jClass, null)
									.get()
					val UIClass uiClass = match.getIdentifiable as UIClass
					
					var UIClassView classView = createClassView(uiClass, jClass, null, true, engine)
					val UIListView listView = createListView(uiClass, jClass, null, classView, true, engine)
					uiClass.selector = listView
					
					for (JUIAlias alias : jClass.aliases) {
						classView = createClassView(uiClass, jClass, alias, false, engine);
						createListView(uiClass, jClass, alias, classView, false, engine);
					}
					
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return viewRule
	}
	
}