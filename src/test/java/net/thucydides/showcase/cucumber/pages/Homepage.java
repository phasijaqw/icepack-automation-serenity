package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;

public class Homepage extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\"new-home-page\"]/minimal-cms-hero/div/div[2]/div/div[2]/span/carousel-detail/div/div/cta-container/ng-include/div/cta-button/a")
    private static WebElement watchNowSevendaysFreeButton =null;

    @FindBy(how = How.XPATH, using = "/html/body/ng-view/div/packages-channel-lineup/div/extras-channel-lineup/div/div/div/div[6]/div/cta-container/ng-include/div/sublink/div/a/span")
    private static WebElement offerDetailsLink =null;

    @FindBy(how = How.XPATH, using = "/html/body/ng-view/section/div/ng-include/section/div/h2[1]")
    private static WebElement takebackTVLink =null;

    @FindBy(how = How.ID, using = "signin-link")
    private static WebElement signInLink =null;

    public void clickOnWatchNowSevenDaysFreeButton() {
         clickOn(watchNowSevendaysFreeButton);
    }

    public void clickOnOfferDetailsLink() {
        clickOn(offerDetailsLink);
    }

    public void clickOnMemberSignInLink() {
        clickOn(signInLink);
    }

    public void clickOnTakeBackTVLink() {
        clickOn(takebackTVLink);
    }

    public void assertUserOnHomePage() {
       String url = getDriver().getCurrentUrl();
        assertEquals("https://d-ottweb.movetv.com/",url);
    }
}
