package steps;

import actions.GoogleActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class GoogleSteps {
    @Steps
    GoogleActions googleActions;
    @Given("I open Google")
    public void i_open_google(){
        googleActions.iOpenGoogle();
    }
    @And("I open GE")
    public void i_open_ge(){
        googleActions.iOpenGE();
    }
    @And("I click on teams button")
    public void i_click_on_teams_button(){
        googleActions.iClickOnTeamsButton();
    }
    @When("I search for {string}")
    public void i_search_for(String text){
        googleActions.iSearchFor(text);
    }
    @Then("I should see results related to {string}")
    public void i_should_see_results(String expectedResults){
        googleActions.iShouldSeeTheResultsRelated(expectedResults);
    }
}
