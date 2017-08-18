package basetest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.*;
import steps.components.BottomNavigationBarSteps;

@RunWith(SerenityRunner.class)
public class BaseTest {

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

    @Steps
    protected AnimePageSteps animePageSteps;

    @Steps
    protected AccountPageSteps accountPageSteps;

    @Steps
    protected AnimeTitleSteps animeTitleSteps;

    @Steps
    protected PlayerSteps playerSteps;

    @Steps
    protected NewPageSteps newPageSteps;

    @Steps
    protected HomePageSteps homePageSteps;

    @Steps
    protected SettingsSteps settingsSteps;
    //...
}
