post {

	var equalModels : Boolean = true; 
	for (modelElement in VIATRA!Identifiable.all) {
		if (modelElement.matches() = null) {
			modelElement.uuid.println("Error during transformation in " + modelElement.uuid);
			equalModels = false;
		}
	}
	
	if (equalModels) {
		"The two models are equal!".println();
	}

}