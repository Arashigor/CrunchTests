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
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"smoke"})
    @Title("Settings screen - Log Out button - 7574")
    public void logOutButtonTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressLogin();

        loginPageSteps.logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);

        accountPageSteps.shouldBeLoggedIn();

        accountPageSteps.pressSettingsButton();

        settingsSteps.scrollToLogOut()
                .logOut()
                .shouldBeLoggedIn();
    }

}
