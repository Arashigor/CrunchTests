package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.AllowNotificationPopupPage;

public class AllowNotificationPopupSteps extends ScenarioSteps {
    private AllowNotificationPopupPage popupPage;

    @Step("Press Allow")
    public AllowNotificationPopupSteps pressAllow() {
        popupPage.utils.clickOnElement(popupPage.popupAllow);
        return this;
    }

    @Step("Press Don`t Allow")
    public AllowNotificationPopupSteps pressDontAllow() {
        popupPage.utils.clickOnElement(popupPage.popuDeny);
        return this;
    }

}
