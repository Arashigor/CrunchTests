package tests.home;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;

public class NavigationBetweenHomePageTabsTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();
    }

    @Test
    @WithTagValuesOf({"smoke"})
    @Title("Navigation between the tabs - 377796")
    public void navigationBetweenTabsTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(HOME_NAV);

        homePageSteps.swipePage(DIRECTION_LEFT)
                .shouldSeeHomePageHistory()
                .swipePage(DIRECTION_RIGHT)
                .shouldSeeHomePageQueue();
    }

}
