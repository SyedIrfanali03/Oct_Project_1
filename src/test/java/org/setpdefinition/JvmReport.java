package org.setpdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void reports(String jsonPath) {
		
		//Folder path
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\SmartSkills\\CucumberProject\\JvmReport");
		
		//Configuration
		Configuration c = new Configuration(f, "Flipkart Search"); 
		
		c.addClassifications("Windows", "version 11");
		c.addClassifications("sprint", "2");
		c.addClassifications("Cucumber version", "4.2");
		c.addClassifications("browser", "chrome");
		
		
		//To add the json path
		
		List<String> l = new ArrayList<String>();
		l.add(jsonPath);
		
		//Build the Report
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
	}
	
	
	

}
