package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

public class BackArrowBehaviorTest extends BaseTest {
    @Test
    @WithTagValuesOf({ "smoke", "sanity", "production", "high"})
    @Title("Back Arrow behavior test")
    public void backArrowBehaviorTest() {

        startupPopupSteps.pressAllow();

        initialPageSteps.pressLoginButton();
        loginPageSteps.pressBackArrow();
        initialPageSteps.pressCreateAccountButton();
        loginPageSteps.pressBackArrow();
    }
}
