package com.facebook.stepDefinations;

import com.facebook.base.BaseTest;
import com.facebook.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseTest{
	LoginPage loginPage;
	
	@Given("user open facebook home page")
	public void user_open_facebook_home_page() {
	 System.out.println("hello given"); 
	 openApp();
	}

	@When("user enter userName and password")
	public void user_enter_user_name_and_password() {
		System.out.println("hello when");
		loginPage = new LoginPage(driver);
		loginPage.userName("Ayon");
		loginPage.enterPassword("aoyeerr");
	}

	@Then("user succesfully logged in")
	public void user_succesfully_logged_in() {
		System.out.println("hello then"); 
		loginPage.clickLoginButton();
		closeApp();
	}

}
