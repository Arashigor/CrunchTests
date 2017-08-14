package basetest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.AccountPage;
import steps.*;

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
    protected AccountPageSteps accountPageSteps;

    @Steps
    protected BottomNavigationBarSteps bottomNavBarSteps;

    //...
}
