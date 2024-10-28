package org.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	// create and write datadriven framework

	public static void main(String[] args) throws IOException {

		// location
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\NewTask\\Datas\\Apple.xlsx");

		// File Format
		Workbook w = new XSSFWorkbook();

		// To create sheet
		Sheet createSheet = w.createSheet("Sample");

		// To create Row
		Row createRow = createSheet.createRow(0);

		// To create cell
		Cell createCell = createRow.createCell(0);

		// To set the value
		createCell.setCellValue("Iphone");

		// To write file
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("Written--------");

	}
}
