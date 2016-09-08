package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage extends PageObject {
    @FindBy(how = How.ID, using = "getcarquote")
    private static WebElement getCarQuote =null;

    @FindBy(how = How.ID, using = "quotebox")
    private static WebElement quotebox =null;

    @FindBy(how = How.ID, using = "quoteform")
    private static WebElement quoteform =null;

    public void clickOnCarQuoteLink() {
        clickOn(getCarQuote);
        waitFor(quoteform);
    }
}
