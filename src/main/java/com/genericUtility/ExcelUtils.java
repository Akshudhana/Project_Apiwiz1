package com.genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;



public class ExcelUtils {
	/**
	 * this method used to read the data from excel sheet
	 * 
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @return cell value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcelFile(String SheetName, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fi = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		String value = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();

		return value;

	}

	/**
	 * 
	 * @param sheetName
	 * @return return index of last row
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getLastRowno(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		return rowCount;
	}

	public void writeDataIntoExcel(String Sheet, int cell, String value)
			throws EncryptedDocumentException, IOException {

		FileInputStream fi = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		wb.getSheet(value).getRow(cell).createCell(cell).setCellValue(false);

		FileOutputStream fout = new FileOutputStream(IpathConstants.ExcelPath);
		wb.write(fout);
		wb.close();

	}

	public HashMap<String, String> readMultipleData(String sheetName, int cell, WebDriver driver)
			throws EncryptedDocumentException, IOException {
		FileInputStream fi = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
		HashMap<String, String> map = new HashMap<String, String>(); // empty
		for (int i = 0; i <= rowCount; i++) {
			String key = sh.getRow(i).getCell(cell).getStringCellValue();
			String value = sh.getRow(i).getCell(cell + 1).getStringCellValue();
			map.put(key, value);
		}
		return map;

	}

	@DataProvider
	public Object[][] excelData(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ApiWizTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rowNum = sheet.getLastRowNum()+1;
		 int cellNum = sheet.getRow(0).getLastCellNum();
		 
		 Object[][] object = new Object[rowNum][cellNum];
		 
		 for(int i = 0 ; i<rowNum ; i++)
		 {
			 for(int j=0 ; j<cellNum ; j++)
			 {
				 object[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			 }
			 
		 }
		
		 return object;
		
		
		
		
		
	}
}
