package transformations

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
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
	private InfoRuleFactory infoRuleFactory
	private AttributeGroupRuleFactory attributeGroupRuleFactory

	new( PSMToUI psm2ui, ViatraQueryEngine engine) {
		this.classRuleFactory = new ClassRuleFactory(psm2ui, engine)
		this.modelRuleFactory = new ModelRuleFactory(psm2ui, engine)
		this.packageRuleFactory = new PackageRuleFactory(psm2ui, engine)
		this.filterRuleFactory = new FilterRuleFactory(psm2ui, engine)
		this.menuRuleFactory = new MenuRuleFactory(psm2ui, engine)
		this.roleRuleFactory = new RoleRuleFactory(psm2ui, engine)
		this.attributeRuleFactory = new AttributeRuleFactory(psm2ui, engine)
		this.operationRuleFactory = new OperationRuleFactory(psm2ui, engine)
		this.parameterRuleFactory = new ParameterRuleFactory(psm2ui, engine)
		this.infoRuleFactory = new InfoRuleFactory(psm2ui, engine)
		this.attributeGroupRuleFactory = new AttributeGroupRuleFactory(psm2ui, engine)
	}
	
	public def getModelRule() {
		return modelRuleFactory.getModelRule()
	}
	
	public def getModifyModelRule() {
		return modelRuleFactory.getModifyModelRule()
	}
	
	public def getInfoRule() {
		return infoRuleFactory.getInfoRule()
	}
	
	public def getModifyInfoRule() {
		return infoRuleFactory.getModifyInfoRule()
	}
	
	public def getRepresentsUserIdForInfoRule() {
		return infoRuleFactory.getRepresentsUserIdForInfoRule()
	}
	
	public def getClassRule() {
		return classRuleFactory.getClassRule()
	}
	
	public def getModifyClassRule() {
		return classRuleFactory.getModifyClassRule()
	}
	
	public def getPackageRule() {
		return packageRuleFactory.getPackageRule()
	}
	
	public def getModifyPackageRule() {
		return packageRuleFactory.getModifyPackageRule()
	}
	
	public def getFilterRule() {
		return filterRuleFactory.getFilterRule()
	}
	
	public def getModifyFilterRule() {
		return filterRuleFactory.getModifyFilterRule()
	}
	
	public def getMenuRule() {
		return menuRuleFactory.getMenuRule()
	}
	
	public def getMenuParentSetterRule() {
		return menuRuleFactory.getMenuParentSetterRule()
	}
	
	public def getModifyMenuRule() {
		return menuRuleFactory.getModifyMenuRule()
	}
	
	public def getRoleRule() {
		return roleRuleFactory.getRoleRule()
	}
	
	public def getModifyRoleRule() {
		return roleRuleFactory.getModifyRoleRule()
	}
	
	public def getModifyRoleViewFieldRule() {
		return roleRuleFactory.getModifyRoleViewFieldRule()
	}
	
	public def getAttributeGroupRule() {
		return attributeGroupRuleFactory.getAttributeGroupRule()
	}
	
	public def getModifyAttributeGroupRule() {
		return attributeGroupRuleFactory.getModifyAttributeGroupRule()
	}
	
	public def getPrimitiveRule() {
		return attributeRuleFactory.getPrimitiveRule()
	}
	
	public def getAttributeRule() {
		return attributeRuleFactory.getAttributeRule()
	}
	
	public def getModifyAttributeRule() {
		return attributeRuleFactory.getModifyAttributeRule()
	}
	
	public def getAttributeInGroupViewFieldRule() {
		return attributeRuleFactory.getAttributeInGroupViewFieldRule()
	}
	
	public def getModifyAttributeViewFieldRule() {
		return attributeRuleFactory.getModifyAttributeViewFieldRule()
	}
	
	public def getOperationRule() {
		return operationRuleFactory.getOperationRule()
	}
	
	public def getModifyOperationRule() {
		return operationRuleFactory.getModifyOperationRule()
	}
	
	public def getParameterRule() {
		return parameterRuleFactory.getParameterRule()
	}
	
	public def getModifyParameterRule() {
		return parameterRuleFactory.getModifyParameterRule()
	}
	
	public def getModifyParameterViewFieldRule() {
		return parameterRuleFactory.getModifyParameterViewFieldRule()
	}
	
}