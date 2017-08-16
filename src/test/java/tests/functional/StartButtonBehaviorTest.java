package tests.functional;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ANIME_NAV;
import static common.DataStore.NEW_NAV;

public class StartButtonBehaviorTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"functional"})
    @Title("'START' button behavior - 408501")
    public void startButtonBehaviorTest() {

        animePageSteps.animePageIsVisible();

        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(NEW_NAV)
                .buttonIsSelected(NEW_NAV);

        newPageSteps.newAnimePageIsVisible()
                .clickOnAnimeTitle();

        animeTitleSteps.animeTitlePageIsVisible()
                .pressStartButton();

        playerSteps.playerIsVisible();
    }
}
