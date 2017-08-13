package tests;

import basetest.BaseTest;
import common.DataStore;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

public class SuccessCreateAccountTest extends BaseTest {
    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "critical"})
    @Title("Successfully create account test")
    public void succCreateAccountTest() {
        allowNotificationPopupSteps.pressAllow();
        initialPageSteps.pressCreateAccountButton();
        createAccountSteps.enterEmail(DataStore.randomEmail()).enterPassword(DataStore.BASIC_PASSWORD).pressCreateAccountButton();
        premiumSubsSteps.pressLaterButton();
    }
}
