package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import baseclass.BaseClass;

/* This class provides wrapper methods for  selenium actions 
 * with dynamic webdriver wait timeout.
 * Timeout is  configurable through config file
 */

public class Helpers extends BaseClass {

	public void webElementClick(WebElement element) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void webElementSendText(WebElement element, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public boolean checkElementVisible(WebElement element) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}

	public String getElementText(WebElement element) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	public void waitUntilElementToBeClickable(By by) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
	}

	// adds informational message in the extent report for scenarios
	public static void addStepLog(String Message) {

		ExtentCucumberAdapter.addTestStepLog(Message);
	}

	// adds default message in the extent report
	public static void addStepLogHeader() {

		ExtentCucumberAdapter.addTestStepLog("---------------------\n ");
		ExtentCucumberAdapter.addTestStepLog(" Test Outputs : \n ");
		ExtentCucumberAdapter.addTestStepLog("---------------------\n ");

	}
}