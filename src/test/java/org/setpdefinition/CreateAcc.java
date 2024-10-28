package org.setpdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAcc {

	WebDriver driver;

	@Given("To cofigure the browser for fb")
	public void to_cofigure_the_browser_for_fb() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("To launch fb url")
	public void to_launch_fb_url() {

		driver.get("https://www.facebook.com/");
	}

	@When("To enter the create new account button")
	public void to_enter_the_create_new_account_button() {

		WebElement createBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createBtn.click();
	}

	@When("To pass the value on firstname") //1 dia map
	public void to_pass_the_value_on_firstname(io.cucumber.datatable.DataTable dataTable) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		firstname.sendKeys(asMap.get("name2"));

	}

	@When("To pass the number on phone number field") //2 dia map
	public void to_pass_the_number_on_phone_number_field(io.cucumber.datatable.DataTable dataTable) {

		WebElement phnNum = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		
		List<Map<String, String>> asMaps = dataTable.asMaps();
		phnNum.sendKeys(asMaps.get(0).get("number2"));
		
	}

	@Then("To quit the fb tab")
	public void to_quit_the_fb_tab() {
		//driver.close();
	}

}
