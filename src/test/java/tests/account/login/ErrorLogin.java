package tests.account.login;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;
import static pages.LoginPage.*;

public class ErrorLogin extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressJustExplore();
    }

    @Test
    @WithTagValuesOf({ "smoke"})
    @Title("Log In errors test - 7565")
    public void loginErrorWithEmptyFieldsTest() {

        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.accountPageIsVisible()
                .pressLogin();

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
