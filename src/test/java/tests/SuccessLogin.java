package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import static common.DataStore.REGISTERED_USER_EMAIL;
import static common.DataStore.REGISTERED_USER_PASSWORD;

public class SuccessLogin extends BaseTest {
    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "critical"})
    @Title("Successfully create account test")
    public void successfulLogin() {
        notificationPopupSteps.pressAllow();
        initialPageSteps.pressLoginButton();
        loginPageSteps.logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);
    }
}
