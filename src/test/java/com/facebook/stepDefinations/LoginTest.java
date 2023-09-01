package com.facebook.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	@Given("user open facebook home page")
	public void user_open_facebook_home_page() {
	 System.out.println("hello given");   
	}

	@When("user enter userName and password")
	public void user_enter_user_name_and_password() {
		System.out.println("hello when");   
	}

	@Then("user succesfully logged in")
	public void user_succesfully_logged_in() {
		System.out.println("hello then");    
	}

}
