package net.thucydides.showcase.cucumber.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;
import java.util.logging.Logger;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Properties;

public class UISteps extends ScenarioSteps {

    private static final String ENV_PROP_LOCATION = "/properties/";

    static Logger logger = Logger.getLogger(UISteps.class.getName());


    Properties prop = new Properties();

    public UISteps(Pages pages) {
        // load properties based on env
        try {
            prop.load(UISteps.class.getResourceAsStream(ENV_PROP_LOCATION + System.getProperty("env") + ".properties"));

        } catch (IOException e) {
            logger.info("properties can't be loaded");
        }
    }

    @Step
    public void open_home_page() {
        /*homepage.setDefaultBaseUrl(prop.getProperty("homepage"));
        homepage.open();
        homepage.waitForAngularRequestsToFinish();*/
        // homepage.waitFor(10000);
    }
}