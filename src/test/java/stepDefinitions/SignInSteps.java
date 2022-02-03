package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefiles.HomePage;

public class SignInSteps {

	HomePage loginInPage = new HomePage();

	@Given("^User is on www\\.bbc\\.co\\.uk homepage$")
	public void user_On_Bbc_Hopepage() {
	}

	@And("^User clicks on Sign in tab$")
	public void user_click_on_loing_intab() {
		loginInPage.clickOnSignInTab();

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_EnterUsername(String username) {
		loginInPage.enterUserName(username);
	}

	@And("^User enters password as \"([^\"]*)\"$")
	public void user_EnterPassword(String password) {
		loginInPage.enterPassword(password);
	}

	@And("^User clicks on Sign in button$")
	public void user_Click_SignInButton() {
		loginInPage.clickSignInButton();
	}

	@Then("^user gets the error message as \"([^\"]*)\" for \"([^\"]*)\"$")
	public void sign_In_Should_Be_Unsuccessful(String error, String feild) {

		loginInPage.validateSignInError(error, feild);

	}

}