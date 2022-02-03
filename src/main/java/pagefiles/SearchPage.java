package pagefiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.Helpers;

/* This class has the page locators from the search page of bbc.co.uk
 * It has actions methods to perform selenium actions on the locators 
 */
public class SearchPage extends Helpers {

	@FindBy(linkText = "Search")
	WebElement searchBar;

	@FindBy(id = "search-input")
	WebElement SearchTheBBC;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//ul[@class='ssrcss-v19xcd-Stack e1y4nx260']//li//p//span")
	WebElement searchResults;

	public void clickOnSearchBar() {
		webElementClick(searchBar);
	}

	public void enterText(String article) {
		webElementSendText(SearchTheBBC, article);
	}

	public void clickOnSubmitButton() {
		webElementClick(submitButton);
	}

	// Verifies if search has any results
	public void verifySearchResults() {
		checkElementVisible(searchResults);
		addStepLogHeader();
		addStepLog("Search results are able to return the articles<br>");
	}

	// Displays the first and last article from the results on the page
	public void displayFirstandLastArticle() {
		By _articles = By.xpath("//ul[@class='ssrcss-v19xcd-Stack e1y4nx260']//li//p//span");

		int totalArticlesOnPage = driver.findElements(_articles).size();

		if (totalArticlesOnPage >= 1) {

			addStepLog("First article header is mentioned below <br>" + "--->" + driver
					.findElement(By.xpath("(//ul[@class='ssrcss-v19xcd-Stack e1y4nx260']//li//p//span)[1]")).getText());

			addStepLog("Last article header is  mentioned  <br>" + "--->"
					+ driver.findElement(By.xpath(
							"(//ul[@class='ssrcss-v19xcd-Stack e1y4nx260']//li//p//span)[" + totalArticlesOnPage + "]"))
							.getText());
		} else {

			addStepLog("There are no articles returned for sports");
		}
	}
}