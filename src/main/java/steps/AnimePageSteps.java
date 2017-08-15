package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.AnimePage;

public class AnimePageSteps extends ScenarioSteps {

    private AnimePage animePage;

    @Step("Anime Page is visible")
    public AnimePageSteps animePageIsVisible() {
        //TODO check
        return this;
    }

    @Step("Scroll '{0}'")
    public AnimePageSteps scrollPage(String direction) {
        animePage.scroll(direction);
        return this;
    }
}
