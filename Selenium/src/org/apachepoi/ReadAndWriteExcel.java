package org.apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcel {
	public static void createExcelWorkbook() throws IOException
	{
		File objFile_ExcelLocation = new File("E:\\Selenium\\ForSeleniumWorkbookCreation.xlsx");
		FileOutputStream objFileOutputStream_ExcelWorkbook = new FileOutputStream(objFile_ExcelLocation);
		XSSFWorkbook objXSSFWorkbook = new XSSFWorkbook();
//		objXSSFWorkbook.createSheet();
//		objXSSFWorkbook.setSheetName(0, "newSheet");
		objXSSFWorkbook.write(objFileOutputStream_ExcelWorkbook);
		objXSSFWorkbook.close();
		
	}
	
	public static void createExcelWorkSheet(String strSheetName) throws IOException
	{
		File objFile_ExcelLocation = new File("E:\\Selenium\\ForSeleniumWorkbookCreation.xlsx");
		FileInputStream objFileInputStream = new FileInputStream(objFile_ExcelLocation);
		XSSFWorkbook objXSSFWorkbook = new XSSFWorkbook(objFileInputStream);
		objXSSFWorkbook.createSheet(strSheetName);
		FileOutputStream objFileOutputStream_ExcelWorkbook = new FileOutputStream(objFile_ExcelLocation);
		objXSSFWorkbook.write(objFileOutputStream_ExcelWorkbook);
		objXSSFWorkbook.close();
		
	}
	
	public static void UpdateExcelSheetName() throws IOException
	{
		File objFile_ExcelLocation = new File("E:\\Selenium\\ForSeleniumWorkbookCreation.xlsx");
		FileOutputStream objFileOutputStream_ExcelWorkbook = new FileOutputStream(objFile_ExcelLocation);
		XSSFWorkbook objXSSFWorkbook = new XSSFWorkbook();
		objXSSFWorkbook.setSheetName(0, "newSheet");
		objXSSFWorkbook.write(objFileOutputStream_ExcelWorkbook);
		objXSSFWorkbook.close();
		
	}
	
	public static void main(String[] args) {
		File objFile_ExcelLocation = new File("E:\\Selenium\\ForSelenium.xlsx");
		try {
			//	createExcelWorkbook();
			FileInputStream objFileInputStream_ExcelWorkbook = new FileInputStream(objFile_ExcelLocation);
			XSSFWorkbook objXSSFWorkbook = new XSSFWorkbook(objFileInputStream_ExcelWorkbook);
			
			//getting a sheet and getting a cell value
			XSSFSheet objXSSFSheet = objXSSFWorkbook.getSheet("Sheet1"); 
			System.out.println(objXSSFSheet.getRow(0).getCell(0).getStringCellValue());
			
			//Get number of sheets in workbook
			System.out.println(objXSSFWorkbook.getNumberOfSheets());
			
			//Get the last row number
			System.out.println(objXSSFSheet.getLastRowNum());
			
			//Get the last used column number for the given row
			System.out.println(objXSSFSheet.getRow(0).getLastCellNum());
			
			
			objFileInputStream_ExcelWorkbook.close();
			
			
			//Update data in excel
			FileOutputStream objFileOutputStream_ExcelWorkbook = new FileOutputStream(objFile_ExcelLocation);
			
			objXSSFSheet.getRow(1).getCell(1).setCellValue("test");
			
			//Create new row  and column to update value
			objXSSFSheet.createRow(2);
			objXSSFSheet.getRow(2).createCell(0);
			objXSSFSheet.getRow(2).getCell(0).setCellValue("test");
			
			
			objXSSFWorkbook.write(objFileOutputStream_ExcelWorkbook);
			objXSSFWorkbook.close();
			objFileOutputStream_ExcelWorkbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
