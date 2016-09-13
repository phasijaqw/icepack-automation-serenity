package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;

/**
 * Created by priyanka on 13/09/16.
 */
public class OfferDetailsPage extends PageObject {

    @FindBy(how = How.ID, using = "offer-details")
    private static WebElement offerDetails =null;

    @FindBy(how = How.XPATH, using = "/html/body/ng-view/section/div/ng-include/section/div/h2[1]")
    private static WebElement freeTrial =null;


    public void clickOnOfferDetailsLink() {

       // assertEquals("https://d-ottweb.movetv.com/offer-details",getDriver().getCurrentUrl());
        assertNotNull(offerDetails);
        assertEquals("Free trial",freeTrial.getText());
    }
}
