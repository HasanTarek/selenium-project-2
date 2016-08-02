package com.pageobjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
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

	// public HomePage ClickOnSignInToYourAccountDropDown() {
	// WebDriverWait wait = new WebDriverWait(driver, 30);
	// WebElement yourAccountDropDown = wait
	// .until(ExpectedConditions.visibilityOfElementLocated(By.id("accounts-select-button")));
	// yourAccountDropDown.click();
	// System.out.println("Click On Sign In To Your Account Drop Down");
	// Reporter.log("Click On Sign In To Your Account Drop Down");
	// return this;
	// }
	//
	// public HomePage SelectAnAccount(int IncomingAccount) {
	// // presenceOfElementLocated
	// WebElement accountOptions = (new WebDriverWait(driver,
	// 30)).until(ExpectedConditions.visibilityOfElementLocated(
	// By.xpath("//li[@id='accounts-select-menu-option-" + IncomingAccount +
	// "']")));
	// accountOptions.click();
	// System.out.println("Select Option : " + IncomingAccount);
	// Reporter.log("Select Option : " + IncomingAccount);
	// return this;
	// }
	public HomePage TypeLogInEmailOrPhoneTextBox(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement logInEmailOrPhoneTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		logInEmailOrPhoneTextBox.clear();
		logInEmailOrPhoneTextBox.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + " Type in Email Or Phone Text Box");
		Reporter.log("Typed: " + incomingValue + " Type in Email Or Phone Text Box");
		return this;
	}

	public HomePage TypeLogInPasswordTextBox(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement logInPasswordTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		logInPasswordTextBox.clear();
		logInPasswordTextBox.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + " Type  in Password Text Box");
		Reporter.log("Typed: " + incomingValue + " Type  in Password Text Box");
		return this;
	}

	public HomePage TypeFirstName(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='u_0_1']")));
		firstName.clear();
		firstName.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + " Type  First Name");
		Reporter.log("Typed: " + incomingValue + " Type First Name");
		return this;
	}

	public HomePage TypeLastName(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='u_0_3']")));
		lastName.clear();
		lastName.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + " Type  Last Name");
		Reporter.log("Typed: " + incomingValue + " Type Last Name");
		return this;
	}

	public HomePage TypeSignUpEmailOrMobile(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement signUpEmailOrMobile = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__")));
		signUpEmailOrMobile.clear();
		signUpEmailOrMobile.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + " Type email Or Mobile");
		Reporter.log("Typed: " + incomingValue + " Type email Or Mobile");
		return this;
	}

	public HomePage TypeReEnterEmailOrMobile(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ReEnterEmailOrMobile = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email_confirmation__")));
		ReEnterEmailOrMobile.clear();
		ReEnterEmailOrMobile.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + " Type Re Enter email Or Mobile");
		Reporter.log("Typed: " + incomingValue + " Type Re Enter email Or Mobile");
		return this;
	}

	public HomePage TypePassword(String incomingValue) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__")));
		Password.clear();
		Password.sendKeys(incomingValue);
		System.out.println("Typed: " + incomingValue + " Type Password");
		Reporter.log("Typed: " + incomingValue + " Type Password");
		return this;
	}

	// public HomePage ClickOnMonthDropDown() {
	// WebDriverWait wait = new WebDriverWait(driver, 30);
	// WebElement monthDropDown = wait
	// .until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[@id='month']")));
	// monthDropDown.click();
	// System.out.println("Click On Month Drop Down");
	// Reporter.log("Click On Month Drop Down");
	// return this;
	// }

	public HomePage SelectMonthDropDown(String IncomingMonth) {

		WebElement monthDropDown = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("month")));

		Select MonthDropDown = new Select(monthDropDown);
		MonthDropDown.selectByVisibleText(IncomingMonth);
		System.out.println("Select State : " + IncomingMonth);
		Reporter.log("Select State  : " + IncomingMonth);
		return this;
	}

	public HomePage SelectDayDropDown(String IncomingDay) {

		WebElement dayDropDown = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("day")));

		Select MonthDropDown = new Select(dayDropDown);
		MonthDropDown.selectByVisibleText(IncomingDay);
		System.out.println("Select State : " + IncomingDay);
		Reporter.log("Select State  : " + IncomingDay);
		return this;
	}

	public HomePage SelectYearDropDown(String IncomingYear) {

		WebElement yearDropDown = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("year")));

		Select YearDropDown = new Select(yearDropDown);
		YearDropDown.selectByVisibleText(IncomingYear);
		System.out.println("Select State : " + IncomingYear);
		Reporter.log("Select State  : " + IncomingYear);
		return this;
	}

	public void ChooseFemale(int option) {
		List<WebElement> radios = driver.findElements(By.xpath("//*[@id='u_0_e']"));
		if (option > 0 && option <= radios.size()) {
			radios.get(option - 1).click();
			System.out.println("Selected Option :" + option);
			Reporter.log("Selected Option :" + option);
		} else {
			throw new NotFoundException("option " + option + " not found");
		}
	}
//	public HomePage SignUp(Map<String, String> data) {
//		TypeLogInEmailOrPhoneTextBox(data.get("emailOrPhone"));
//		TypeLogInPasswordTextBox(data.get("password"));
//		TypeFirstName(data.get("firstName"));
//		TypeLastName(data.get("lastName"));
//		TypeSignUpEmailOrMobile(data.get("signUpEmailOrMobile"));
//		TypeReEnterEmailOrMobile(data.get("reEnterEmailOrMobile"));
//		TypePassword(data.get("password"));
//		SelectMonthDropDown(data.get("month"));
//		SelectDayDropDown(data.get("day"));
//		SelectYearDropDown(data.get("year"));
//		
//		
//		return this;

	}


