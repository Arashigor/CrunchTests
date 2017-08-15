package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

import static java.util.concurrent.TimeUnit.SECONDS;

public abstract class AbstractPage extends PageObject {

    @SuppressWarnings("unchecked")
    public IOSDriver<IOSElement> iOSDriver() {
        return (IOSDriver<IOSElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    @SuppressWarnings("unchecked")
    public AppiumDriver<MobileElement> appiumDriver() {
        return (AppiumDriver<MobileElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

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

    public void scroll(String direction) {
        HashMap<String, String> scrollObject = new HashMap<>();
        scrollObject.put("direction", direction);
        evaluateJavascript("mobile: scroll", scrollObject);
    }

    public void swipe(String direction) {
        HashMap<String, String> swipeObject = new HashMap<>();
        swipeObject.put("direction", direction);
        evaluateJavascript("mobile: swipe", swipeObject);
    }

    public boolean isVisible(WebElementFacade element) {
        System.out.println(">> in visible");
        try {
            element.isVisible();
            return true;
        } catch (NullPointerException ex) {
            return false;
        }
    }

}
