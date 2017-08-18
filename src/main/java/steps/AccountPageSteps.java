package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.AccountPage;
import components.BottomNavigationBar;
import steps.components.BottomNavigationBarSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountPageSteps {

    private AccountPage accountPage;

    @Steps
    public BottomNavigationBarSteps bottomNavBarSteps;

    @Step("Should see Account Page")
    public AccountPageSteps shouldSeeAccountPage() {
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

    @Step("Press Settings button")
    public AccountPageSteps pressSettingsButton() {
        accountPage.clickOnElement(accountPage.settingsButton);
        return this;
    }

    @Step("Should be logged in")
    public AccountPageSteps shouldBeLoggedIn() {
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

    @Step("Should be logged out")
    public AccountPageSteps shouldBeLoggedOut() {

        accountPage.waitForElement(accountPage.loginButton);

        assertThat("Should see Log in button",
                accountPage.loginButton.isCurrentlyVisible(), is(true));

        assertThat("Should not see email in",
                accountPage.userEmailButton.isCurrentlyVisible(), is(false));

        return this;
    }

    @Step("Should be Logout PopUp visible")
    public AccountPageSteps shouldSeeLogOutPopUp() {
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

    @Step("Should see Upgrade Account banner")
    public AccountPageSteps shouldSeeUpgradeAccountBanner() {
        accountPage.upgradeAccount.shouldBeVisible();
        return this;
    }
}
