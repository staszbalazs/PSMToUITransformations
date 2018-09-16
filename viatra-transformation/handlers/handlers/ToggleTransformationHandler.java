package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import traceability.PSMToUI;
import transformations.EventDrivenPsmToUi;

public class ToggleTransformationHandler extends AbstractHandler implements IHandler {

    ViatraQueryEngine engine;
    EventDrivenPsmToUi transformation;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);

        PSMToUI tracemodel = (PSMToUI) selection.getFirstElement();

        if(transformation == null) {
            if(engine == null) {
                try {
                    engine = ViatraQueryEngine.on(new EMFScope(tracemodel.eResource().getResourceSet()));
                    transformation = new EventDrivenPsmToUi(tracemodel, engine);
                    transformation.execute();
                } catch (ViatraQueryException e) {
                    throw new ExecutionException(e.getMessage(), e);
                }
            }
        } else {
            transformation.dispose();
            transformation = null;
            engine = null;
        }

        return null;
    }

}