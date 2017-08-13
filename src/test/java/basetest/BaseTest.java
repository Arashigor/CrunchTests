package basetest;

import common.Utils;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.*;

@RunWith(SerenityRunner.class)
public class BaseTest {
    protected static Utils utils;

    @Managed(driver = "appium")
    WebDriver driver;

    @Steps
    protected NotificationPopupSteps notificationPopupSteps;

    @Steps
    protected InitialPageSteps initialPageSteps;

    @Steps
    protected LoginPageSteps loginPageSteps;

    @Steps
    protected CreateAccountSteps createAccountSteps;

    @Steps
    protected PremiumSubsSteps premiumSubsSteps;

    //...
}
