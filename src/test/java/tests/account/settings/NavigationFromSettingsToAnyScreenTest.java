package tests.account.settings;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ACCOUNT_NAV;
import static common.DataStore.ANIME_NAV;

public class NavigationFromSettingsToAnyScreenTest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"smoke"})
    @Title("Navigation from Settings to any screen - 413860")
    public void navigationFromSettingsTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressSettingsButton();

        settingsSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ANIME_NAV);

        animePageSteps.shouldSeeAnimePage();
    }
}
