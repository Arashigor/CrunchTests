package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class StartupPopupPage extends AbstractPage {
    @iOSFindBy(accessibility = "Allow")
    public WebElementFacade popupAllow;

    @iOSFindBy(accessibility = "Don’t Allow")
    public WebElementFacade popuDeny;

    @iOSFindBy(accessibility = "“Crunchyroll Beta” Would Like to Send You Notifications")
    public WebElementFacade popupWindow;
}
