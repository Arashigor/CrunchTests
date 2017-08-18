package tests.account.create;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ACCOUNT_NAV;

public class XandLaterButtonsBehaviorTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.shouldSeeNotificationPopup()
                .pressAllow();

        initialPageSteps.shouldSeeInitialPage()
                .pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("'X' & 'Later' buttons behavior - 7569")
    public void xAndLaterButtonsTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressCreateAccountButton();

        createAccountSteps.pressXButton();

        accountPageSteps.pressCreateAccountButton();

        createAccountSteps.pressLater();

        accountPageSteps.shouldSeeAccountPage();
    }

}
