package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginPageSteps extends ScenarioSteps {
    private LoginPage loginPage;

    @StepGroup("Preform Log In")
    public LoginPageSteps logIn(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        pressLoginButton();
        return this;
    }

    @Step("Press Back Arrow")
    public LoginPageSteps pressBackArrow() {
        loginPage.clickOnElement(loginPage.backArrowButton);
        return this;
    }

    @Step("Enter data in email field")
    public LoginPageSteps enterEmail(String email) {
        loginPage.waitForElement(loginPage.emailField,5000).clear();
        loginPage.toMobileElem(loginPage.emailField).setValue(email);
        return this;
    }

    @Step("Enter data in password field")
    public LoginPageSteps enterPassword(String password) {
        loginPage.waitForElement(loginPage.passwordField,5000).clear();
        loginPage.toMobileElem(loginPage.passwordField).setValue(password);
        return this;
    }

    @Step("Press Login button")
    public LoginPageSteps pressLoginButton() {
        loginPage.clickOnElement(loginPage.loginButton);
        return this;
    }

    @Step("User should see error message: '{0}'")
    public LoginPageSteps shouldSeeErrorMessage(String errorMessage) {
        loginPage.getError().waitUntilVisible();
        assertThat("Should see error message",
              loginPage.getError().getText().equals(errorMessage), is(true));
        return this;
    }

    @Step("Login NavigationBar should be visible")
    public LoginPageSteps loginNavBarIsVisible() {
        loginPage.logInNavigationBar.waitUntilVisible();
        assertThat("Should see login NavigationBar",
                loginPage.logInNavigationBar.isCurrentlyVisible(), is(true));
        return this;
    }
}
