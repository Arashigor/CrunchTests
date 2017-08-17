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
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("GUI of the 'Account' - Free User - 7567")
    public void successfullyLogInAccountScree() {
        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.accountPageIsVisible()
                .pressLogin();

        loginPageSteps.loginPageIsVisible()
                .logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);

        accountPageSteps.isUserLoggedIn();

        bottomNavBarSteps.buttonIsSelected(ACCOUNT_NAV)
                .selectButton(ANIME_NAV)
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.isUserLoggedIn();
    }
}
