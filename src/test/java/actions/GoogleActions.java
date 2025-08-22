package actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleActions {
    GooglePage googlePage;
    @Step
    public void iOpenGE(){
        googlePage.openGE();
    }
    @Step
    public void iOpenGoogle(){
        googlePage.openGoogle();
    }
    @Step
    public void iSearchFor(String text){
        googlePage.typeSearch(text);
    }
    @Step
    public void iShouldSeeTheResultsRelated(String expected){
        Assert.assertTrue("The content does not contain the expected term", googlePage.getPageContent().contains(expected));
    }
    @Step
    public void iClickOnTeamsButton(){
        googlePage.teamsButton.waitUntilEnabled().click();
    }
}
