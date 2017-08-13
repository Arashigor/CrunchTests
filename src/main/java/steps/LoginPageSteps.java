package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import pages.LoginPage;

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
        loginPage.utils.clickOnElement(loginPage.backArrowButton);
        return this;
    }

    @Step("Enter data in email field")
    public LoginPageSteps enterEmail(String email) {
        loginPage.utils.waitForElement(loginPage.emailField,5000).clear();
        loginPage.utils.toMobileElem(loginPage.emailField).setValue(email);
        return this;
    }

    @Step("Enter data in password field")
    public LoginPageSteps enterPassword(String password) {
        loginPage.utils.waitForElement(loginPage.passwordField,5000).clear();
        loginPage.utils.toMobileElem(loginPage.passwordField).setValue(password);
        return this;
    }

    @Step("Press Login button")
    public LoginPageSteps pressLoginButton() {
        loginPage.utils.clickOnElement(loginPage.loginButton);
        return this;
    }

    @Step("User should see error message: '{0}'")
    public LoginPageSteps shouldSeeErrorMessage(String errorMessage) {
        MatcherAssert.assertThat("Error message is visible",
                loginPage.utils.isVisible(loginPage.getErrorMsgElem(errorMessage)), Matchers.is(true));
        return this;
    }
}
