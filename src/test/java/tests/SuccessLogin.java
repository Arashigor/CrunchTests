package tests;

import basetest.BaseTest;
import common.DataStore;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

public class SuccessLogin extends BaseTest {
    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "critical"})
    @Title("Successfully create account test")
    public void succLogin() {
        startupPopupSteps.pressAllow();
        initialPageSteps.pressLoginButton();
        loginPageSteps.enterEmail(DataStore.REGISTRED_USER_EMAIL).enterPassword(DataStore.REGISTRED_USER_PASSWORD).pressLoginButton();
    }
}
