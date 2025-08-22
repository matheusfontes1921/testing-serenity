package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends PageObject {
    @FindBy(name = "q")
    WebElement searchBox;
//    @FindBy(xpath="//*[@id=\"mosaico__wrapper\"]/div[1]/span")
    @FindBy(className = "logo-area")
    public WebElementFacade teamsButton;

    public void openGE() {
        this.openUrl("https://ge.globo.com/");
    }
    public void openGoogle() {
        this.openUrl("https://www.google.com");
    }
    public void typeSearch(String text) {
        searchBox.sendKeys(text);
    }
    public String getPageContent() {
        return getDriver().findElement(By.tagName("body")).getText();
    }

}
