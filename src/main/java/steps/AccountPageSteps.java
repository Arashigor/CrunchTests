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

    @Step("Press X to Log Out")
    public AccountPageSteps pressXtoLogout() {
        accountPage.clickOnElement(accountPage.logOutXbutton);
        return this;
    }

    @Step("Is User logged out")
    public AccountPageSteps isUserLoggedOut() {

        accountPage.waitForElement(accountPage.loginButton);

        assertThat("Should see Log in button",
                accountPage.loginButton.isCurrentlyVisible(), is(true));

        assertThat("Should not see email in",
                accountPage.userEmailButton.isCurrentlyVisible(), is(false));
        return this;
    }

    @Step("Is Logout PopUp visible")
    public AccountPageSteps isLogoutPopUpVisible() {
        accountPage.waitForElement(accountPage.logoutPopUp);

        assertThat("Should see LogOut PopUp",
                accountPage.logoutPopUp.isCurrentlyVisible(), is(true));

        return this;
    }

    @Step("Press Log Out on PopUp window")
    public AccountPageSteps pressLogOutPopUp() {
        accountPage.clickOnElement(accountPage.getLogoutApprove());
        return this;
    }
}
