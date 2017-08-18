package tests.account.upgrade;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ACCOUNT_NAV;
import static common.DataStore.REGISTERED_USER_EMAIL;
import static common.DataStore.REGISTERED_USER_PASSWORD;

public class LaterButtonFromPremMembShipTest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("'Later' button from Premium Membership screen - 7577")
    public void logOutButtonTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressLogin();

        loginPageSteps.logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);

        accountPageSteps.pressUpgradeAccountButton();

        premiumSubsSteps.pressLaterButton();

        accountPageSteps.shouldSeeAccountPage()
                    .shouldBeLoggedIn();
    }
}
