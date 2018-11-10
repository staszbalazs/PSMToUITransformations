package transformations

import org.apache.log4j.Logger
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.resolver.InvertedDisappearancePriorityConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation
import queries.PatternProvider
import traceability.PSMToUI
import org.apache.log4j.Level
import org.eclipse.viatra.transformation.debug.configuration.TransformationDebuggerConfiguration

class EventDrivenPsmToUi {
    extension Logger logger = Logger.getLogger(EventDrivenPsmToUi)

    /* Transformation-related extensions */
    extension EventDrivenTransformation transformation
    
    extension ViatraQueryEngine engine
    extension PSMToUI psm2ui
    
    extension PatternProvider patternProvider = PatternProvider.instance
    extension RuleProvider ruleProvider
    
    new(PSMToUI psm2ui, ViatraQueryEngine engine) {
    	this.psm2ui = psm2ui
    	this.engine = engine
    	prepare(engine)
    	createTransformation
    }

    public def execute() {
        //debug('''Executing transformation on:�resource.URI�''')
        logger.setLevel(Level.DEBUG)
        
        transformation.executionSchema.startUnscheduledExecution
    }

    private def createTransformation() {
        //Initialize rule provider
        this.ruleProvider = new RuleProvider(psm2ui, engine)

		var Integer priority = 1;
		
    	val fixedPriorityResolver = new InvertedDisappearancePriorityConflictResolver
      	fixedPriorityResolver.setPriority(getPrimitiveRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModelRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getPackageRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getClassRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getAttributeGroupRule().ruleSpecification, priority++)
		fixedPriorityResolver.setPriority(getAttributeRule().ruleSpecification, priority++)
		fixedPriorityResolver.setPriority(getAttributeInGroupViewFieldRule().ruleSpecification, priority++)
		fixedPriorityResolver.setPriority(getRoleRule().ruleSpecification, priority++)
		fixedPriorityResolver.setPriority(getOperationRule().ruleSpecification, priority++)
		fixedPriorityResolver.setPriority(getParameterRule().ruleSpecification, priority++)
		fixedPriorityResolver.setPriority(getMenuRule().ruleSpecification, priority++) 
		fixedPriorityResolver.setPriority(getMenuParentSetterRule().ruleSpecification, priority++)
     	fixedPriorityResolver.setPriority(getFilterRule().ruleSpecification, priority++)
   		fixedPriorityResolver.setPriority(getModifyModelRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyPackageRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyClassRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyAttributeGroupRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyAttributeRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyAttributeViewFieldRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyRoleRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getRoleViewFieldRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyOperationRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyParameterRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getParameterViewFieldRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyMenuRule().ruleSpecification, priority++)
     	fixedPriorityResolver.setPriority(getModifyFilterRule().ruleSpecification, priority++)
  	 	fixedPriorityResolver.setPriority(getInfoRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getModifyInfoRule().ruleSpecification, priority++)
    	fixedPriorityResolver.setPriority(getRepresentsUserIdForInfoRule().ruleSpecification, priority++)
    	
        //Initialize event-driven transformation
        transformation = EventDrivenTransformation.forEngine(engine)
        	.setConflictResolver(fixedPriorityResolver)
 	       	.addRule(getPrimitiveRule)
            .addRule(getModelRule)
            .addRule(getPackageRule)
            .addRule(getClassRule)
            .addRule(getAttributeGroupRule)
            .addRule(getAttributeRule)
            .addRule(getAttributeInGroupViewFieldRule)
            .addRule(getRoleRule)
            .addRule(getOperationRule)
            .addRule(getParameterRule)
     		.addRule(getMenuRule)
            .addRule(getMenuParentSetterRule)
            .addRule(getFilterRule)
          	.addRule(getModifyModelRule)
          	.addRule(getModifyPackageRule)
     	    .addRule(getModifyClassRule)
            .addRule(getModifyAttributeGroupRule)
            .addRule(getModifyAttributeRule)
            .addRule(getModifyAttributeViewFieldRule)
            .addRule(getModifyRoleRule)
            .addRule(getRoleViewFieldRule)
     	    .addRule(getModifyOperationRule)
            .addRule(getModifyParameterRule)
            .addRule(getParameterViewFieldRule)
   	        .addRule(getModifyMenuRule)
			.addRule(getModifyFilterRule)
 			.addRule(getInfoRule)     
            .addRule(getModifyInfoRule)
            .addRule(getRepresentsUserIdForInfoRule)
            //.addAdapterConfiguration(new TransformationDebuggerConfiguration("DebuggerHandle"))
            .build
            
            
    	System.out.println("Transformation ready!")
    }

    // Dispose model transformation
    def dispose() {
        if (transformation !== null) {
            transformation.dispose
        }
        transformation = null
        return
    }
}
