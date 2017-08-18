package tests.account.login;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;

public class AccountScreenGUITestFreeUser extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("GUI of the 'Account' - Free User - 7567")
    public void successfullyLogInAccountScree() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressLogin();

        loginPageSteps.logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);

        accountPageSteps.shouldBeLoggedIn();

        accountPageSteps.bottomNavBarSteps.selectButton(ANIME_NAV)
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.shouldBeLoggedIn();
    }
}
