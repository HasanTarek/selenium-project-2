package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import com.pageobjects.BaseClass;

public class CitiDiamondPreferredCreditCardPage extends BaseClass {
	public CitiDiamondPreferredCreditCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public CitiDiamondPreferredCreditCardPage ClickOnNextStepButton() {

		WebElement nextStepButton = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id='cA-DD-cards-details-banner-top-new']/div/div[1]/div[2]/div/a")));

		nextStepButton.click();
		System.out.println("Click On Next Step Button");
		Reporter.log("Click On Next Step Button");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}
		return this;
	}

}
