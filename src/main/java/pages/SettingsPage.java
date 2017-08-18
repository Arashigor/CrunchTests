package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SettingsPage extends AbstractPage {

    @iOSFindBy(accessibility = "Settings")
    public WebElementFacade settingsNavBar;

    @iOSFindBy(accessibility = "LOG OUT")
    public WebElementFacade logOutButton;

    @iOSFindBy(accessibility = "icon back arrow")
    public WebElementFacade backArrow;
}
