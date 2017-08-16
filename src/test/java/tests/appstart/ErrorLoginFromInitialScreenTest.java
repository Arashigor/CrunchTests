package tests.appstart;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;
import static pages.LoginPage.CORRECT_EMAIL_NO_PASSWORD_MSG;
import static pages.LoginPage.EMPTY_CREDENTIALS_MSG;
import static pages.LoginPage.INCORRECT_LOGIN_INFO_MSG;


public class ErrorLoginFromInitialScreenTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressLoginButton();
    }

    @Test
    @WithTagValuesOf({ "smoke"})
    @Title("Log In errors test - 7565")
    public void loginErrorWithEmptyFieldsTest() {
        loginPageSteps.loginPageIsVisible()
                .logIn(BLANK_EMAIL,BLANK_PASSWORD)
                .shouldSeeErrorMessage(EMPTY_CREDENTIALS_MSG)
                .logIn(REGISTERED_USER_EMAIL,BLANK_PASSWORD)
                .shouldSeeErrorMessage(CORRECT_EMAIL_NO_PASSWORD_MSG)
                .logIn(WRONG_EMAIL, REGISTERED_USER_PASSWORD)
                .shouldSeeErrorMessage(INCORRECT_LOGIN_INFO_MSG)
                .logIn(REGISTERED_USER_EMAIL, WRONG_PASSWORD)
                .shouldSeeErrorMessage(INCORRECT_LOGIN_INFO_MSG);
    }
}
