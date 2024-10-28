package org.setpdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon {

	WebDriver driver;

	@Given("To configure the browser for amazon")
	public void to_configure_the_browser_for_amazon() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("To launch the amazon url")
	public void to_launch_the_amazon_url() {

		driver.get("https://www.amazon.in/");
	}

	@When("To pass the value on amazon search box")
	public void to_pass_the_value_on_amazon_search_box(io.cucumber.datatable.DataTable dataTable) {

		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));

		List<List<String>> asLists = dataTable.asLists();
		search.sendKeys(asLists.get(1).get(0));

	}

	@When("To tap the search button")
	public void to_tap_the_search_button() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("To close the amazon browser")
	public void to_close_the_amazon_browser() {

		driver.close();
	}

}
