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
		String expectedTitle = driver.getTitle();
		Assert.assertEquals("Title din not match", expectedTitle, expectedTitle);

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

	public void closeApp() {
		driver.quit();
	}

}
