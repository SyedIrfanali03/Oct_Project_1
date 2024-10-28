package org.pm;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends HelperClass {

	// constructor
	// private webelements

	public Pojo() { // StaleElement Reference Exception

		PageFactory.initElements(driver, this);
		 
	}
	
	
	@CacheLookup
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@CacheLookup
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement pass;
	
	
	//@findBys               //Or operator
	@CacheLookup
	@FindAll({
			@FindBy(xpath="//button[@name='login']"),   //T
			@FindBy(xpath="//button[text()='Log i']")}) //F
	
	private WebElement button;
	
	
	
	public WebElement getButton() {
		return button;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	// Source --> generate ----> getters

	
	
}
