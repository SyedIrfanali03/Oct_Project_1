package org.setpdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook {
	
	WebDriver driver;
	
	@Given("To configure the browser")
	public void to_configure_the_browser() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@When("To launch facebook application")
	public void to_launch_facebook_application() {
		
		driver.get("https://www.facebook.com/");
	   
	}

	@When("To enter valid username on email textbox")
	public void to_enter_valid_username_on_email_textbox() {
		
		WebElement email = driver.findElement(By.id("email"));
	   email.sendKeys("selenium@gmail.com");
	}

	@When("To enter valide password on password textbox")
	public void to_enter_valide_password_on_password_textbox() {
	    
		WebElement pass = driver.findElement(By.name("pass"));
		   pass.sendKeys("12345");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	   
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	 
		//driver.quit();
	}


	
	
	
	
	

}
