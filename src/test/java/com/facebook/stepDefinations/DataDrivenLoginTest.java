package com.facebook.stepDefinations;

import com.facebook.base.BaseTest;
import com.facebook.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenLoginTest extends BaseTest{
	
	LoginPage loginPage;
	
	@Given("tester open facebook home page {string}")
	public void testerOpenFacebookHomePage(String string) {
		openApp(); 
	}
	@When("tester enter {string} and {string}")
	public void testerEnterAnd(String userName, String password) {
		loginPage= new  LoginPage(driver);
		loginPage.userName(userName);
		loginPage.enterPassword(password);
		
	}
	@Then("I verify the {string} of the tester")
	public void iVerifyTheOfTheTester(String title) {
		assertTitle(title);
		loginPage.clickLoginButton();
		closeApp();
	}
}
