package tests.navigation;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;

public class XandLaterButtonsBehaviorTest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("'X' & 'Later' buttons behavior - 7564")
    public void xAndLaterButtonsTest() {
        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.accountPageIsVisible()
                .pressLogin();

        loginPageSteps.loginPageIsVisible()
                .pressXButton();

        accountPageSteps.accountPageIsVisible()
                .pressLogin();

        loginPageSteps.loginPageIsVisible()
                .pressXButton();

        accountPageSteps.accountPageIsVisible();
    }

}
