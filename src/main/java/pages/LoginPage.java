package pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class LoginPage extends AbstractPage {

    public static final String EMPTY_CREDENTIALS_MSG = "You forgot to put in your User Name or Email.";
    public static final String CORRECT_EMAIL_NO_PASSWORD_MSG = "You forgot to put in your password.";
    public static final String INCORRECT_LOGIN_INFO_MSG = "Incorrect login information.";
    public static final String CORRECT_LOGIN_INFO_WRONPASSWORD_MSG = "Incorrect login information.";

    private static final By staticTextList = By.className("XCUIElementTypeStaticText");

    @iOSFindBy(accessibility = "icon back arrow")
    public WebElementFacade backArrowButton;

    @iOSFindBy(className = "XCUIElementTypeTextField")
    public WebElementFacade emailField;

    @iOSFindBy(className = "XCUIElementTypeSecureTextField")
    public WebElementFacade passwordField;

    @iOSFindBy(accessibility = "LOG IN", className = "XCUIElementTypeButton")
    public WebElementFacade loginButton;

    @iOSFindBy(accessibility = "button close")
    public WebElementFacade XButton;

    @iOSFindBy(accessibility = "Later")
    public WebElementFacade laterButton;

    public WebElementFacade getError() {
        return findAll(staticTextList).get(1);
    }

}
