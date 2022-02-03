package pagefiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.Helpers;

/* This class has the page locators from the Sports Details page of bbc.co.uk
 * It has actions methods to perform selenium actions on the locators 
 */
public class SportsDetailsPage extends Helpers {

	@FindBy(linkText = "Sport")
	WebElement sportHeaderTab;

	@FindBy(linkText = "Football")
	WebElement footballTab;

	@FindBy(xpath = "//a[contains(text(),'Scores & Fixtures')]")
	WebElement scoresAndFixtureTab;

	@FindBy(xpath = "//span[contains(text(),'TODAY')]")
	WebElement clickOnTodayDate;

	public void clickOnSportTab() {
		webElementClick(sportHeaderTab);
	}

	public void clickOnFootballTab() {
		webElementClick(footballTab);
	}

	public void clickOnScoresAndFixture() {
		webElementClick(scoresAndFixtureTab);
	}

	public void clickOnTodayDate() {
		webElementClick(clickOnTodayDate);
	}

	public void findAllorNoMatchesforDate() {

		waitUntilElementToBeClickable(By.xpath("//span[@class='sp-c-fixture__team-name-wrap']//span"));
		String matches = "";

		List<WebElement> elements = driver
				.findElements(By.xpath("//span[@class='sp-c-fixture__team-name-wrap']//span"));
		if (elements.size() == 0) {
			addStepLogHeader();
			addStepLog("No Matches Found for the date");
		} else {

			for (WebElement element : elements) {
				matches += element.getText() + "\"<br>\"";

			}
			addStepLogHeader();
			addStepLog("List of the teams playing matches are given below " + "<br>" + matches);
		}
	}
}