package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.REGISTERED_USER_EMAIL;
import static common.DataStore.REGISTERED_USER_PASSWORD;

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

        loginPageSteps.loginNavBarIsVisible()
                .logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);
    }
}
