package org.setpdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableList {

	WebDriver driver;

	@Given("To config browser for flipkart")
	public void to_config_browser_for_flipkart() {

		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}

	@When("To launch flipkart url")
	public void to_launch_flipkart_url() {

		driver.get("https://www.flipkart.com/");
	}

	@When("To pass the values on search box")
	public void to_pass_the_values_on_search_box(io.cucumber.datatable.DataTable dataTable) {

		Assert.assertTrue(false);
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		List<String> asList = dataTable.asList();
		search.sendKeys(asList.get(1));
		
	}

	@When("To click the search buuton")
	public void to_click_the_search_buuton() throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	@Then("To close the flipkart url")
	public void to_close_the_flipkart_url() {
		
		driver.close();
	}

}
