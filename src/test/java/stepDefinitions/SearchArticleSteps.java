package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefiles.SearchPage;
public class SearchArticleSteps {


    SearchPage searchPage = new SearchPage();

    @Given("^user is  on www.bbc.co.uk homepage$")
    public void user_is_on_wwwbbccouk_homepage()  {
        
    }
    
    @When("^I search all articles related to \"([^\"]*)\"$")
    public void i_search_all_articles_related_to_sports(String article)  {
        searchPage.clickOnSearchBar();
		searchPage.enterText(article);
		searchPage.clickOnSubmitButton();
    }
    
    @Then("^I should see the first and last headings of the sports news page$")
    public void i_should_see_the_first_and_last_headings_of_the_sports_news_page() {
        searchPage.verifySearchResults();
		searchPage.displayFirstandLastArticle();
    }
}