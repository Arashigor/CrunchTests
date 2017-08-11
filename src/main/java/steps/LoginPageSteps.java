package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
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

    @Step("User should receive error message: '{0}'")
    public LoginPageSteps shouldSeeErrorMessageAboutEmptyCredentials(String errorMessage) {
        switch (errorMessage) {
            case LoginPage.EMPTY_CREDENTIALS_MSG :
                loginPage.waitForTextToAppear(loginPage.emptyCredentialsMsg, errorMessage);
                MatcherAssert.assertThat("Error message is shown",loginPage.emptyCredentialsMsg.getText().equals(LoginPage.EMPTY_CREDENTIALS_MSG));
                break;
            case LoginPage.CORRECT_EMAIL_NO_PASSWORD_MSG :
                loginPage.waitForTextToAppear(loginPage.noPasswordMsg, errorMessage);
                MatcherAssert.assertThat("Error message is shown",loginPage.noPasswordMsg.getText().equals(LoginPage.CORRECT_EMAIL_NO_PASSWORD_MSG));
                break;
            case LoginPage.INCORRECT_LOGIN_INFO_MSG:
                loginPage.waitForTextToAppear(loginPage.invalidLoginMsg, errorMessage);
                MatcherAssert.assertThat("Error message is shown",loginPage.invalidLoginMsg.getText().equals(LoginPage.INCORRECT_LOGIN_INFO_MSG));
                break;
        }
        return this;
    }


}
