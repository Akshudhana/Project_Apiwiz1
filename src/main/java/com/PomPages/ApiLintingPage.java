package com.PomPages;

import java.nio.file.WatchEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ApiLintingPage {

	String ExpectedURL="https://acme-team-production.apiwiz.io/api-linting";
	String ExpectedrulesetCreatedSuccesfulMsg="Ruleset created successfully";
	String ExpectedToValidatelintingText="qa-testing";
	String ExpextedRulesimportedsuccessfullyMsg="Rules imported successfully";
	String ExpectedSwaggerisassignedsuccessfully="Swagger is assigned successfully";
	String ExpectedlintingStratedSuccesMsg="Linting started successfully";
	
	//Decleration
	@FindBy(xpath = "(//*[name()='svg' and @class='color-text-regular'])[3]")
	private WebElement apiLintingButton;
	
	@FindBy(xpath = "//div[@class='ripple-btn']/ancestor::div[@title='Add Ruleset']")
	private WebElement addRulesetButton;
	
	@FindBy(xpath = "//input[@id='Create new ruleset']")
	private WebElement createRuleSetButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter Ruleset Name']")
	private WebElement ruleSetNameTextField;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	private WebElement ruleSetDescriptionTextField;
	
	@FindBy(xpath = "//div[@class='btn-primary text-white fs-13px fw-600 cursor-pointer']")
	private WebElement ruleSetSaveButton;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement rulesetCreatedSuccesfulMsg;
	
	@FindBy(xpath = "//p[@class='color-text-subdued fs-12px fw-500 text-nowrap']/preceding-sibling::p")
	private List<WebElement> AllTheRuleSetData;
	
	@FindBy(xpath = "//p[@class='fw-500 fs-14px color-text-heading' and text()='Rules']")
	private WebElement rulesButton;
	
	@FindBy(xpath = "//p[@class='color-text-regular fs-13px fw-600 lh-16px' and text()='qa-testing']")
	private WebElement ToValidatelintingText;
	
	@FindBy(xpath = "//p[@class='fw-600 fs-12px color-text-regular']")
	private WebElement addRulesButton;
	
	@FindBy(xpath = "//p[@class='fs-12px fw-500 color-text-regular' and text()='New Rule']")
	private WebElement newRulesButton;
	
	@FindBy(xpath = "//input[@placeholder='Name of Rule']")
	private WebElement nameOfRuleTextFiled;
	
	@FindBy(xpath = "//textarea[@placeholder='description of Rule']")
	private WebElement discriptionOfRuleTextFiled;
	
	@FindBy(xpath = "//input[@placeholder='Object path comes here']")
	private WebElement objectPathTextField;
	
	@FindBy(xpath = "//p[text()='New Rule']/ancestor::div[@class='flex-row vt-center hz-space-between px-6px border-bottom-stroke-section-1px h-36px']/descendant::div[@class='flex-row vt-center gap-4px'][2]")
	private WebElement ruleSaveButton;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
	private WebElement RulesimportedsuccessfullyMsg;
	
	@FindBy(xpath = "//div[@class='cursor-pointer flex-center bg-surface-ground']")
	private WebElement associationLink;
	
	@FindBy(xpath = "//div[@class='color-text-regular fs-13px fw-500']/ancestor::div[@class='flex-row vt-center cursor-pointer gap-8px pl-16px m-8px hover-surface-bg-underground']/descendant::div[@class='cursor-pointer']")
	private WebElement uberApiCheckBox;
	
	@FindBy(xpath = "//p[text()='Add Swaggers']/ancestor::div[@class='h-36px flex-row vt-center hz-space-between px-8px border-bottom-stroke-section-1px']/descendant::div[@data-tooltip-place='top'][2]")
    private WebElement addSwaggerSaveButton;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    private WebElement SwaggerisassignedsuccessfullyMsg;
	
	@FindBy(xpath = "(//*[name()='svg' and @class='color-text-subtle'])[7]")
	private WebElement runSwaggerButton;
	
	@FindBy(xpath = "//div[@class='color-text-regular fs-13px fw-500']/ancestor::div[@class='flex-row vt-center cursor-pointer gap-8px pl-16px m-8px hover-surface-bg-underground']/descendant::div[@class='cursor-pointer']")
    private WebElement uberApiCheckBoxInRunSwaggerButton;
	
	@FindBy(xpath = "//div[@class='flex-row vt-center border-stroke-section-1px bg-surface-l1 gap-4px br-6px px-8px py-5px cursor-pointer']")
    private WebElement ExecuteButtonInrunSwagger;
	
	@FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    private WebElement lintingStratedSuccesMsg;
	
	//initilization
	public ApiLintingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public String getExpectedrulesetCreatedSuccesfulMsg() {
		return ExpectedrulesetCreatedSuccesfulMsg;
	}

	public String getExpectedToValidatelintingText() {
		return ExpectedToValidatelintingText;
	}

	public String getExpextedRulesimportedsuccessfullyMsg() {
		return ExpextedRulesimportedsuccessfullyMsg;
	}

	public String getExpectedSwaggerisassignedsuccessfully() {
		return ExpectedSwaggerisassignedsuccessfully;
	}

	public String getExpectedlintingStratedSuccesMsg() {
		return ExpectedlintingStratedSuccesMsg;
	}

	public WebElement getApiLintingButton() {
		return apiLintingButton;
	}

	public WebElement getAddRulesetButton() {
		return addRulesetButton;
	}

	public WebElement getCreateRuleSetButton() {
		return createRuleSetButton;
	}

	public WebElement getRuleSetNameTextField() {
		return ruleSetNameTextField;
	}

	public WebElement getRuleSetDescriptionTextField() {
		return ruleSetDescriptionTextField;
	}

	public WebElement getRuleSetSaveButton() {
		return ruleSetSaveButton;
	}

	public WebElement getRulesetCreatedSuccesfulMsg() {
		return rulesetCreatedSuccesfulMsg;
	}

	public WebElement getRulesButton() {
		return rulesButton;
	}

	public WebElement getToValidatelintingText() {
		return ToValidatelintingText;
	}

	public WebElement getAddRulesButton() {
		return addRulesButton;
	}

	public WebElement getNewRulesButton() {
		return newRulesButton;
	}

	public WebElement getNameOfRuleTextFiled() {
		return nameOfRuleTextFiled;
	}

	public WebElement getDiscriptionOfRuleTextFiled() {
		return discriptionOfRuleTextFiled;
	}

	public WebElement getObjectPathTextField() {
		return objectPathTextField;
	}

	public WebElement getRuleSaveButton() {
		return ruleSaveButton;
	}

	public WebElement getRulesimportedsuccessfullyMsg() {
		return RulesimportedsuccessfullyMsg;
	}

	public WebElement getAssociationLink() {
		return associationLink;
	}

	public WebElement getUberApiCheckBox() {
		return uberApiCheckBox;
	}

	public WebElement getAddSwaggerSaveButton() {
		return addSwaggerSaveButton;
	}

	public WebElement getSwaggerisassignedsuccessfullyMsg() {
		return SwaggerisassignedsuccessfullyMsg;
	}

	public WebElement getRunSwaggerButton() {
		return runSwaggerButton;
	}

	public WebElement getUberApiCheckBoxInRunSwaggerButton() {
		return uberApiCheckBoxInRunSwaggerButton;
	}

	public WebElement getExecuteButtonInrunSwagger() {
		return ExecuteButtonInrunSwagger;
	}

	public WebElement getLintingStratedSuccesMsg() {
		return lintingStratedSuccesMsg;
	}
	
	//bussiness Logic
	public void ApiLintingCreate(WebDriver driver,String ruleSetName,String ruleSetDescription,String nameOfRule,String discriptionOfRule,String objectPath) throws InterruptedException {
		apiLintingButton.click();
		
		
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, ExpectedURL);
		System.out.println("--APIwiz Linting Dashboard opened successfully--");
		
		addRulesetButton.click();
		System.out.println("--Add ruleset popup window open succefully--");
		
		createRuleSetButton.click();
		System.out.println("--Create ruleset radio button is clicked succesfully--");
		
		Thread.sleep(2000);
		
		ruleSetNameTextField.sendKeys(ruleSetName);
		ruleSetDescriptionTextField.sendKeys(ruleSetDescription);
		ruleSetSaveButton.click();
		
		String ActualrulesetCreatedSuccesfulMsg=rulesetCreatedSuccesfulMsg.getText();
		Assert.assertEquals(ActualrulesetCreatedSuccesfulMsg, ExpectedrulesetCreatedSuccesfulMsg);
		System.out.println("--"+ActualrulesetCreatedSuccesfulMsg+"displayed--");
		
		Thread.sleep(2000);
		
		Boolean flag=false;
		
		int count=0;
		
		System.out.println(" ");
		System.out.println("-------------------------");
		System.out.println("--All the defined rulesets in your workspace.--");
		
	
		 for(WebElement w:AllTheRuleSetData) {
			String getText1=w.getText().trim();
			System.out.println(getText1);
			count++;
			try {
				if(getText1.equals(ruleSetName)) {

					JavascriptExecutor js=(JavascriptExecutor) driver;
					   js.executeScript("arguments[0].click()", w);
					
	                flag = true;
	                break; 
				}
			} 
			
			catch (Exception e) {
				System.out.println("Element not clickable: " + e.getMessage());
			}
		}
		 System.out.println("----------------------------------------------");
		 System.out.println("--Total count of created ruleset"+"-->"+count);
		
		 System.out.println(" ");
		 
		rulesButton.click();
		String ActualToValidatelintingText=ToValidatelintingText.getText();
		Assert.assertEquals(ActualToValidatelintingText, ExpectedToValidatelintingText);
	
		System.out.println("--The created ruleset is clicked to create a new rule--");
		
		Thread.sleep(3000);
	   
		addRulesButton.click();
		System.out.println("--Add rule button clicked succefully--");
		
		newRulesButton.click();
		System.out.println("--New rule button clicked succefully--");
		
		nameOfRuleTextFiled.sendKeys(nameOfRule);
		discriptionOfRuleTextFiled.sendKeys(discriptionOfRule);
		objectPathTextField.sendKeys(objectPath);
		ruleSaveButton.click();
		String ActualRulesimportedsuccessfullyMsg=RulesimportedsuccessfullyMsg.getText();
		Assert.assertEquals(ActualRulesimportedsuccessfullyMsg,ExpextedRulesimportedsuccessfullyMsg);
	   System.out.println("--"+ActualRulesimportedsuccessfullyMsg+"displayed--");
	   
		associationLink.click();
		System.out.println("--Attached a OAS spec to the Ruleset successfully--");
		
		uberApiCheckBox.click();
		addSwaggerSaveButton.click();
		
		Thread.sleep(3000);
		
		String ActualSwaggerisassignedsuccessfully=SwaggerisassignedsuccessfullyMsg.getText();
		Assert.assertEquals(ActualSwaggerisassignedsuccessfully, ExpectedSwaggerisassignedsuccessfully);
	    System.out.println("--"+ActualSwaggerisassignedsuccessfully+" displayed--");
	  
		Thread.sleep(3000);
		
		runSwaggerButton.click();
		System.out.println("--Successfully ran the linting rules on the OAS specification");
		
		uberApiCheckBoxInRunSwaggerButton.click();
		ExecuteButtonInrunSwagger.click();
		String ActuallintingStratedSuccesMsg=lintingStratedSuccesMsg.getText();
		Assert.assertEquals(ActuallintingStratedSuccesMsg, ExpectedlintingStratedSuccesMsg);
	    System.out.println("--"+ActuallintingStratedSuccesMsg+" displayed--");
		
	}






}
