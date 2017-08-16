package tests.appstart;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;

public class SuccessfullyLoginInitialScreenTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();
    }

    @Test
    @WithTagValuesOf({ "smoke"})
    @Title("Successfully create account from Initial Page test - 358225")
    public void successfulLogin() {
        initialPageSteps.initialPageIsVisible()
                .pressLoginButton();

        loginPageSteps.loginPageIsVisible()
                .logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);

        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.isUserLoggedIn();
    }
}
