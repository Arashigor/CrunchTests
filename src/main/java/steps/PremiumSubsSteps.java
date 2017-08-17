package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.PremiumSubsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PremiumSubsSteps extends ScenarioSteps {

    private PremiumSubsPage premiumSubsPage;

    @Step("Should see Premium Membership Page")
    public PremiumSubsSteps shouldSeePremMembshipPage() {
        premiumSubsPage.premiumMembershipNavBar.waitUntilVisible();
        assertThat("Should see login NavigationBar",
                premiumSubsPage.premiumMembershipNavBar.isCurrentlyVisible(), is(true));
        return this;
    }

    @Step("Press Later button")
    public void pressLaterButton() {
        premiumSubsPage.clickOnElement(premiumSubsPage.laterButton);
    }

}
