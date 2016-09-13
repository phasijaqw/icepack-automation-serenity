package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;

/**
 * Created by priyanka on 13/09/16.
 */
public class CommercialPage extends PageObject {

    @FindBy(how = How.ID, using = "offer-details")
    private static WebElement offerDetails =null;

    @FindBy(how = How.XPATH, using = "/html/body/ng-view/div[1]/div[1]/div[2]/div/h5")
    private static WebElement commercial =null;


    public void assertUserOnCommercialPage() {
        String title = getDriver().getTitle();
        title.contains("commercials");
        assertEquals("Watch our commercials",commercial.getText());
    }
}
