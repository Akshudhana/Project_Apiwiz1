package com.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.PomPages.LoginPage;

public class BaseClass {

	public PropertyUtils property = new PropertyUtils();
	public static WebDriver driver;
	public WebDriverUtils webDriverUtil = new WebDriverUtils();
	//String Browser="chrome";
	
	/**
	 * To launch the browser,maximizeWindow and waitForPageToLoad 
	 * @throws IOException
	 */
	
	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		String Browser = property.readDataFromPropertyFile("browser");
		String Url = property.readDataFromPropertyFile("url");
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
					
					
		}else if(Browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}else if(Browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}else
		{
			System.out.println("given browser name is not matching");
		}	
		
		//Maximize the browser
		webDriverUtil.maximizeWindow(driver);
		
		//enter url
		driver.get(Url);
		
		//wait for page load
		webDriverUtil.waitForPageLoad(driver, 10);
		
		System.out.println("------Launch the browser------");
	
	}
	
	/**
	 * To login to the application
	 * @throws IOException
	 */
	@BeforeMethod
    public void loginToApp() throws IOException
    {
 	String UserName = property.readDataFromPropertyFile("username"); 
 	 String Password = property.readDataFromPropertyFile("password");
 	
 	 LoginPage login = new LoginPage(driver);
 	login.LoginToApp(driver, UserName, Password);
 	  
 	String ExceptedUrl="https://acme-team-production.apiwiz.io/auth";
	
	String actualUrl=driver.getCurrentUrl();
	System.out.println(actualUrl);
	Assert.assertEquals(actualUrl, ExceptedUrl,"Successfully Login to the application");
	
 	  System.out.println("-----Successfully Login to the application----");
    }
	
	
}
