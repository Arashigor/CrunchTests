package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

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
                .buttonIsSelected("Anime")
                .selectButton("New")
                .buttonIsSelected("New");

        newPageSteps.newAnimePageIsVisible()
                .clickOnAnimeTitle();

        animeTitleSteps.animeTitlePageIsVisible()
                .pressStartButton();

        playerSteps.playerIsVisible();
    }
}
