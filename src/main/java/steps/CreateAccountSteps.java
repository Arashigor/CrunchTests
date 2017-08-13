package steps;

import common.DataStore;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CreateAccountPage;

public class CreateAccountSteps extends ScenarioSteps {
    private CreateAccountPage createAccountPage;

    @Step("Press Back Arrow")
    public CreateAccountSteps pressBackArrow() {
        createAccountPage.utils.clickOnElement(createAccountPage.backArrowButton);
        return this;
    }

    @Step("Enter email")
    public CreateAccountSteps enterEmail(String email) {
        createAccountPage.utils.waitForElement(createAccountPage.emailField,5000).clear();
        createAccountPage.utils.toMobileElem(createAccountPage.emailField).setValue(email);
        return this;
    }

    @Step("Enter password")
    public CreateAccountSteps enterPassword(String password) {
        createAccountPage.utils.waitForElement(createAccountPage.passwordField,5000).clear();
        createAccountPage.utils.toMobileElem(createAccountPage.passwordField).setValue(password);
        return this;
    }

    @Step("Press Create Account button")
    public CreateAccountSteps pressCreateAccountButton() {
        createAccountPage.utils.clickOnElement(createAccountPage.createAccountButton);
        return this;
    }
}
