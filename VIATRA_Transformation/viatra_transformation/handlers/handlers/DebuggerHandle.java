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

public class DebuggerHandle extends AbstractHandler {
	
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final Job job = new Job("DebugEventDriven") {
            protected IStatus run(IProgressMonitor monitor) {
            	PSMToUiModelInitializer init = new PSMToUiModelInitializer();
                PSMToUI psmToUi = init.loadTraceModel();
                ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(psmToUi.getJModel().eResource().getResourceSet()));
                EventDrivenPsmToUi transformation = new EventDrivenPsmToUi(psmToUi, engine);
             
                transformation.execute();
                transformation.dispose();
                return Status.OK_STATUS;
            }
        };
        job.schedule();
        return null;
    }

}
