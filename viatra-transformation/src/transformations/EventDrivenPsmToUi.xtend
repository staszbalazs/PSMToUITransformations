package transformations

import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.debug.configuration.TransformationDebuggerConfiguration
import org.eclipse.viatra.transformation.evm.specific.resolver.InvertedDisappearancePriorityConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation
import traceability.PSMToUI
import queries.PatternProvider

class EventDrivenPsmToUi {
    extension Logger logger = Logger.getLogger(EventDrivenPsmToUi)

    /* Transformation-related extensions */
    extension EventDrivenTransformation transformation
    
    /* Transformation rule-related extensions */
    extension IModelManipulations manipulation

    extension ViatraQueryEngine engine
    extension Resource resource
    extension PSMToUI psm2ui
    
    extension PatternProvider patternProvider = PatternProvider.instance
    extension RuleProvider ruleProvider
    
    new(PSMToUI psm2ui, ViatraQueryEngine engine) {
    	this.psm2ui = psm2ui
    	this.resource = psm2ui.uiBase.eResource
    	this.engine = engine
    	prepare(engine)
    	createTransformation
    }

    public def execute() {
        debug('''Executing transformation on:�resource.URI�''')        
        transformation.executionSchema.startUnscheduledExecution
    }

    private def createTransformation() {
        //Initialize model manipulation API
        this.manipulation = new SimpleModelManipulations(engine)
        //Initialize rule provider
        this.ruleProvider = new RuleProvider(psm2ui, engine)
        //Initialize event-driven transformation
    	val fixedPriorityResolver = new InvertedDisappearancePriorityConflictResolver
    	fixedPriorityResolver.setPriority(getModuleRule().ruleSpecification, 1)
    	fixedPriorityResolver.setPriority(getPackageRule().ruleSpecification, 2)
    	fixedPriorityResolver.setPriority(getClassRule().ruleSpecification, 3)
		fixedPriorityResolver.setPriority(getAttributeRule().ruleSpecification, 4)
		fixedPriorityResolver.setPriority(getRoleRule().ruleSpecification, 5)
		fixedPriorityResolver.setPriority(getOperationRule().ruleSpecification, 6)
		fixedPriorityResolver.setPriority(getParameterRule().ruleSpecification, 7)
		fixedPriorityResolver.setPriority(getMenuRule().ruleSpecification, 8)
    	fixedPriorityResolver.setPriority(getFilterRule().ruleSpecification, 9)
    	
        //Initialize event-driven transformation
        transformation = EventDrivenTransformation.forEngine(engine)
        	.setConflictResolver(fixedPriorityResolver)
            .addRule(getModuleRule)
            .addRule(getPackageRule)
            .addRule(getClassRule)
            .addRule(getAttributeRule)
            .addRule(getRoleRule)
            .addRule(getOperationRule)
            .addRule(getParameterRule)
            .addRule(getMenuRule)
            .addRule(getFilterRule)
            .addAdapterConfiguration(new TransformationDebuggerConfiguration("eventDrivenPsmToUiDebugger"))
            .build
    }

    // Dispose model transformation
    def dispose() {
        if (transformation != null) {
            transformation.dispose
        }
        transformation = null
        return
    }
}
