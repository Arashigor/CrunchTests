package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.BottomNavigationBarPage;
import pages.NewPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NewPageSteps extends ScenarioSteps {

    private NewPage newPage;
    private BottomNavigationBarPage bottomNavigationBarPage;

    @Step("New Anime Page is visible")
    public NewPageSteps newAnimePageIsVisible() {
        //TODO check
        return this;
    }

    @Step("Click on a new anime title")
    public NewPageSteps clickOnAnimeTitle() {
        newPage.clickOnElement(newPage.getFirstAnimeTitle());
        return this;
    }
}
