package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.pageobjects.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public HomePage ClickOnSignInToYourAccountDropDown() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement yourAccountDropDown = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("accounts-select-button")));
		yourAccountDropDown.click();
		System.out.println("Click On Sign In To Your Account Drop Down");
		Reporter.log("Click On Sign In To Your Account Drop Down");
		return this;
	}

	public HomePage SelectAnAccount(int IncomingAccount) {
		// presenceOfElementLocated
		WebElement accountOptions = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//li[@id='accounts-select-menu-option-" + IncomingAccount + "']")));
		accountOptions.click();
		System.out.println("Select Option : " + IncomingAccount);
		Reporter.log("Select Option  : " + IncomingAccount);
		return this;
	}

}
