package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

public class FirstLaunchTest extends BaseTest {
    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "critical"})
    @Title("First launch popup notification test")
    public void firstLaunchAllowNotifications() {
        startupPopupSteps.pressAllow();
    }

    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "critical"})
    @Title("First launch popup notification test")
    public void firstLaunchDontAllowNotifications() {
        startupPopupSteps.pressDontAllow();
    }
}
