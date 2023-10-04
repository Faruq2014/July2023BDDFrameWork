package com.facebook.stepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
				"html:target/CucumberReport.html",
				"json:target/cucumber-report.json",
				"junit:target/cucumber-report.xml"
				},
		snippets=SnippetType.CAMELCASE,	
				//snippets=SnippetType.UNDERSCORE,
		features="src/test/resources/Features",
				tags="@regression",
		//glue= {"stepDefinations"},
				glue="com.facebook.stepDefinations",
		//dryRun=false,
		monochrome = true
		
		
		)
public class FacebookRunner {

}
