package tests.account.login;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;
import static pages.LoginPage.*;


//Because on a slow device(iphone 5c) steps are switched extremely slow
//and because of the severe lack of element IDs
//it's hard to parse element dom tree(message simply disappears before any assert or even before pressLogin Step is finished)
public class ErrorLogin extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();
    }

    @Test
    @WithTagValuesOf({ "smoke"})
    @Title("Log In errors test - 7565")
    public void loginErrorWithEmptyFieldsTest() {

        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressLogin();

//        loginPageSteps.shouldSeeLoginPage()
//                .errorLogIn(BLANK_EMAIL,BLANK_PASSWORD, EMPTY_CREDENTIALS_MSG)
//                .errorLogIn(REGISTERED_USER_EMAIL,BLANK_PASSWORD, CORRECT_EMAIL_NO_PASSWORD_MSG)
//                .errorLogIn(WRONG_EMAIL, REGISTERED_USER_PASSWORD, INCORRECT_LOGIN_INFO_MSG)
//                .errorLogIn(REGISTERED_USER_EMAIL, WRONG_PASSWORD, INCORRECT_LOGIN_INFO_MSG);
    }
}
