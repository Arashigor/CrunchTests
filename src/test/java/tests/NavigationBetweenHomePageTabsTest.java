package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;

public class NavigationBetweenHomePageTabsTest extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.pressJustExplore();
    }

    @Test
    @WithTagValuesOf({"smoke"})
    @Title("Successfully Loged In from Account screen - 377796")
    public void navigationBetweenTabsTest() {
        bottomNavBarSteps.addAllButtonsToList()
                .buttonIsSelected(ANIME_NAV)
                .selectButton(HOME_NAV)
                .buttonIsSelected(HOME_NAV);

        homePageSteps.homePageQueueIsVisible();

        homePageSteps.swipePage("left")
                .homePageHistoryIsVisible()
                .swipePage("right")
                .homePageQueueIsVisible();
    }

}
