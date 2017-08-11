package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementExpectations;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;
import org.yecht.Data;

public class LoginPage extends AbstractPage {
    public static final String EMPTY_CREDENTIALS_MSG = "You forgot to put in your User Name or Email.";
    public static final String CORRECT_EMAIL_NO_PASSWORD_MSG = "You forgot to put in your password.";
    public static final String INCORRECT_LOGIN_INFO_MSG = "Incorrect login information.";


    @iOSFindBy(accessibility = "icon back arrow")
    public WebElementFacade backArrowButton;

    @iOSFindBy(className = "XCUIElementTypeTextField")
    public WebElementFacade emailField;

    @iOSFindBy(className = "XCUIElementTypeSecureTextField")
    public WebElementFacade passwordField;

    @iOSFindBy(accessibility = "LOG IN")
    public WebElementFacade loginButton;

    @iOSFindBy(accessibility = "You forgot to put in your User Name or Email.")
    public WebElementFacade emptyCredentialsMsg;

    @iOSFindBy(accessibility = "You forgot to put in your password.")
    public WebElementFacade noPasswordMsg;

    @iOSFindBy(accessibility = "Incorrect login information.")
    public WebElementFacade invalidLoginMsg;

}
