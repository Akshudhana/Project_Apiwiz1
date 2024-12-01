package com.genericUtility;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ListImpClass implements ITestListener{
	ExtentReports report;
	ExtentTest test;
	javaUtils javautil=	new javaUtils();
	//WebDriver driver;
	
	@Override
	public void onTestStart(ITestResult result) {
	//Execution starts from here
		String methodName=	result.getMethod().getMethodName();
		test=report.createTest(methodName);
		
		Reporter.log(methodName+"---> Execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=	result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+"-->Passes");
		Reporter.log(methodName+"-->TestScript executed succesfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		WebDriverUtils webDriverUtilsobject=new WebDriverUtils();
		
		
	
		try {
			String methodName=	result.getMethod().getMethodName();
			String screenShotPath=webDriverUtilsobject.takescreenshot(BaseClass.driver,methodName);
			test.log(Status.FAIL, methodName+"------>Failed");
			test.log(Status.FAIL, result.getThrowable());
			Reporter.log(methodName+"--->Failed");
			test.addScreenCaptureFromPath(screenShotPath);
			} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

	//@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+"--->Skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodName+"-->Skipped");
			}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		javaUtils javautil=new javaUtils();
		
//		LocalDateTime DataTime = LocalDateTime.now();
//	    System.out.println("current date and time-->"+" "+DataTime);
		
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".//ExtentReport//report"+javautil.getSystemDateInFormat()+".html");
		//It will create one emptyPage
		htmlReport.config().setDocumentTitle("APIWIZ");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setReportName("Akshatha");
		
		//ExtentReports report=new ExtentReports();
		
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		
		report.setSystemInfo("Base platform", "Windows 11");
	report.setSystemInfo("Base Browser", "chrome");
	report.setSystemInfo("Base URL", "https://acme-team-production.apiwiz.io/auth");
	report.setSystemInfo("Reporter name", "Akshatha");	
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	} 
}
