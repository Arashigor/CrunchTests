package tests.account.create;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ACCOUNT_NAV;
import static common.DataStore.ANIME_NAV;

public class CreateAccountScreenGUITest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("GUI of the 'Create Account' screen - 7568")
    public void logInGUITest() {
        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(ACCOUNT_NAV)
                .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.accountPageIsVisible()
                .pressCreateAccountButton();

        createAccountSteps.createAccountPageIsVisible();
    }
}
