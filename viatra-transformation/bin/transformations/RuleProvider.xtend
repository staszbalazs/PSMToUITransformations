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
	
	
	private PSMToUI psm2ui
	private ViatraQueryEngine engine
	
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> modelRule = modelRuleFactory.getModelRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> classRule = classRuleFactory.getClassRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> packageRule = packageRuleFactory.getPackageRule(psm2ui)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> filterRule = filterRuleFactory.getFilterRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> menuRule = menuRuleFactory.getMenuRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> roleRule = roleRuleFactory.getRoleRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> attributeRule = attributeRuleFactory.getAttributeRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> operationRule = operationRuleFactory.getOperationRule(psm2ui, engine)
	private EventDrivenTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> parameterRule = parameterRuleFactory.getParameterRule(psm2ui, engine)

	new( PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.engine = engine
		this.psm2ui = psm2ui
		
		this.classRuleFactory = new ClassRuleFactory
		this.modelRuleFactory = new ModelRuleFactory
		this.packageRuleFactory = new PackageRuleFactory
		this.filterRuleFactory = new FilterRuleFactory
		this.menuRuleFactory = new MenuRuleFactory
		this.roleRuleFactory = new RoleRuleFactory
		this.attributeRuleFactory = new AttributeRuleFactory
		this.operationRuleFactory = new OperationRuleFactory
		this.parameterRuleFactory = new ParameterRuleFactory
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