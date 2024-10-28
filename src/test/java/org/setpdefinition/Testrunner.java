package org.setpdefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\SmartSkills\\CucumberProject\\src\\main\\resources\\FlipkartLogin.feature",
				glue = "org.setpdefinition",
				monochrome = true,
				dryRun = false,
				strict = true,
				snippets = SnippetType.UNDERSCORE,
				plugin ={"html:HTML Report","junit:JunitReport\\junit.xml","json:JsonReport\\JSON.json",
						"rerun:Rerun\\rerun.txt"} )
				

public class Testrunner {

	@AfterClass
	public static void reports() {
		
		JvmReport.reports("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\SmartSkills\\\\CucumberProject\\\\JsonReport\\\\JSON.json");
		
		
	}
	
	
	
	
	
}

//"@Smoke,@Regression" //OR op
//"@Smoke","@Regression" //And op