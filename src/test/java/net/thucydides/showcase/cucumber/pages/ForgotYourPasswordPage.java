package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by priyanka on 13/09/16.
 */
public class ForgotYourPasswordPage extends PageObject{

    @FindBy(how = How.NAME, using = "email")
    private static WebElement email =null;

    @FindBy(how = How.XPATH, using = "/html/body/ng-view/div/section/div/div[2]/div/form/div[2]/button")
    private static WebElement submit =null;

    public void assertUserOnForgotPasswordPage() {
        String title = getDriver().getTitle();
        title.contains("forgot_password");
        assertNotNull(email);
        assertNotNull(submit);
    }
}
