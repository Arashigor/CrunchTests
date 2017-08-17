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
        notificationPopupSteps
                .pressAllow();

        initialPageSteps
                .pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("GUI of the 'Account' - Free Users - 7573")
    public void successfullyCreateAccountScreen() {

        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressCreateAccountButton();

        createAccountSteps.createAccount(randomEmail(), REGISTERED_USER_PASSWORD);

        premiumSubsSteps.pressLaterButton();

        accountPageSteps.shouldBeLoggedIn();

        accountPageSteps.bottomNavBarSteps.selectButton(ANIME_NAV)
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.shouldBeLoggedIn();

    }
}
