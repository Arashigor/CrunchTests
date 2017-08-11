package steps;

import common.DataStore;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

public class LoginPageSteps extends ScenarioSteps {
    private LoginPage loginPage;

    @Step("Press Back Arrow")
    public LoginPageSteps pressBackArrow() {
        loginPage.backArrowButton.click();
        return this;
    }

    @Step("Enter email")
    public LoginPageSteps enterEmail(String email) {
        loginPage.utils.waitForElement(loginPage.emailField,5000).clear();
        loginPage.utils.toMobileElem(loginPage.emailField).setValue(email);
        return this;
    }

    @Step("Enter password")
    public LoginPageSteps enterPassword(String password) {
        loginPage.utils.waitForElement(loginPage.passwordField,5000).clear();
        loginPage.utils.toMobileElem(loginPage.passwordField).setValue(password);
        return this;
    }

    @Step("Login as existing user")
    public LoginPageSteps pressLoginButton() {
        loginPage.loginButton.click();
        return this;
    }
}
