package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.PlayerPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlayerSteps extends ScenarioSteps {

    private PlayerPage playerPage;

    @Step("Should see Player Page")
    public PlayerSteps shouldSeePlayerPage() {
        assertThat("Should see player interface", playerPage.waitForElement(playerPage.pauseButton).isCurrentlyVisible(), is(true));
        return this;
    }
}
