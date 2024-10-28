package org.setpdefinition;

import org.baseclass.HelperClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends HelperClass  {

	
	
	@Before(order = 1)
	public static void preCondition() {
		
		chromeBrowserConfiguration();
		
		System.out.println("After browser configured");

	}
	
	
	@Before(order = 2)
	public static void max() {
		maxWindow();

	}
	
	@Before(order = 3)
	public static void screenShort() {
		System.out.println("Take screenshort before");

	}
	
	
	@After(order = 10)
	public static void screen(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] screenshotAs = t.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			System.out.println("Failed Scenario Name : "+s.getName());
			
		}

	}
	
	
	
	@After(order = 7)
	public static void postCond() {
		System.out.println("Before Close ");
		closeBrowser();

	}
	
	
	
	
}
