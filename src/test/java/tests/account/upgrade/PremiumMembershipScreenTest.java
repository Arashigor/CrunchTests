package tests.account.upgrade;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ACCOUNT_NAV;
import static common.DataStore.REGISTERED_USER_EMAIL;
import static common.DataStore.REGISTERED_USER_PASSWORD;

public class PremiumMembershipScreenTest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("'Premium Membership' screen - 7576")
    public void premMemshipTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressLogin();

        loginPageSteps.logIn(REGISTERED_USER_EMAIL, REGISTERED_USER_PASSWORD);

        accountPageSteps.pressUpgradeAccountButton();

        premiumSubsSteps.shouldSeePremMembshipPage();
    }
}
