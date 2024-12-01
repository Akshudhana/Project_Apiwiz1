package com.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils 
{
	/**
	 * To handle the synchronization problem
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver, int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		
	}
	/**
	 * To maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
		
	}
	
	/**
	 * To minimize the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
			
	}

		
	/**
	 * This method is used to take the screenshot of webPage
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	public String takescreenshot(WebDriver driver,String screenshotName) throws IOException 
	{
		javaUtils ju = new javaUtils();
		
//		LocalDateTime DataTime = LocalDateTime.now();
	    //System.out.println("current date and time-->"+" "+DataTime);
	    
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\Screeshot\\"+ju.getSystemDateInFormat()+".png";
		File destination = new File(path);
		String srcPath = destination.getAbsolutePath();
		FileUtils.copyFile(src, destination);
		return srcPath;
		
		
	}
	
}
