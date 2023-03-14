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

public class DataRead {
	public static void getData() throws IOException {
		File f = new File("C:\\Users\\Lenovo\\Desktop\\DAY28.xlsx");
		FileInputStream fis = new FileInputStream(f);
		 Workbook wb = new XSSFWorkbook(fis);
		 Sheet sheetAt = wb.getSheetAt(0);
	Row row = sheetAt.getRow(3);
		 Cell cell = row.getCell(0);
		 CellType cellType = cell.getCellType();
		 
		 if(cellType.equals(cellType.STRING)) {
			 String stringCellValue = cell.getStringCellValue();
			 System.out.println("cell value is:" + stringCellValue);
			 	 }
		 else if (cellType.equals(cellType.NUMERIC)) {
			 double numericCellValue = cell.getNumericCellValue();
			 System.out.println("cell value is:" + numericCellValue);
			 
		 }else { System.out.println("Invalid cell Type");
		 
		 }
		 
	}
	public static void main(String[] args) throws IOException
	{
		getData();
	}
	
	
	
	}

	


