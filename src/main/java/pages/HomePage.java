package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends AbstractPage {

    @iOSFindBy(accessibility = "empty-queue")
    public WebElementFacade emptyQueueLogo;

    @iOSFindBy(accessibility = "empty-history")
    public WebElementFacade emptyHistoryLogo;
}
