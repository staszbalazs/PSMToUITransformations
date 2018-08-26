package transformations

import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.debug.configuration.TransformationDebuggerConfiguration
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation
import psm.PsmPackage
import queries.PatternProvider
import traceability.TraceabilityPackage
import ui.UiPackage

class EventDrivenPsmToUi {
    extension Logger logger = Logger.getLogger(EventDrivenPsmToUi)

    /* Transformation-related extensions */
    extension EventDrivenTransformation transformation
    
    /* Transformation rule-related extensions */
    extension EventDrivenTransformationRuleFactory = new EventDrivenTransformationRuleFactory
    extension IModelManipulations manipulation
    
    /* VIATRA Query Pattern group */
    extension PatternProvider patternProvider = PatternProvider.instance
    
    /*VIATRA Rules */
    extension RuleProvider ruleProvider
    
    /* EMF metamodels */
    extension PsmPackage psmPackage = PsmPackage.eINSTANCE
    extension UiPackage uiPackage = UiPackage.eINSTANCE
    extension TraceabilityPackage trPackage = TraceabilityPackage::eINSTANCE 

    protected ViatraQueryEngine engine
    protected Resource resource
    //protected EventDrivenTransformationRule<?,?> exampleRule

    new(Resource resource) {
        this.resource = resource
        // Create EMF scope and EMF IncQuery engine based on the resource
        val scope = new EMFScope(resource)
        engine = ViatraQueryEngine.on(scope);
        
        info("Preparing transformation rules.")
        createTransformation
        info('''Prepared transformation rules''')

    }

    public def execute() {
        debug('''Executing transformation on:�resource.URI�''')        
        transformation.executionSchema.startUnscheduledExecution
    }

    private def createTransformation() {
        //Initialize model manipulation API
        this.manipulation = new SimpleModelManipulations(engine)
        //Initialize event-driven transformation
        transformation = EventDrivenTransformation.forEngine(engine)
            //.addRule(classRule)
            .addAdapterConfiguration(
                //Create a debug adapter
                //The debugger implements a classic breakpoint based functionality mapped to the field of model transformations.
                //Similar to the Java debugger --> Statements == transformation rule activations.
                //Breakpoints can be rendered to the individual transformation rule activations, or global conditions.
                //During the execution: if a breakpoint activation is about to be fired, or the global condition is met, the execution of the transformation is halted.
                //At this point, the user can specify the next course of action: step to the next activation firing, or continue the execution till the next breakpoint.
                new TransformationDebuggerConfiguration("eventDrivenPsmToUiDebugger"))
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
