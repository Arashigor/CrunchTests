package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.NotificationPopupPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NotificationPopupSteps extends ScenarioSteps {

    private NotificationPopupPage popupPage;

    @Step("Should see Notification PopUp")
    public NotificationPopupSteps shouldSeeNotificationPopup() {
        popupPage.popupWindow.waitUntilVisible();
        assertThat("Should see notification popup", popupPage.popupWindow.isCurrentlyVisible(), is (true));
        return this;
    }

    @Step("Press Allow")
    public NotificationPopupSteps pressAllow() {
        popupPage.clickOnElement(popupPage.popupAllow);
        return this;
    }

    @Step("Press Don`t Allow")
    public NotificationPopupSteps pressDontAllow() {
        popupPage.clickOnElement(popupPage.popupDeny);
        return this;
    }

}
