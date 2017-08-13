package common;

import io.appium.java_client.MobileElement;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Utils extends PageObject {
    public WebElementFacade waitForElement(WebElement element, long ... time) {
        if (time.length == 0) {
            time = new long[1];
            time[0] = getImplicitWaitTimeout().in(SECONDS);
        }
        return withTimeoutOf((int) time[0], SECONDS).waitFor(element).waitUntilVisible();
    }

    public void clickOnElement(WebElement element, long ... time) {
        if (waitForElement(element, time) != null) {
            element.click();
        } else {
            System.err.println(">>> Element didn't appear after" + getImplicitWaitTimeout().in(SECONDS));
        }
    }

    public MobileElement toMobileElem(WebElement element) {
        return (MobileElement) ((WebElementFacade) element).getWrappedElement();
    }

    //Prevents null ptr
    public boolean isVisible(WebElementFacade element) {
        try {
            element.isVisible();
            return true;
        } catch (NullPointerException ex) {
            return false;
        }
    }
}
