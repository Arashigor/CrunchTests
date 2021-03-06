package tests.popular;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ANIME_NAV;
import static common.DataStore.DIRECTION_DOWN;
import static common.DataStore.DIRECTION_UP;

public class ScrollingPopularScreenTest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("'Scrolling the POPULAR screen - 7487")
    public void scrollingPopularScreenTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList().shouldBeSelectedCorrectButton(ANIME_NAV);

        animePageSteps.shouldSeeAnimePage()
            .scrollPage(DIRECTION_DOWN)
            .scrollPage(DIRECTION_UP);
    }
}
