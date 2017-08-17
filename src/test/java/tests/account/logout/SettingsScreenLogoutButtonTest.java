package tests.account.logout;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;

public class SettingsScreenLogoutButtonTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"smoke"})
    @Title("Settings screen - Log Out button - 7574")
    public void logOutButtonTest() {
        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.accountPageIsVisible()
                .pressLogin();

        loginPageSteps.loginPageIsVisible()
                .logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);

        accountPageSteps.accountPageIsVisible()
                .isUserLoggedIn();

        accountPageSteps.pressSettingsButton();

        settingsSteps.isSettingPageVisible()
                .scrollToLogOut()
                .logOut()
                .isUserLoggedOut();
    }

}
