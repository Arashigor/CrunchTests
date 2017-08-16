package steps;

import net.thucydides.core.annotations.Step;
import pages.AccountPage;
import pages.BottomNavigationBarPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountPageSteps {

    private AccountPage accountPage;
    private BottomNavigationBarPage bottomNavBarPage;

    @Step("Account Page is Visible")
    public AccountPageSteps accountPageIsVisible() {
        accountPage.accountNavBar.waitUntilVisible();
        assertThat("Should be visible Account Page",
                accountPage.accountNavBar.isCurrentlyVisible(),
                is(true));
        return this;
    }

    @Step("Press Log In button")
    public AccountPageSteps pressLogin() {
        accountPage.clickOnElement(accountPage.loginButton);
        return this;
    }

    @Step("Press Create Account button")
    public AccountPageSteps pressCreateAccountButton() {
        accountPage.clickOnElement(accountPage.createAccountButton);
        return  this;
    }

    @Step("User logged in")
    public AccountPageSteps isUserLoggedIn() {
        assertThat("Should not see Log in button",
                accountPage.loginButton.isCurrentlyVisible(), is(false));

        accountPage.waitForElement(accountPage.userEmailButton);
        assertThat("Should be logged in",
                accountPage.userEmailButton.isCurrentlyVisible(), is(true));
        return this;
    }
}
