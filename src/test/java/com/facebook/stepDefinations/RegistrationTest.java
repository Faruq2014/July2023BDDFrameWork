package com.facebook.stepDefinations;

import com.facebook.base.BaseTest;
import com.facebook.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest extends BaseTest{
	RegistrationPage registrationPage;
	@Given("tester open facebook home page")
	public void testerOpenFacebookHomePage() {
		openApp();
		
	}
	@Given("tester click on registration button")
	public void testerClickOnRegistrationButton() {
		registrationPage= new RegistrationPage(driver);
		registrationPage.createNewAccount();
	}
	@When("tester input first name {string}")
	public void testerInputFirstName(String enterFirstName) {
		registrationPage.firstNameField(enterFirstName);
	}
	@When("tester input last name {string}")
	public void testerInputLastName(String enterLastName) {
		registrationPage.lastNameField(enterLastName);
	}
	@When("tester input email {string}")
	public void testerInputEmail(String enterEmail) {
		registrationPage.emailField(enterEmail);
	}
	@When("tester input password {string}")
	public void testerInputPassword(String EnterYourPassword) {
		registrationPage.passwordField(EnterYourPassword);
	}
	@When("tester input birth month {string}")
	public void testerInputBirthMonth(String enterYourBirthMonth) {
		registrationPage.monthDropDownField(enterYourBirthMonth);
	}
	@When("tester input birth day {string}")
	public void testerInputBirthDay(String enterYourBirthDay) {
		registrationPage.dayDropDownField(enterYourBirthDay);
	}
	@When("tester input birth year {string}")
	public void testerInputBirthYear(String enterYourBirthYear) {
		registrationPage.yearDropDownField(enterYourBirthYear); 
	}
	@When("tester input gender {string}")
	public void testerInputGender(String enterGender) {
		registrationPage.radioButton(enterGender);
	}
	@When("tester click login button")
	public void testerClickLoginButton() {
		registrationPage.signupButton();
		
	}
	@Then("Tester landing on wrong page")
	public void testerLandingOnWrongPage() {
	    System.out.println("not build yet!");
	}
	@Then("tester should landing on user page")
	public void testerShouldLandingOnUserPage() {
	    closeApp();
	}



}
