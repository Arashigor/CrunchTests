package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddvertismentPage extends AbstractPage {

    @iOSFindBy(accessibility = "Learn More")
    WebElementFacade learnMoreButton;

    @iOSFindBy(accessibility = "Skip Ad")
    WebElementFacade skipAddButton;

}
