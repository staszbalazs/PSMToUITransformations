package transformations

import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import queries.PatternProvider
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule

class ModelRuleFactory {
	
	extension EventDrivenTransformationRuleFactory factory = new EventDrivenTransformationRuleFactory
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modelRule
	
	//First
	public def getModelRule() {
		if (modelRule === null) {
			modelRule = createRule.name("ModelRule").precondition(PatternProvider.instance().getJModelQuery())
				.action(CRUDActivationStateEnum.CREATED) [
				].action(CRUDActivationStateEnum.UPDATED) [
				].action(CRUDActivationStateEnum.DELETED) [
				].addLifeCycle(Lifecycles.getDefault(true, true)).build
		}
		return modelRule
	}
	
}