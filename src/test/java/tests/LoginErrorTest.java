package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import static common.DataStore.*;
import static pages.LoginPage.CORRECT_EMAIL_NO_PASSWORD_MSG;
import static pages.LoginPage.EMPTY_CREDENTIALS_MSG;
import static pages.LoginPage.INCORRECT_LOGIN_INFO_MSG;

public class LoginErrorTest extends BaseTest{
    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "high"})
    @Title("Log In errors test")
    public void loginErrorWithEmptyFieldsTest() {
        allowNotificationPopupSteps.pressAllow();
        initialPageSteps.pressLoginButton();

        loginPageSteps.logIn(BLANK_EMAIL,BASIC_PASSWORD).shouldSeeErrorMessage(EMPTY_CREDENTIALS_MSG)
                       .logIn(REGISTRED_USER_EMAIL,BLANK_PASSWORD).shouldSeeErrorMessage(CORRECT_EMAIL_NO_PASSWORD_MSG)
                       .logIn(WRONG_EMAIL, REGISTRED_USER_PASSWORD).shouldSeeErrorMessage(INCORRECT_LOGIN_INFO_MSG)
                       .logIn(REGISTRED_USER_EMAIL, WRONG_PASSWORD).shouldSeeErrorMessage(INCORRECT_LOGIN_INFO_MSG);
    }
}
