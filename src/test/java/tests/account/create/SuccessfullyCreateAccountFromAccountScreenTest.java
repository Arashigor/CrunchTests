package tests.account.create;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;

public class SuccessfullyCreateAccountFromAccountScreenTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();
    }

    @Test
    @WithTagValuesOf({"smoke"})
    @Title("Successfully registration from Account screen - 7571")
    public void navigationBetweenTabsTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressCreateAccountButton();

        createAccountSteps.createAccount(randomEmail(), REGISTERED_USER_PASSWORD);

        premiumSubsSteps.shouldSeePremMembshipPage()
                .pressLaterButton();
    }
}
