package tests;

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
        initialPageSteps.initialPageIsVisible()
                .pressLoginButton();

        loginPageSteps.loginPageIsVisible()
                .pressBackArrow();

        initialPageSteps.initialPageIsVisible()
                .pressCreateAccountButton();

        createAccountSteps.createAccountPageIsVisible()
                .pressBackArrow();
    }

}
