package com.simplilearn.methodd;

public class ChristUniversityMain {

	public static void main(String[] args) {
		
		// Create the object of child class in order to call the method from abstract class
		ChristUniversitymanagement christUniversitymanagement = new ChristUniversitymanagement();
		christUniversitymanagement.getAdmission_BTechC();
		christUniversitymanagement.getAdmission_BTechCivil();
		christUniversitymanagement.getAdmission_BTechCS();
		christUniversitymanagement.getAdmission_BTechM();
		
		christUniversitymanagement.getAdmission_BTechRobotic();
		christUniversitymanagement.getAdmission_BTechAI();
		

	}

}
