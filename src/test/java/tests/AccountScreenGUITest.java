package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

public class AccountScreenGUITest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();
    }

    @Test
    @WithTagValuesOf({ "other" })
    @Title("GUI of the 'Account' screen - Anonymous User - 413845")
    public void accountPageGUITest() {
        initialPageSteps.initialPageIsVisible()
                        .pressJustExplore();

        bottomNavBarSteps.addAllButtonsToList()
                         .buttonIsSelected("Anime")
                         .selectButton("Account")
                         .buttonIsSelected("Account");

        accountPageSteps.accountPageIsVisible();
    }
}
