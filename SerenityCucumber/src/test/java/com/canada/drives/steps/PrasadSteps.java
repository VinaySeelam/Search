package com.canada.drives.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PrasadPage;

public class PrasadSteps {
	
	PrasadPage elg = new PrasadPage();


	@Given("^I am a person from Wales$")
	public void i_am_a_person_from_Wales() {
		elg.naviagte();	
		elg.validateDocumentTitle();
		System.out.println("prasad");
	   
	}

	
		
	
	@When("I put my circumstances into the Checker tool")
	public void i_put_my_circumstances_into_the_Checker_tool() {
	 
	elg.VerifyWalesElegibilityUser();
		
		
	}

	
	@Then("I should get a result of whether I will get help or not")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() {
		
		elg.VerifyNhsElegibilityResult();
		
		
		
	}
	@And("I close the application")
	public void I_close_the_application(){
		
		elg.close();
		
		
	}

}
