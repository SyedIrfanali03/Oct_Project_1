package org.setpdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@C:\\Users\\Dell\\eclipse-workspace\\SmartSkills\\CucumberProject\\Rerun\\rerun.txt",
				glue = "org.setpdefinition",
				monochrome = true)


public class Test {

}
