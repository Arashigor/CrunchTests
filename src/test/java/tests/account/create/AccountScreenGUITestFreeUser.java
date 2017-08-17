package tests.account.create;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;
import static common.DataStore.ACCOUNT_NAV;
import static common.DataStore.ANIME_NAV;

public class AccountScreenGUITestFreeUser extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("GUI of the 'Account' - Free Users - 7573")
    public void successfullyCreateAccountScreen() {
        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.accountPageIsVisible()
                .pressCreateAccountButton();

        createAccountSteps.createAccountPageIsVisible()
                .createAccount(randomEmail(), REGISTERED_USER_PASSWORD);

        premiumSubsSteps.premiumMembershipNavBarIsVisible()
                .pressLaterButton();

        accountPageSteps.isUserLoggedIn();

        bottomNavBarSteps.buttonIsSelected(ACCOUNT_NAV)
                .selectButton(ANIME_NAV)
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.isUserLoggedIn();
    }
}
