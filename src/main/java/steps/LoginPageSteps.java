package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static pages.LoginPage.CORRECT_EMAIL_NO_PASSWORD_MSG;
import static pages.LoginPage.EMPTY_CREDENTIALS_MSG;
import static pages.LoginPage.INCORRECT_LOGIN_INFO_MSG;

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

        String error = "";
        switch (errorMessage) {
            case EMPTY_CREDENTIALS_MSG :
                loginPage.waitForElement(loginPage.errorEmptyCredentials);
                error = loginPage.errorEmptyCredentials.getText();
                break;
            case CORRECT_EMAIL_NO_PASSWORD_MSG :
                loginPage.waitForElement(loginPage.errorEmptyPassword);
                error = loginPage.errorEmptyPassword.getText();
                break;
            case INCORRECT_LOGIN_INFO_MSG :
                loginPage.waitForElement(loginPage.errorIncorrectMailPass);
                error = loginPage.errorIncorrectMailPass.getText();
                break;
        }
        System.out.println(error);
        assertThat("Should see error message",
                error.equals(errorMessage) , is(true));
        return this;
    }

    @Step("Login NavigationBar should be visible")
    public LoginPageSteps loginPageIsVisible() {
        loginPage.loginButton.waitUntilVisible();
        assertThat("Should see login NavigationBar",
                loginPage.loginButton.isCurrentlyVisible(), is(true));
        return this;
    }

    @Step("Press X button")
    public LoginPageSteps pressXButton() {
        loginPage.clickOnElement(loginPage.XButton);
        return this;
    }

    @Step("Press Later button")
    public LoginPageSteps pressLater() {
        loginPage.clickOnElement(loginPage.laterButton);
        return this;
    }
}
