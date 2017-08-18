package tests.animetitle;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.NEW_NAV;

public class StartButtonBehaviorTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"functional"})
    @Title("'START' button behavior - 408501")
    public void startButtonBehaviorTest() {

        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(NEW_NAV);

        newPageSteps.clickOnAnimeTitle();

        animeTitleSteps.pressStartButton();

        playerSteps.shouldSeePlayerPage();
    }
}
