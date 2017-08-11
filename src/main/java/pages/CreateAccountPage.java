package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends AbstractPage {
    @iOSFindBy(className = "XCUIElementTypeTextField")
    public WebElementFacade emailField;

    @iOSFindBy(className = "XCUIElementTypeSecureTextField")
    public WebElementFacade passwordField;

    @iOSFindBy(accessibility = "CREATE ACCOUNT!")
    public WebElementFacade createAccountButton;
}
