package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Datadriven_Write {
	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\Users\\Lenovo\\Desktop\\DAY28.xlsx");
		FileInputStream fis = new FileInputStream(f);
		 Workbook wb = new XSSFWorkbook(fis);
	//	 Sheet createSheet = wb.createSheet("sheet3");
		// Row createRow = createSheet.createRow(0);
	//	 Cell createCell = createRow.createCell(0);
	//	 createCell.setCellValue("Empolyee name:");
		 
		 wb.createSheet("sheet4").createRow(1).createCell(0).setCellValue("Empolyee name:");

		 
	 FileOutputStream fos = new  FileOutputStream(f);
		 wb.write(fos);
		 
		
		 
	}	 
		 
	}

	

