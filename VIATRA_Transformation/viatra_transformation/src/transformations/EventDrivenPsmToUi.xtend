package transformations

import org.apache.log4j.Logger
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.resolver.InvertedDisappearancePriorityConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation
import queries.PatternProvider
import traceability.PSMToUI

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
        debug('''Executing transformation on:�resource.URI�''')
        
        transformation.executionSchema.startUnscheduledExecution
    }

    private def createTransformation() {
        //Initialize rule provider
        this.ruleProvider = new RuleProvider(psm2ui, engine)

    	val fixedPriorityResolver = new InvertedDisappearancePriorityConflictResolver
    	fixedPriorityResolver.setPriority(getModelRule().ruleSpecification, 1)
    	fixedPriorityResolver.setPriority(getPackageRule().ruleSpecification, 2)
    	fixedPriorityResolver.setPriority(getClassRule().ruleSpecification, 3)
		fixedPriorityResolver.setPriority(getAttributeRule().ruleSpecification, 4)
		fixedPriorityResolver.setPriority(getRoleRule().ruleSpecification, 5)
		fixedPriorityResolver.setPriority(getOperationRule().ruleSpecification, 6)
		fixedPriorityResolver.setPriority(getParameterRule().ruleSpecification, 7)
		fixedPriorityResolver.setPriority(getMenuRule().ruleSpecification, 8)
    	fixedPriorityResolver.setPriority(getFilterRule().ruleSpecification, 9)
    	fixedPriorityResolver.setPriority(getInfoRule().ruleSpecification, 10)
    	
        //Initialize event-driven transformation
        transformation = EventDrivenTransformation.forEngine(engine)
        	.setConflictResolver(fixedPriorityResolver)
            .addRule(getModelRule)
            .addRule(getPackageRule)
            .addRule(getClassRule)
            .addRule(getAttributeRule)
            .addRule(getRoleRule)
            .addRule(getOperationRule)
            .addRule(getParameterRule)
            .addRule(getMenuRule)
            .addRule(getFilterRule)
            .addRule(getInfoRule)
            .build
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
