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
        notificationPopupSteps.pressAllow();
    }

    @Test
    @WithTagValuesOf({ "smoke"})
    @Title("Successfully create account from Initial Page test - 358225")
    public void successfulLogin() {
        initialPageSteps.pressLoginButton();

        loginPageSteps.logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);

        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.shouldBeLoggedIn();
    }
}
