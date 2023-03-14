package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	public static void all_Data() throws IOException {
		File f = new File("C:\\Users\\Lenovo\\Desktop\\DAY28.xlsx");
		FileInputStream fis = new FileInputStream(f);
		 Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		 int numberOfRows = sheet.getPhysicalNumberOfRows();
		 System.out.println( numberOfRows);
		 
		 for(int i = 0; i <numberOfRows; i++) {
			 Row row = sheet.getRow(i);
			 System.out.println();
			 
			 int PhysicalNumberOfCells = row.getPhysicalNumberOfCells();
			 
			 for(int a= 0; a<PhysicalNumberOfCells;a++) {
				 Cell cell = row.getCell(a);
				 System.out.println();
				 CellType cellType = cell.getCellType();
				 if(cellType.equals(cellType.STRING)) {
					 String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue); }
				 
				 else if(cellType.equals(cellType.NUMERIC)) {
					 double numericCellValue = cell.getNumericCellValue();
						System.out.println( numericCellValue );
						
				 }
		
				 else {
						System.out.println("Invalid");
				 }
					 
				 }
			 }
		 }
			 
		 }

