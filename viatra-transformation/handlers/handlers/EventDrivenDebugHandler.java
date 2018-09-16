package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;

import traceability.PSMToUI;
import transformations.EventDrivenPsmToUi;
/*
public class EventDrivenDebugHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        final Job job = new Job("PSMToUi Event Driven Debug") {
            protected IStatus run(IProgressMonitor monitor) {
                // Load the CPS model
                CPSModelInitializer init = new CPSModelInitializer();
                PSMToUI psm2ui = init.loadModel("traceability.model");
                ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(psm2ui.eResource().getResourceSet()));
                // Initialize CPS to Deployment Transformation
                EventDrivenPsmToUi transformation = new EventDrivenPsmToUi(psm2ui, engine);
                // Execute the transformation and observe the effects of the selected adapter
                transformation.execute();
                
                transformation.dispose();
                return Status.OK_STATUS;
            }
        };
        job.schedule();
        return null;
    }

}
*/