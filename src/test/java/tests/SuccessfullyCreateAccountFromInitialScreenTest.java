package tests;

import basetest.BaseTest;
import common.DataStore;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

import static common.DataStore.BASIC_PASSWORD;
import static common.DataStore.randomEmail;

public class SuccessfullyCreateAccountFromInitialScreenTest extends BaseTest {
    @Test
    @WithTagValuesOf({"smoke"})
    @Title("Successfully create account from Initial Page test - 377631")
    public void successfullyCreateAccountTest() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressCreateAccountButton();


        createAccountSteps.createAccountPageIsVisible()
                .createAccount(randomEmail(), BASIC_PASSWORD);

        premiumSubsSteps.premiumMembershipNavBarIsVisible()
                .pressLaterButton();
    }
}
