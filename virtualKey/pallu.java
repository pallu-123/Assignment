package com.pallu;
import com.pallu.FileOperations;
import com.pallu.HandleOptions;
import com.pallu.MenuOptions;

public class pallu {
	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("pallu", "Pallavi_g k");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}