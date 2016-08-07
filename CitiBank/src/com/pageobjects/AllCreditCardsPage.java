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

public class AllCreditCardsPage extends BaseClass {
	public AllCreditCardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public AllCreditCardsPage ClickOnFirstCreditCardApplyButton() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement FirstCreditCardApplyButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cA-DD-cardsResults']/div[1]/div/a")));
		FirstCreditCardApplyButton.click();
		System.out.println("Click On First Credit Card Apply Button");
		Reporter.log("Click On First Credit Card Apply Button");
		return this;
	}

}
