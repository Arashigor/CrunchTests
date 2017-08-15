package pages;

import common.DataStore;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static common.DataStore.*;

public class AccountPage extends AbstractPage {

    @iOSFindBy(accessibility = "Account")
    public WebElementFacade accountNavBar;

    @iOSFindBy(accessibility = "Log In")
    public WebElementFacade loginButton;

    @iOSFindBy(accessibility = REGISTERED_USER_EMAIL)
    public WebElementFacade userEmailButton;
}
