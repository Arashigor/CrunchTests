package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;
import steps.components.BottomNavigationBarSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HomePageSteps extends ScenarioSteps {

    private HomePage homePage;

    @Steps
    public BottomNavigationBarSteps bottomNavBarSteps;

    @Step("Should sse Home Page [My Queue]")
    public HomePageSteps shouldSeeHomePageQueue() {
        homePage.waitForElement(homePage.emptyQueueLogo);
        assertThat("Should be at Home Page[My Queue]",
                homePage.emptyQueueLogo.isCurrentlyVisible(),
                is(true));
        return this;
    }

    @Step("Should see Home Page [History]")
    public HomePageSteps shouldSeeHomePageHistory() {
        homePage.waitForElement(homePage.emptyHistoryLogo);
        assertThat("Should be at Home Page[History]",
                homePage.emptyHistoryLogo.isCurrentlyVisible(),
                is(true));
        return this;
    }

    @Step("Swipe page '{0}'")
    public HomePageSteps swipePage(String where) {
        homePage.swipe(where);
        return this;
    }
}
