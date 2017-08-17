package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateAccountPage extends AbstractPage {

    @iOSFindBy(accessibility = "icon back arrow")
    public WebElementFacade backArrowButton;

    @iOSFindBy(className = "XCUIElementTypeTextField")
    public WebElementFacade emailField;

    @iOSFindBy(className = "XCUIElementTypeSecureTextField")
    public WebElementFacade passwordField;

    @iOSFindBy(accessibility = "CREATE ACCOUNT!")
    public WebElementFacade createAccountButton;

    @iOSFindBy(accessibility = "Create Account", className = "XCUIElementTypeNavigationBar")
    public WebElementFacade createAccountNavBar;

    @iOSFindBy(accessibility = "icAccountBearLGiphone")
    public WebElementFacade createAccountLogo;

    @iOSFindBy(accessibility = "button close")
    public WebElementFacade XButton;

    @iOSFindBy(accessibility = "Later")
    public WebElementFacade laterButton;
}
