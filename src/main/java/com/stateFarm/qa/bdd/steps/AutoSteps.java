package com.stateFarm.qa.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoSteps{
	
	    

	@Given("user is in the The State Farm page")
	public void user_is_in_the_the_state_farm_page() {
	 String title=BaseClass.driver.getTitle();
	    System.out.println("Home Page Title is: "+title);
	}
	@When("user click onto dropdown")
	public void user_click_onto_dropdown() {
	    BaseClass.mainPage.productMethod(BaseClass.cm);
	}
	@Then("product list open")
	public void product_list_open() {
		String title1=BaseClass.driver.getTitle();
	    System.out.println("Home Page Title1 is: "+title1);   
	}
}
