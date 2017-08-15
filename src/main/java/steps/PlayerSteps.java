package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.PlayerPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlayerSteps extends ScenarioSteps {

    private PlayerPage playerPage;

    @Step("Player Page is visible")
    public PlayerSteps playerIsVisible() {
        playerPage.waitForElement(playerPage.pauseButton, 5);
        assertThat("Should see player interface", playerPage.pauseButton.isCurrentlyVisible(), is(true));
        return this;
    }
}
