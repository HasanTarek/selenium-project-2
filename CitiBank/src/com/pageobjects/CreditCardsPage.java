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

public class CreditCardsPage extends BaseClass {
	public CreditCardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public CreditCardsPage ClickOnViewAllCreditCardsLink() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement viewAllCreditCardsLink = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cA-DD-taskbarMenu']/div[1]/div[1]/div/a")));
		viewAllCreditCardsLink.click();
		System.out.println("Click On view All Credit Cards Link");
		Reporter.log("Click On view All Credit Cards Link ");
		return this;
	}
	
	
	
	
	
	
	
	

//	public CreditCardsPage TypeFullName(String incomingValue) {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement fullNameTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullName")));
//		fullNameTextBox.clear();
//		fullNameTextBox.sendKeys(incomingValue);
//		System.out.println("Typed: " + incomingValue + "  in Full NameText Box");
//		Reporter.log("Typed: " + incomingValue + "  in Full Name Text Box");
//		return this;
//	}
//
//	public CreditCardsPage TypeCity(String incomingValue) {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement cityTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
//		cityTextBox.clear();
//		cityTextBox.sendKeys(incomingValue);
//		System.out.println("Typed: " + incomingValue + "  in City Text Box");
//		Reporter.log("Typed: " + incomingValue + "  in City Text Box");
//		return this;
//	}
//
//	public CreditCardsPage TypePhoneNumber(String incomingValue) {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement phoneNumberTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Phone")));
//		phoneNumberTextBox.clear();
//		phoneNumberTextBox.sendKeys(incomingValue);
//		System.out.println("Typed: " + incomingValue + "  in Phone Number Text Box");
//		Reporter.log("Typed: " + incomingValue + "  in Phone Number Text Box");
//		return this;
//	}
//
//	public CreditCardsPage CheckPortfolioManagementCheckBox() {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement portfolioManagementCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//div[2]/div/div[3]/div[2]/div[3]/form/div[9]/div[1]/fieldset/label[1]/span/span[1]")));
//
//		if (!portfolioManagementCheckBox.isSelected()) {
//			portfolioManagementCheckBox.click();
//			System.out.println("Check On portfolio Management Check Box");
//			Reporter.log("Check On portfolio Management Check Box");
//		} else {
//
//			System.out.println("Did not Check On portfolio Management Check Box because already checked");
//			Reporter.log("Did not Check On portfolio Management Check Box because already checked");
//		}
//		return this;
//	}
//
//	public CreditCardsPage CheckIRAPlansCheckBox() {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement iRAPlansCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//div[2]/div/div[3]/div[2]/div[3]/form/div[9]/div[1]/fieldset/label[2]/span/span[1]")));
//
//		if (!iRAPlansCheckBox.isSelected()) {
//			iRAPlansCheckBox.click();
//			System.out.println("Check On IRAP lans Check Box");
//			Reporter.log("Check On IRAP lans Check Box");
//		} else {
//
//			System.out.println("Did not Check On IRAP lans Check Box because already checked");
//			Reporter.log("Did not Check On IRAP lans Check Box because already checked");
//		}
//		return this;
//	}
//
//	public CreditCardsPage CheckInstitutionalCustodyCheckBox() {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement InstitutionalCustodyCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//div[2]/div/div[3]/div[2]/div[3]/form/div[9]/div[1]/fieldset/label[4]/span/span[1]")));
//
//		if (!InstitutionalCustodyCheckBox.isSelected()) {
//			InstitutionalCustodyCheckBox.click();
//			System.out.println("Check On In stitutional Custody Check Box");
//			Reporter.log("Check On In stitutional Custody Check Box");
//		} else {
//
//			System.out.println("Did not Check On In stitutional Custody Check Box because already checked");
//			Reporter.log("Did not Check On In stitutional Custody Check Box because already checked");
//		}
//		return this;
//	}
//
//	public CreditCardsPage CheckInstitutionalEscrowCheckBox() {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement InstitutionalCustody = wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//div[2]/div/div[3]/div[2]/div[3]/form/div[9]/div[1]/fieldset/label[5]/span/span[1]")));
//
//		if (!InstitutionalCustody.isSelected()) {
//			InstitutionalCustody.click();
//			System.out.println("Check On In stitutional Custody Check Box");
//			Reporter.log("Check On In stitutional Custody Check Box");
//		} else {
//
//			System.out.println("Did not Check On In stitutional Custody Check Box because already checked");
//			Reporter.log("Did not Check On In stitutional Custody Check Box because already checked");
//		}
//		return this;
//	}
//
//	public CreditCardsPage CheckFour01KPlansCheckBox() {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement four01KPlansCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//div[2]/div/div[3]/div[2]/div[3]/form/div[9]/div[1]/fieldset/label[3]/span/span[1]")));
//
//		if (!four01KPlansCheckBox.isSelected()) {
//			four01KPlansCheckBox.click();
//			System.out.println("Check On 401(K)Plans Check Box");
//			Reporter.log("Check On 401(K)Plans Check Box");
//		} else {
//
//			System.out.println("Did not Check On 401(K)Plans Check Box because already checked");
//			Reporter.log("Did not Check On 401(K)Plans Check Box because already checked");
//		}
//		return this;
//	}
//
//	public CreditCardsPage UnCheckFour01KPlansCheckBox() {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement Four01KPlansCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//div[2]/div/div[3]/div[2]/div[3]/form/div[9]/div[1]/fieldset/label[3]/span/span[1]")));
//
//		if (!Four01KPlansCheckBox.isSelected()) {
//			System.out.println("Did not uncheck 401(K)Plans Check Box because it was already unchecked");// kisu
//																											// koro
//																											// na
//			Reporter.log("Did not uncheck 401(K)Plans Check Box because it was already unchecked");
//		} else {
//			Four01KPlansCheckBox.click();
//			System.out.println("Uncheck 401KCheckBox Check Box because it was not unchecked");
//			Reporter.log("Uncheck 401KCheckBox Check Box because it was not unchecked");
//		}
//		return this;
//	}
//
//	public CreditCardsPage TypeMessage(String incomingValue) {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement messageTextBox = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.id("labelid-textarea")));
//		messageTextBox.clear();
//		messageTextBox.sendKeys(incomingValue);
//		System.out.println("Typed: " + incomingValue + "  in Message Text Box");
//		Reporter.log("Typed: " + incomingValue + "  in Message Text Box");
//		return this;
//	}
//
//	public CreditCardsPage SelectStateDropDown(String IncomingState) {
//
//		WebElement stateDropDown = (new WebDriverWait(driver, 10))
//				.until(ExpectedConditions.presenceOfElementLocated(By.name("state")));
//
//		Select dropdown = new Select(stateDropDown);
//		dropdown.selectByVisibleText(IncomingState);
//		System.out.println("Select State : " + IncomingState);
//		Reporter.log("Select State  : " + IncomingState);
//		return this;
//	}
}
