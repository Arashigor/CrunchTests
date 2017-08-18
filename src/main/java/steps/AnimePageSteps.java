package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import pages.AnimePage;
import steps.components.BottomNavigationBarSteps;

public class AnimePageSteps extends ScenarioSteps {

    private AnimePage animePage;

    @Steps
    public BottomNavigationBarSteps bottomNavBarSteps;

    @Step("Should see anime page")
    public AnimePageSteps shouldSeeAnimePage() {
        //TODO check
        return this;
    }

    @Step("Scroll '{0}'")
    public AnimePageSteps scrollPage(String direction) {
        animePage.scroll(direction);
        return this;
    }
}
