package steps;

import net.thucydides.core.annotations.Step;
import pages.AnimeTitlePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AnimeTitleSteps {
    private AnimeTitlePage animeTitlePage;

    @Step("Should see Anime title Page")
    public AnimeTitleSteps shouldSeeAnimeTitlePage() {
        assertThat("Should be selected 'New' in bottom navigation bar",
                animeTitlePage.startButton.isVisible(),
                is(true));
        return this;
    }

    @Step("Press Start button")
    public AnimeTitleSteps pressStartButton() {
        animeTitlePage.clickOnElement(animeTitlePage.startButton);
        return this;
    }

}
