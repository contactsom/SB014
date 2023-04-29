package com.simplilearn.inerface3;

public class UniversityAdmistrator {

	public static void main(String[] args) {
	

		UniversityImpl universityImpl = new UniversityImpl();
		universityImpl.openArtColege();
		universityImpl.openCommerceColege();
		universityImpl.openEngeColege();
		universityImpl.openScienceColege();
		
		universityImpl.openAIColege();
		
	}

}
