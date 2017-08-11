package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class InitialPage extends AbstractPage {
    StartupPopupPage popupPage;

    @iOSFindBy(accessibility = "LOG IN")
    public WebElementFacade loginButton;

    @iOSFindBy(accessibility = "CREATE ACCOUNT")
    public WebElementFacade createAccountButton;


}
