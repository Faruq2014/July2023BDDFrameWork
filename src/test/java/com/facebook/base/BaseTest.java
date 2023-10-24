package com.facebook.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest {

	public WebDriver driver;
	
	String browser="Chrome";
	
	public WebDriver openApp() {
	      
			if (browser.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			else if (browser.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				//System.setProperty("webdriver.gecko.driver", "C:/WS/DriverForSelenium/geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("Chrome is default browser");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			return driver;

		}			

	public void assertTitle(String actualTitle) {
		String expectedTitle = driver.getTitle();
		Assert.assertEquals("Title din not match", expectedTitle, expectedTitle);

	}
	
	public void closeApp() {		
		driver.quit();
	}

	public void screenShot(String screenShotName) {
		// taking the screen shot of the current page
		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		// source file name
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		Long takingTiem = System.currentTimeMillis();
		String destinationPath = "ScreenShots/" + screenShotName + takingTiem + ".png";
		// above 2 lines combine, we created destination path for screen shot
		// setting the destination path
		File destinationFile = new File(destinationPath);

		try {
			// copy from the src file and paste in the destination file
			FileUtils.copyFile(src, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void webElementScreenShot(WebElement element, String screenShotName) {
		// WebElement userName=driver.findElement(By.id("email"));
		File src = element.getScreenshotAs(OutputType.FILE);

		Long takingTiem = System.currentTimeMillis();

		String destinationPath = "ScreenShots/" + screenShotName + takingTiem + ".png";

		File destinationFile = new File(destinationPath);

		try {
			FileUtils.copyFile(src, destinationFile);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}


	
}
