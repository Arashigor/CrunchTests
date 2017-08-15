package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PlayerPage extends AbstractPage {

    @iOSFindBy(accessibility = "pause button large")
    public WebElementFacade pauseButton;

}
