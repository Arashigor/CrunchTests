package steps;

import net.thucydides.core.annotations.Step;
import pages.AnimeTitlePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AnimeTitleSteps {
    private AnimeTitlePage animeTitlePage;

    //C408501

    @Step("Anime Title Page is visible")
    public AnimeTitleSteps animeTitlePageIsVisible() {
        assertThat("Should be selected 'New' in bottom navigation bar",
                animeTitlePage.startButton.isVisible(),
                is(true));
        return this;
    }

}
