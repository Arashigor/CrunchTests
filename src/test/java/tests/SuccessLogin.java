package tests;

import basetest.BaseTest;
import common.DataStore;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import static common.DataStore.REGISTRED_USER_EMAIL;
import static common.DataStore.REGISTRED_USER_PASSWORD;

public class SuccessLogin extends BaseTest {
    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "critical"})
    @Title("Successfully create account test")
    public void successfulLogin() {
        allowNotificationPopupSteps.pressAllow();
        initialPageSteps.pressLoginButton();
        loginPageSteps.logIn(REGISTRED_USER_EMAIL, REGISTRED_USER_PASSWORD);
    }
}
