package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.SettingsPage;

import static common.DataStore.DIRECTION_DOWN;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SettingsSteps extends ScenarioSteps {

    private SettingsPage settingsPage;

    @Step("Should see Settings Page")
    public SettingsSteps shouldSeeSettingsPage() {
        settingsPage.waitForElement(settingsPage.settingsNavBar);
        assertThat("Should see Settings page",
                settingsPage.settingsNavBar.isCurrentlyVisible(),
                is(true));
        return this;
    }

    @Step("Scroll to Log Out button")
    public SettingsSteps scrollToLogOut() {
        for (int i = 0; i < 10 && !settingsPage.logOutButton.isVisible(); i++) {
            settingsPage.scroll(DIRECTION_DOWN);
        }
        return this;
    }

    @Step("Press Log Out button")
    public SettingsSteps logOut() {
        settingsPage.clickOnElement(settingsPage.logOutButton);
        return this;
    }

    @Step("Should be logged in")
    public SettingsSteps shouldBeLoggedIn() {
        assertThat("Should not see Log Out button",
                settingsPage.logOutButton.isCurrentlyVisible(),
                is(false));
        return this;
    }

}
