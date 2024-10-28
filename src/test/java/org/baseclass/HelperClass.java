package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HelperClass {

	public static WebDriver driver;
	public static Actions a;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;

	public static void chromeBrowserConfiguration() {

		driver = new ChromeDriver();

	}

	public static void fireFoxBrowser() {

		driver = new FirefoxDriver();

	}

	public static void launchUrl(String url) {

		driver.get(url);

	}

	public static void maxWindow() {

		driver.manage().window().maximize();

	}

	public static void fillTxtBox(WebElement element, String values) {

		element.sendKeys(values);

	}

	public static void buttonClick(WebElement element) {

		element.click();

	}

	public static void title() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void url() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void implicitlyWait(long time) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}

	public static void thread(long time) throws InterruptedException {

		Thread.sleep(time);

	}

	public static void moveToElement(WebElement element) {

		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void screenShort(String location) throws IOException {

		ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File destFile = new File(location);
		FileUtils.copyFile(source, destFile);

	}

	public static void script(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute(value,'selenium')", element);

	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void dateTime() {

		Date d = new Date();
		System.out.println(d);

	}

	public static String excelData(String location, String sheetName, int row, int cells) throws IOException {

		// File Location
		File f = new File(location);

		// To read the file
		FileInputStream fis = new FileInputStream(f);

		// To read file with format
		// upcasting

		Workbook w = new XSSFWorkbook(fis);
		
		// To get the sheet from excel
		Sheet s = w.getSheet(sheetName);

		Row r = s.getRow(row);

		Cell cell = r.getCell(cells);

		String value = "";

		int cellType = cell.getCellType();

		if (cellType == 1)// Represent like String
		{
			value = cell.getStringCellValue();
			// System.out.println(value);
		}

		else if (DateUtil.isCellDateFormatted(cell)) {

			Date dd = cell.getDateCellValue();
			SimpleDateFormat sd = new SimpleDateFormat("DD-MM-YY");
			value = sd.format(dd);
			// System.out.println(value);

		} else {

			double num = cell.getNumericCellValue();// 12345.0
			// downcasting
			long l = (long) num;// 12345
			value = String.valueOf(l);
			// System.out.println(value);

		}

		return value;

	}

}
