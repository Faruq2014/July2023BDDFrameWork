package com.facebook.base;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	public WebDriver driver;

	public void openApp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void assertTitle(String actualTitle) {
		String expectedTitle=driver.getTitle();
		Assert.assertEquals("Title din not match", expectedTitle, expectedTitle);
		
	}
	public void closeApp() {
		driver.quit();
	}
}
