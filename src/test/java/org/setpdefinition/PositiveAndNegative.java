package org.setpdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveAndNegative {

	WebDriver driver;

	@Given("config the valid browser")
	public void config_the_valid_browser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("Launch the valid url")
	public void launch_the_valid_url() {
		
		driver.get("https://www.facebook.com/");
	}

	@When("To pass the valid and invalid {string} on email")
	public void to_pass_the_valid_and_invalid_on_email(String emailData) {
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(emailData);
		
	}

	@When("To pass the valid and invalid {string} on password")
	public void to_pass_the_valid_and_invalid_on_password(String passwordData) {
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(passwordData);
	}

	@When("To enter the login button")
	public void to_enter_the_login_button() {
		
		WebElement btn = driver.findElement(By.xpath("//button[text()='Log in']"));
		btn.click();
	}

	@Then("clos the particular tab")
	public void clos_the_particular_tab() {
		driver.close();
		
	}

}
