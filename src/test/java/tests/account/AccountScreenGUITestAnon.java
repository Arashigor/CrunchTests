package tests.account;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ACCOUNT_NAV;

public class AccountScreenGUITestAnon extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.pressDontAllow();
    }

    @Test
    @WithTagValuesOf({ "other" })
    @Title("GUI of the 'Account' screen - Anonymous User - 413845")
    public void accountPageGUITest() {
        initialPageSteps.pressJustExplore();

        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                         .selectButton(ACCOUNT_NAV);

        accountPageSteps.shouldSeeAccountPage();
    }
}
