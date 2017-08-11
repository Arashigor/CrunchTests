package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.InitialPage;

public class InitialPageSteps extends ScenarioSteps {
    private InitialPage initialPage;

    @Step("Press Log In button")
    public InitialPageSteps pressLoginButton() {
        initialPage.loginButton.click();
        return this;
    }

    @Step("Press Create Account button")
    public InitialPageSteps pressCreateAccountButton() {
        initialPage.createAccountButton.click();
        return this;
    }
}
