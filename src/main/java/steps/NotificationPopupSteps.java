package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.NotificationPopupPage;

public class NotificationPopupSteps extends ScenarioSteps {
    private NotificationPopupPage popupPage;

    @Step("Press Allow")
    public NotificationPopupSteps pressAllow() {
        popupPage.utils.clickOnElement(popupPage.popupAllow);
        return this;
    }

    @Step("Press Don`t Allow")
    public NotificationPopupSteps pressDontAllow() {
        popupPage.utils.clickOnElement(popupPage.popuDeny);
        return this;
    }

}
