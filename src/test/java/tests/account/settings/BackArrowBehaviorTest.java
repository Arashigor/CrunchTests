package tests.account.settings;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ACCOUNT_NAV;

public class BackArrowBehaviorTest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"smoke"})
    @Title("Back arrow '<' behavior - 7599")
    public void backArrowTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressSettingsButton();

        settingsSteps.pressBackArrow();

        accountPageSteps.shouldSeeAccountPage();
    }

}
