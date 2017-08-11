package steps;

import net.thucydides.core.annotations.Step;
import pages.PremiumSubsPage;

public class PremiumSubsSteps {
    private PremiumSubsPage premiumSubsPage;

    @Step("Press Later button")
    public void pressLaterButton() {
        premiumSubsPage.laterButton.click();
    }
}
