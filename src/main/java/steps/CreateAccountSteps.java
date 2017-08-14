package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CreateAccountPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CreateAccountSteps extends ScenarioSteps {
    private CreateAccountPage createAccountPage;

    @Step("Press Back Arrow")
    public CreateAccountSteps pressBackArrow() {
        createAccountPage.clickOnElement(createAccountPage.backArrowButton);
        return this;
    }

    @StepGroup("Create Account")
    public CreateAccountSteps createAccount(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        pressCreateAccountButton();
        return this;
    }

    @Step("Enter '{0}' email")
    public CreateAccountSteps enterEmail(String email) {
        createAccountPage.waitForElement(createAccountPage.emailField,5000).clear();
        createAccountPage.toMobileElem(createAccountPage.emailField).setValue(email);
        return this;
    }

    @Step("Enter password")
    public CreateAccountSteps enterPassword(String password) {
        createAccountPage.waitForElement(createAccountPage.passwordField,5000).clear();
        createAccountPage.toMobileElem(createAccountPage.passwordField).setValue(password);
        return this;
    }

    @Step("Press Create Account button")
    public CreateAccountSteps pressCreateAccountButton() {
        createAccountPage.clickOnElement(createAccountPage.createAccountButton);
        return this;
    }

    @Step("Create accout page is visible")
    public CreateAccountSteps createAccountPageIsVisible() {
        createAccountPage.createAccountNavBar.waitUntilVisible();
        assertThat("Should see Create Account Navigation Bar",
                createAccountPage.createAccountNavBar.isCurrentlyVisible(), is(true));
        return this;
    }
}
