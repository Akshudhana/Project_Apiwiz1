package com.ApiWizProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.PomPages.ApiLintingPage;
import com.genericUtility.BaseClass;

@Listeners(com.genericUtility.ListImpClass.class)
public class CreatingApiLinting extends BaseClass{

	@Test
	public void creatingLinting() throws InterruptedException {
		String name="qa-testing";
		String rulesetdiscription="qa-testing";
		ApiLintingPage apilintingg=new ApiLintingPage(driver);
		apilintingg.ApiLintingCreate(driver,name, rulesetdiscription, "info-tittle", "Ensure all the swaggers has tittle tags", "$.info.tittle");
	}
}
