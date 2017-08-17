package tests.account.create;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

//Because on a slow device(iphone 5c) steps are switched extremely slow
//and because of the severe lack of element IDs
//it's hard to parse element dom tree(message simply disappears before any assert or even before pressLogin Step is finished)
public class ErrorCreateAccount extends BaseTest {

    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();
    }

    @Test
    @WithTagValuesOf({ "smoke"})
    @Title("Create Account Error messages - 7570")
    public void createAccountWithInvalidDataTest() {

    }
}
