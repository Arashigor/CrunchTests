package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import components.BottomNavigationBar;
import pages.NewPage;
import steps.components.BottomNavigationBarSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NewPageSteps extends ScenarioSteps {

    private NewPage newPage;

    @Steps
    public BottomNavigationBarSteps bottomNavBarSteps;

    @Step("Should see New Anime Page")
    public NewPageSteps shouldSeeNewAnimePage() {
        //TODO check
        return this;
    }

    @Step("Click on a new anime title")
    public NewPageSteps clickOnAnimeTitle() {
        newPage.clickOnElement(newPage.getFirstAnimeTitle());
        return this;
    }
}
