package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	
	public static void main(String[] args) throws IOException {
		
		
		//File Location
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\NewTask\\Datas\\Book1.xlsx");
		
		//To read the file 
		FileInputStream fis = new FileInputStream(f);
		
		//To read file with format
		//upcasting
		
		Workbook w = new XSSFWorkbook(fis);
		
		//To get the sheet from excel
		Sheet s = w.getSheet("Sheet1");
		
			Row r = s.getRow(0);
			
			Cell cell = r.getCell(0);
				
				String value ="";
				
				int cellType = cell.getCellType();
				
				if (cellType == 1)//Represent like String
				{
					 value = cell.getStringCellValue();
					//System.out.println(value);
				}
				
				else if (DateUtil.isCellDateFormatted(cell)) {
					
					Date dd = cell.getDateCellValue();
					SimpleDateFormat sd = new SimpleDateFormat("DD-MM-YY");
					 value = sd.format(dd);
					//System.out.println(value);
					
				}
				else {
					
					double num = cell.getNumericCellValue();//12345.0
					//downcasting
					long l =(long)num;//12345
					 value = String.valueOf(l);
					//System.out.println(value);
					
				}
				
				
				
			

}

}
