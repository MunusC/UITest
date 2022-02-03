package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefiles.SportsDetailsPage;

public class MatchesTodaySteps {

	SportsDetailsPage sportPage = new SportsDetailsPage();

	@Given("^user is on www.bbc.co.uk homepage$")
	public void user_is_on_wwwbbccouk_homepage() throws Throwable {

	}

	@And("^user clicks on sport tab header$")
	public void user_clickon_sporttab() {
		sportPage.clickOnSportTab();
	}

	@When("^user clicks on Football tab$")
	public void user_click_on_football_tab() {
		sportPage.clickOnFootballTab();
	}

	@And("^user clicks on Score & Fixtures$")
	public void user_click_on_ScoreFixtures() {
		sportPage.clickOnScoresAndFixture();
	}

	@And("^user click on Today$")
	public void user_click_on_today() {
		sportPage.clickOnTodayDate();
	}

	@Then("^user should be able to see all team names with a match today$")
	public void user_able_to_see_all_team_names_with_a_match_today() {
		sportPage.findAllorNoMatchesforDate();
	}

}