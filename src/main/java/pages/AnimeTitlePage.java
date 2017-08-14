package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AnimeTitlePage extends AbstractPage {
    @iOSFindBy(accessibility = "START")
    public WebElementFacade startButton;
}
