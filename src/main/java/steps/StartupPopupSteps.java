package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.StartupPopupPage;

public class StartupPopupSteps extends ScenarioSteps {
    private StartupPopupPage popupPage;

    @Step("Press Allow")
    public StartupPopupSteps pressAllow() {
        popupPage.popupAllow.click();
        return this;
    }

    @Step("Press Don`t Allow")
    public StartupPopupSteps pressDontAllow() {
        popupPage.popuDeny.click();
        return this;
    }

}
