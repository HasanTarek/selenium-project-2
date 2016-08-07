package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.pageobjects.AllCreditCardsPage;
import com.pageobjects.ApplicationPage;
import com.pageobjects.BaseClass;
import com.pageobjects.CitiDiamondPreferredCreditCardPage;
import com.pageobjects.CreditCardsPage;
import com.pageobjects.HomePage;

public class CitiBankTest extends BaseClass {

	@Test
	public void testcase1() throws InterruptedException {

		HomePage HomePG = PageFactory.initElements(driver, HomePage.class);
		CreditCardsPage CreditCasrsPG = PageFactory.initElements(driver, CreditCardsPage.class);
		AllCreditCardsPage AllCreditCardsPG = PageFactory.initElements(driver, AllCreditCardsPage.class);
		CitiDiamondPreferredCreditCardPage CitiDiamondPreferredCreditCardPG = PageFactory.initElements(driver, CitiDiamondPreferredCreditCardPage.class);
		ApplicationPage ApplicationPG = PageFactory.initElements(driver, ApplicationPage.class);
		
		HomePG.ClickOnSignInToYourAccountDropDown();
//		Thread.sleep(5000);
		HomePG.SelectAnAccount(5);
		CreditCasrsPG.ClickOnViewAllCreditCardsLink();
//		Thread.sleep(5000);
		AllCreditCardsPG.ClickOnFirstCreditCardApplyButton();
//		Thread.sleep(5000);
		CitiDiamondPreferredCreditCardPG.ClickOnNextStepButton();
		ApplicationPG.TypeOnFirstNameTextBox("AAA");
		ApplicationPG.TypeOnLastNameTextBox("BBB");
		ApplicationPG.ClickOnAddress();
		ApplicationPG.TypeOnHomeTextBox("12-3 still street");	
		ApplicationPG.TypeOnCitiTextBox("DHK");
		ApplicationPG.SelectStateDropDown("Florida");
		ApplicationPG.ClickOnSocialSecurityNumber();
		ApplicationPG.TypeOnSocialSecurityTextBox("333333333");
		ApplicationPG.CheckInUsCitizenYesCheckBox();
	}
	

}
