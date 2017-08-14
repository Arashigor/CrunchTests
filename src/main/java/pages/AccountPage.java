package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends AbstractPage {

    @iOSFindBy(accessibility = "Account")
    public WebElementFacade accountNavBar;

}
