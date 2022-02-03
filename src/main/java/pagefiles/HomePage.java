package pagefiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.Helpers;

/* This class has the page locators from the home page of bbc.co.uk
 * It has actions methods to perform selenium actions on the locators 
 */
public class HomePage extends Helpers {

	@FindBy(linkText = "Sign in")
	WebElement signInTab;

	@FindBy(id = "user-identifier-input")
	WebElement userName;

	@FindBy(id = "password-input")
	WebElement passwordIn;

	@FindBy(id = "submit-button")
	WebElement signInButton;

	@FindBy(xpath = "//*[@id='form-message-username']//span")
	WebElement userNameError;

	@FindBy(xpath = "//*[@id='form-message-password']//span")
	WebElement userPassError;

	public void clickOnSignInTab() {
		webElementClick(signInTab);
	}

	public void enterUserName(String username) {

		webElementSendText(userName, username);
	}

	public void enterPassword(String password) {
		webElementSendText(passwordIn, password);
	}

	public void clickSignInButton() {
		webElementClick(signInButton);
	}

	public void checkUserNameErr() {
		checkElementVisible(userNameError);

	}

	/*
	 * It retrieves the error text from user-name field or password field "Field"
	 * type is passed from feature file
	 */
	public String getErrText(String field) {
		if (field.equalsIgnoreCase("username")) {
			if (checkElementVisible(userNameError)) {
				return getElementText(userNameError);
			} else {
				return "WebElement is not Visible";
			}

		} else if (checkElementVisible(userPassError)) {
			return getElementText(userPassError);
		} else
			return "No Error Message (or) Login Success Ful  ";
	}

	/*
	 * It validates if the error message is displayed as per the requirement and
	 * prints the results in the report
	 */
	public void validateSignInError(String error, String feild) {
		String expectedError = getErrText(feild);
		if (expectedError.equals(error)) {
			// adds default message to the extent report
			addStepLogHeader();
			// adds the input message to extent report
			addStepLog("Actual and Expected Message is equal : <br>" + error);
		} else {

			addStepLog("Expected  error should be :<br>" + expectedError);

			addStepLog("Actual error is  : <br>" + error);

		}
	}
}