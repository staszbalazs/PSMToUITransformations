package transformations

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import traceability.PSMToUI

class RuleProvider {
	
	extension ClassRuleFactory classRuleFactory
	extension ModelRuleFactory modelRuleFactory
	extension PackageRuleFactory packageRuleFactory
	extension FilterRuleFactory filterRuleFactory
	extension MenuRuleFactory menuRuleFactory
	extension RoleRuleFactory roleRuleFactory
	extension AttributeRuleFactory attrRuleFactory
	
	private PSMToUI psm2ui
	private ViatraQueryEngine engine
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modelRule = getModelRule()
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> classRule = getClassRule(psm2ui)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> packageRule = getPackageRule(psm2ui)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> filterRule = getFilterRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> menuRule = getMenuRule(psm2ui)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> roleRule = getRoleRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attrRule = getAttributeRule(psm2ui, engine)
	

	new(ViatraQueryEngine engine, PSMToUI psm2ui) {
		this.engine = engine
		this.psm2ui = psm2ui
	}
	
	public def getModuleRule() {
		return modelRule
	}
	
	public def getClassRule() {
		return classRule
	}
	
	public def getPackageRule() {
		return packageRule
	}
	
	public def getFilterRule() {
		return filterRule
	}
	
	public def getMenuRule() {
		return menuRule
	}
	
	public def getRoleRul() {
		return roleRule
	}
	
	public def getAttrRul() {
		return attrRule
	}
	
}