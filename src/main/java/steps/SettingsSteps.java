package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.SettingsPage;

import static common.DataStore.DIRECTION_DOWN;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SettingsSteps extends ScenarioSteps {

    private SettingsPage settingsPage;

    @Step("Settings page is visible")
    public SettingsSteps isSettingPageVisible() {
        settingsPage.waitForElement(settingsPage.settingsNavBar);
        assertThat("Should see Settings page",
                settingsPage.settingsNavBar.isCurrentlyVisible(),
                is(true));
        return this;
    }

    @Step("Scroll to Log Out button")
    public SettingsSteps scrollToLogOut() {
        while (!settingsPage.logOutButton.isVisible()) {
            settingsPage.scroll(DIRECTION_DOWN);
        }
        return this;
    }

    @Step("Press Log Out button")
    public SettingsSteps logOut() {
        settingsPage.clickOnElement(settingsPage.logOutButton);
        return this;
    }

    @Step("User logged out")
    public SettingsSteps isUserLoggedOut() {
        assertThat("Shold not see Log Out button",
                settingsPage.logOutButton.isCurrentlyVisible(),
                is(false));
        return this;
    }

}
