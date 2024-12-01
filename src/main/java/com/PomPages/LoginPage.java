package com.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Stored all the xpath of login page elements
 */
public class LoginPage {

	//Decleration
	@FindBy(xpath="//input[@placeholder='Enter Username']")
	private WebElement userNameTextField;
	
	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//p[@class='text-white dfs-13px fw-500']")
	private WebElement loginButton;
	
	//initilization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	
	//bussiness Logic
	public void LoginToApp(WebDriver driver,String username,String password) {
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
		
		
	}
	
}
