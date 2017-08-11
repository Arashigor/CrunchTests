package tests;

import basetest.BaseTest;
import common.DataStore;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;
import pages.LoginPage;

public class LoginErrorTest extends BaseTest{
    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "high"})
    @Title("Log In errors test")
    public void loginErrorWithEmptyFieldsTest() {
        startupPopupSteps.pressAllow();
        initialPageSteps.pressLoginButton();

        loginPageSteps.enterEmail(DataStore.BLANK_EMAIL).enterPassword(DataStore.BLANK_PASSWORD).pressLoginButton().shouldSeeErrorMessageAboutEmptyCredentials(LoginPage.EMPTY_CREDENTIALS_MSG);
        loginPageSteps.enterEmail(DataStore.REGISTRED_USER_EMAIL).enterPassword(DataStore.BLANK_PASSWORD).pressLoginButton().shouldSeeErrorMessageAboutEmptyCredentials(LoginPage.CORRECT_EMAIL_NO_PASSWORD_MSG);
        loginPageSteps.enterEmail(DataStore.WRONG_EMAIL).enterPassword(DataStore.REGISTRED_USER_PASSWORD).pressLoginButton().shouldSeeErrorMessageAboutEmptyCredentials(LoginPage.INCORRECT_LOGIN_INFO_MSG);
        loginPageSteps.enterEmail(DataStore.REGISTRED_USER_EMAIL).enterPassword(DataStore.WRONG_PASSWORD).pressLoginButton().shouldSeeErrorMessageAboutEmptyCredentials(LoginPage.INCORRECT_LOGIN_INFO_MSG);
    }
}
