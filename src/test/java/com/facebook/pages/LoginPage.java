package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "email")
	public WebElement uName;

	public WebElement userName(String enterUserName) {
		uName.sendKeys(enterUserName);
		return uName;
	}

	@FindBy(how = How.ID, using = "pass")
	private WebElement password;
	// @FindBy is the annotation
	// how= is the formula
	// private WebElement password;= is an instance variable

	public WebElement enterPassword(String enterYourPassword) {
		password.sendKeys(enterYourPassword);
		return password;
	}

	@FindBy(how = How.XPATH, using = "//button[starts-with(@id,'u_0_5')]")
	private WebElement loginButton;

	public void clickLoginButton() {
		loginButton.click();
	}

}
