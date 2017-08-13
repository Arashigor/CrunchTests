package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.PremiumSubsPage;

public class PremiumSubsSteps extends ScenarioSteps {
    private PremiumSubsPage premiumSubsPage;

    @Step("Press Later button")
    public void pressLaterButton() {
        premiumSubsPage.utils.clickOnElement(premiumSubsPage.laterButton);
    }
}
