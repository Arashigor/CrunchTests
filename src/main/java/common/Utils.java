package common;

import io.appium.java_client.MobileElement;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Utils extends PageObject {

    public WebElementFacade waitForElement(WebElement el, long time) {
        return withTimeoutOf((int) time, SECONDS).waitFor(el).waitUntilVisible();
    }

    public MobileElement toMobileElem(WebElement element) {
        return (MobileElement) ((WebElementFacade) element).getWrappedElement();
    }
}
