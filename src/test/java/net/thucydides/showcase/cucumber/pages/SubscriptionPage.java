package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;

/**
 * Created by priyanka on 13/09/16.
 */
public class SubscriptionPage {

    @FindBy(how = How.ID, using = "pages-user-account")
    private static WebElement userAccount =null;

    @FindBy(how = How.ID, using = "your-subscription")
    private static WebElement subscription =null;


    public void assertuserOnSubscriptionPage() {
        assertNotNull(userAccount);
        assertNotNull(subscription);

    }
}
