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

public class ApplicationPage extends BaseClass {
	public ApplicationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public ApplicationPage TypeOnFirstNameTextBox(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement firstNameTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FIRST_NAME")));
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + "  in First NameText Box");
		Reporter.log("Typed: " + incomingValue + "  in First Name Text Box");
		return this;
	}

	public ApplicationPage TypeOnLastNameTextBox(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement lastNameTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LAST_NAME")));
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + "  in Last NameText Box");
		Reporter.log("Typed: " + incomingValue + "  in Last Name Text Box");
		return this;
	}

	public ApplicationPage ClickOnAddress() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Address = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='addressSection']/div/div[1]")));
		Address.click();
		System.out.println("Click On Address");
		Reporter.log("Click On Address");
		return this;
	}

	public ApplicationPage TypeOnHomeTextBox(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement homeTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ADDRESS_LINE1")));
		homeTextBox.clear();
		homeTextBox.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + "  in home Text Box");
		Reporter.log("Typed: " + incomingValue + "  in First homeText Box");
		return this;
	}

	public ApplicationPage TypeOnCitiTextBox(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement citiTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CITY")));
		citiTextBox.clear();
		citiTextBox.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + "  in citi Text Box");
		Reporter.log("Typed: " + incomingValue + "  in First citi Text Box");
		return this;
	}

	public ApplicationPage SelectStateDropDown(String IncomingState) {

		WebElement stateDropDown = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.name("STATE")));

		Select dropdown = new Select(stateDropDown);
		dropdown.selectByVisibleText(IncomingState);
		System.out.println("Select State : " + IncomingState);
		Reporter.log("Select State  : " + IncomingState);
		return this;
	}

	public ApplicationPage ClickOnSocialSecurityNumber() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement socialSecurityNumber = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ssnSection']/div/h3")));
		socialSecurityNumber.click();
		System.out.println("Click On social Security Number");
		Reporter.log("Click On social Security Number");
		return this;
	}

	public ApplicationPage TypeOnSocialSecurityTextBox(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement socialSecurityTextBox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("SSN-citiTextBlur")));
		socialSecurityTextBox.clear();
		socialSecurityTextBox.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + "  in social Security Text Box");
		Reporter.log("Typed: " + incomingValue + "  in social Security Text Box");
		return this;
	}

	public ApplicationPage CheckInUsCitizenYesCheckBox() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement usCitizenYesCheckBox = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='ssnSection']/div/div[2]/div[3]/div[1]/div[1]/label")));

		if (!usCitizenYesCheckBox.isSelected()) {
			usCitizenYesCheckBox.click();
			System.out.println("Check On In usCitizen Yes Check Box");
			Reporter.log("Check On In usCitizen Yes Check Box");
		}
		return this;
	}
}
