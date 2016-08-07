package com.pageobjects;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	/**
	 * @author Hasan Tarek
	 */

	public static WebDriver driver;

	{

		if (System.getProperties().getProperty("os.name").toLowerCase().contains("windows")) {
			System.setProperty("atu.reporter.config", "C:\\Users\\Hasan\\workspace\\CitiBank\\atu.properties");
		}

	}

	public static boolean implicitwait(long time) {
		try {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Parameters("browser")
	@BeforeMethod
	public static boolean LaunchBrowser(String browser) {

		if (browser.equalsIgnoreCase("firefox")
				&& System.getProperties().getProperty("os.name").toLowerCase().contains("windows")) {

			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability(FirefoxDriver.PROFILE, true);
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver(capabilities);

		} else if (browser.equalsIgnoreCase("ie")
				&& System.getProperties().getProperty("os.name").toLowerCase().contains("windows")) {

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			capabilities.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
			capabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			capabilities.setJavascriptEnabled(true);
			capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "about:blank");

			System.setProperty("webdriver.ie.driver", "C:\\Users\\Hasan\\workspace\\CitiBank\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
		}

		else if (browser.equalsIgnoreCase("chrome")
				&& System.getProperties().getProperty("os.name").toLowerCase().contains("windows")) {
			ChromeOptions options = new ChromeOptions();
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hasan\\workspace\\CitiBank\\chromedriver.exe");
			driver = new ChromeDriver(capabilities);
		}

		driver.navigate().to("https://online.citi.com/US/Welcome.c?JFP_TOKEN=TTDE9IOL");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Launching Browser : " + browser);
		System.out.println();
		Reporter.log("Launching Browser : " + browser);

		return true;
	}

	@Parameters("browser")
	// @AfterMethod
	public static boolean CloseBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			// WindowsUtils.tryToKillByName("firefox.exe");
			driver.close();
			// driver.quit();
		} else if (browser.equalsIgnoreCase("ie")) {
			// WindowsUtils.tryToKillByName("iexplore.exe");
			// WindowsUtils.tryToKillByName("IEDriverServer.exe");
			driver.close();
			driver.quit();
		} else if (browser.equalsIgnoreCase("chrome")) {
			// WindowsUtils.tryToKillByName("chrome.exe");
			// WindowsUtils.tryToKillByName("chromedriver.exe");
			driver.close();
			driver.quit();
		}

		System.out.println("Closing Browser : " + browser);
		Reporter.log("Closing Browser : " + browser);

		return true;
	}

	@AfterMethod
	public void PrintTestCaseEnd(ITestResult result) {
		System.out.println("End Of Test: " + result.getMethod().getMethodName());
		Reporter.log("End Of Test: " + result.getMethod().getMethodName());
	}

	public void ClickGlobalHomeLink() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement GlobalHomeLink = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='td-nav-level2']/ul/li[1]/span/a")));
		GlobalHomeLink.click();
		System.out.println("Clicked GlobalHomeLink");
		Reporter.log("Clicked GlobalHomeLink");

	}

	public void GoToPreviousPage() {
		driver.navigate().back();
		System.out.println("Going Back To previus Page");
		Reporter.log("Going Back To previus Page");
	}

	public void GoToForwordPage() {
		driver.navigate().forward();
		System.out.println("Going Forword");
		Reporter.log("Going Forword");
	}
}
