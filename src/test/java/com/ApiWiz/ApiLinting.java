package com.ApiWiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.PomPages.ApiLintingPage;
import com.genericUtility.BaseClass;
import com.genericUtility.ExcelUtils;


@Listeners(com.genericUtility.ListImpClass.class)
public class ApiLinting extends BaseClass{

	
	@Test
public void createingLinting1() throws InterruptedException, EncryptedDocumentException, IOException {
		
//		ExcelUtils excel=new ExcelUtils();
//		String name = excel.readDataFromExcelFile("Sheet1", 1, 0);
//		String description = excel.readDataFromExcelFile("Sheet1", 1, 1);
//		
//		excel.readMultipleData("Sheet1", 0, driver);
		String name="qa-testing";
		String rulesetdiscription="qa-testing";
		
		//Created apiLintingpage Object
		ApiLintingPage apilintingg=new ApiLintingPage(driver);
      apilintingg.ApiLintingCreate(driver,name, rulesetdiscription, "info-tittle", "Ensure all the swaggers has tittle tags", "$.info.tittle");
}
}
