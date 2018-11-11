package handlers;

import traceability.PSMToUI;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.emf.common.util.URI;

public class PSMToUiModelInitializer {

	    public PSMToUiModelInitializer(){
	        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("psmtoui", new XMIResourceFactoryImpl());
	    }

	    public PSMToUI loadTraceModel() {
	        ResourceSet resSet = new ResourceSetImpl();
	        Resource trcRes = resSet.createResource(URI.createURI("traceability"));
	         
	        return (PSMToUI) trcRes.getContents().get(0);	        
	    }
}
