package operations

import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import ui.UIAttributeComponentType
import ui.UIInterval
import ui.UiPackage
import ui.UIComponentType
import ui.UIParameterComponentType

class Interval {
	
	extension IModelManipulations manipulation
	
	extension UiPackage uiPackage = UiPackage::eINSTANCE
	
	public def createIntervals(UIComponentType componentType, String classUuid) {
		
		if (componentType.interval !== null) {
			val intervalList = componentType.interval.replace(" ", "").replace("\\],\\[", " ").replace("\\]", "").replace("\\[", "").split(" ");
		
			var int n = 1;
			if (intervalList.get(0) != "") {
				for (String interval : intervalList) {
					val splitInterval = interval.split(",")
					val UIInterval uiInterval = componentType.createChild(UIComponentType_Intervals, UIInterval) as UIInterval
								
					if (splitInterval.get(0) != "") {
						uiInterval.min = Integer.valueOf(splitInterval.get(0))
					}
					if (splitInterval.size() >= 2 && splitInterval.get(1) != "") {
						uiInterval.max = Integer.valueOf(splitInterval.get(1))
					}
					if (splitInterval.size() == 3 && splitInterval.get(2) != "") {
						uiInterval.step = Integer.valueOf(splitInterval.get(2))
					}
					
					uiInterval.name = "UIInterval";
					uiInterval.uuid = classUuid + "." + componentType.name + "_" + n
					n++;
				}
			}
		}	
	} 
	
}
