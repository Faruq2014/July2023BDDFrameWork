package com.facebook.hook;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
public class Facebookhook{
	
	
	public WebDriver driver;
	

	@Before
	public void openHook(Scenario scenario) {
		System.out.println(" Scenario:>>> "+scenario.getName()+" >>>>Started");
	
	}
	
	@After
	public void closeApplication(Scenario scenario) {
		Status status=scenario.getStatus();
		//System.out.println("is>>>>"+status);
		if (status.PASSED != null) {
			System.out.println(scenario.getName()+">>>"+status);
		}else if(status.FAILED != null) {
			System.out.println(scenario.getName()+">>>>>"+status);
			//System.out.println("This is after hook+ fail");
		}else {System.out.println(scenario.getName()+" investigate");}
		
		System.out.println(" Scenario :>>>"+scenario.getName()+" >>>Finished");
	}
	
	
	
	
}
