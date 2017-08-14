package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.InitialPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class InitialPageSteps extends ScenarioSteps {
    private InitialPage initialPage;

    @Step("InitialPage is visible")
    public InitialPageSteps initialPageIsVisible() {
        initialPage.mascotLogo.waitUntilVisible();
        assertThat("Should see Crunchyroll mascot logo",
                initialPage.mascotLogo.isCurrentlyVisible(), is(true));
        return this;
    }

    @Step("Press Log In button")
    public InitialPageSteps pressLoginButton() {
        initialPage.clickOnElement(initialPage.loginButton);
        return this;
    }

    @Step("Press Create Account button")
    public InitialPageSteps pressCreateAccountButton() {
        initialPage.clickOnElement(initialPage.createAccountButton);
        return this;
    }
}
