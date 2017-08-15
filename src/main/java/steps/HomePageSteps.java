package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HomePageSteps extends ScenarioSteps {

    private HomePage homePage;

    @Step("Home Page [My Queue] is Visible")
    public HomePageSteps homePageQueueIsVisible() {
        homePage.waitForElement(homePage.emptyQueueLogo);
        assertThat("Should be at Home Page[My Queue]",
                homePage.emptyQueueLogo.isCurrentlyVisible(),
                is(true));
        return this;
    }

    @Step("Home Page [My Queue] is Visible")
    public HomePageSteps homePageHistoryIsVisible() {
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
