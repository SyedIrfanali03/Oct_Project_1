package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pm.Pojo;

public class Sample extends HelperClass {

	public static void main(String[] args) throws IOException {

		

		chromeBrowserConfiguration();
		launchUrl("https://www.facebook.com/");
		maxWindow();

		Pojo p = new Pojo();
		
		WebElement email = p.getEmail();
		String data = excelData("C:\\Users\\Dell\\eclipse-workspace\\NewTask\\Datas\\Book1.xlsx", "Sheet1", 1, 1);
		fillTxtBox(email, data);
		
		driver.navigate().refresh();
		
		WebElement pass = p.getPass();
		fillTxtBox(pass, "12345");
		
		WebElement button = p.getButton();
		buttonClick(button);
		

	}

}
