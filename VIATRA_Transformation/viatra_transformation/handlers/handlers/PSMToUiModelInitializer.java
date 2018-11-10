package handlers;

import traceability.PSMToUI;
import traceability.TraceabilityFactory;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import psm.JModel;

import org.eclipse.emf.common.util.URI;

import ui.UIBase;
import ui.UiFactory;

public class PSMToUiModelInitializer {
		private UiFactory uiFactory = UiFactory.eINSTANCE;
	    private TraceabilityFactory traceFactory = TraceabilityFactory.eINSTANCE;

	    public PSMToUiModelInitializer(){
	        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("psmtoui", new XMIResourceFactoryImpl());
	    }

	    public PSMToUI loadModel(String location) {
	        ResourceSet resSet = new ResourceSetImpl();
	       
	        Resource psmRes = resSet.getResource(URI.createURI(location), true);	        
	        Resource uiRes = resSet.createResource(URI.createURI("ui"));
	        Resource trcRes = resSet.createResource(URI.createURI("traceability"));
	        
	        JModel model = (JModel) psmRes.getContents().get(0);
	        
	        UIBase uiBase = uiFactory.createUIBase();
	        uiRes.getContents().add(uiBase);
	         
	        PSMToUI psmToUi = traceFactory.createPSMToUI();
	        psmToUi.setJModel(model);
	        psmToUi.setUiBase(uiBase);
	        trcRes.getContents().add(psmToUi);
	        
	        return psmToUi;
	    }
}
