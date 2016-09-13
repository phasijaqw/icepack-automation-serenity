package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;

/**
 * Created by priyanka on 13/09/16.
 */
public class SignUpPage  extends PageObject{

    @FindBy(how = How.ID, using = "email-groups")
    private static WebElement email =null;

    @FindBy(how = How.ID, using = "password-group")
    private static WebElement password =null;


    public void assertUserOnSignUpPage() {
        assertNotNull(email);
        assertNotNull(password);
    }
}
