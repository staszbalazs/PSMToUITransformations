package transformations

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import traceability.PSMToUI

class RuleProvider {
	
	private ClassRuleFactory classRuleFactory
	private ModelRuleFactory modelRuleFactory
	private PackageRuleFactory packageRuleFactory
	private FilterRuleFactory filterRuleFactory
	private MenuRuleFactory menuRuleFactory
	private RoleRuleFactory roleRuleFactory
	private AttributeRuleFactory attributeRuleFactory
	private OperationRuleFactory operationRuleFactory
	private ParameterRuleFactory parameterRuleFactory
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modelRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> classRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> packageRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> filterRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> menuRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> roleRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> operationRule
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> parameterRule

	new( PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.classRuleFactory = new ClassRuleFactory
		this.modelRuleFactory = new ModelRuleFactory
		this.packageRuleFactory = new PackageRuleFactory
		this.filterRuleFactory = new FilterRuleFactory
		this.menuRuleFactory = new MenuRuleFactory
		this.roleRuleFactory = new RoleRuleFactory
		this.attributeRuleFactory = new AttributeRuleFactory
		this.operationRuleFactory = new OperationRuleFactory
		this.parameterRuleFactory = new ParameterRuleFactory
		
		modelRule = modelRuleFactory.getModelRule(psm2ui, engine)
		classRule = classRuleFactory.getClassRule(psm2ui, engine)
		packageRule = packageRuleFactory.getPackageRule(psm2ui, engine)
		filterRule = filterRuleFactory.getFilterRule(psm2ui, engine)
		menuRule = menuRuleFactory.getMenuRule(psm2ui, engine)
		roleRule = roleRuleFactory.getRoleRule(psm2ui, engine)
		attributeRule = attributeRuleFactory.getAttributeRule(psm2ui, engine)
		operationRule = operationRuleFactory.getOperationRule(psm2ui, engine)
		parameterRule = parameterRuleFactory.getParameterRule(psm2ui, engine)
	}
	
	public def getModelRule() {
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
	
	public def getRoleRule() {
		return roleRule
	}
	
	public def getAttributeRule() {
		return attributeRule
	}
	
	public def getOperationRule() {
		return operationRule
	}
	
	public def getParameterRule() {
		return parameterRule
	}
	
}