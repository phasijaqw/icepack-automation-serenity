package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;

/**
 * Created by priyanka on 13/09/16.
 */
public class SignInPage extends PageObject {


    @FindBy(how = How.ID, using = "email")
    private static WebElement email =null;

    @FindBy(how = How.XPATH, using = "/html/body/ng-view/section[1]/div/div/div/form/div[1]/span[3]")
    private static WebElement emailError =null;

    @FindBy(how = How.ID, using = "password")
    private static WebElement password =null;

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Forgot your password")
    private static WebElement forgotYourPassword =null;

    @FindBy(how = How.XPATH, using = " //*[@id=\"pages-authentication-signin\"]/div/h1")
    private static WebElement signIn =null;

    @FindBy(how = How.LINK_TEXT, using = "Not a member?")
    private static WebElement notAMemberLink =null;

    public void assertUserOnSignInPage() {
        String title = getDriver().getTitle();
        title.contains("signin");
        assertNotNull(email);
        assertNotNull(password);
        assertEquals("Please Sign In",signIn.getText());
    }

    public void clickOnForgotYourPasswordlink() {
        clickOn(forgotYourPassword);
    }

    public void clickOnNotAMemberLink() {
        clickOn(notAMemberLink);
    }

    public void enterInvalidEmail(String emailAddress) {
        typeInto(email,emailAddress);
        clickOn(signIn);
    }

    public void clickOnSignInButton() {
        clickOn(signIn);
    }

    public void verifyErrorMessage() {
        assertEquals("Valid Email address is required",emailError.getText());
    }

    public void enterValidCredentials(String emailAddress, String passwordValue) {
        typeInto(email,emailAddress);
        typeInto(password,passwordValue);

    }

    public void enterNonExistingCredentails(String emailAddress, String passwordValue) {
        typeInto(email,emailAddress);
        typeInto(password,passwordValue);
    }
}
