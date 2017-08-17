package tests.appstart;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

public class BackArrowBehaviorTest extends BaseTest {

    @Before
    public void before() {}

    @Test
    @WithTagValuesOf({ "smoke" })
    @Title("Back Arrow behavior test - 358224")
    public void backArrowBehaviorTest() {
        initialPageSteps
                .pressLoginButton();

        loginPageSteps.shouldSeeLoginPage()
                .pressBackArrow();

        initialPageSteps.shouldSeeInitialPage()
                .pressCreateAccountButton();

        createAccountSteps.pressBackArrow();

        initialPageSteps.shouldSeeInitialPage();
    }

}
