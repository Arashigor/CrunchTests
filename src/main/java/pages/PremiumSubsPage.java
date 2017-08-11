package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PremiumSubsPage extends AbstractPage {
    @iOSFindBy(accessibility = "Later")
    public WebElementFacade laterButton;
}
