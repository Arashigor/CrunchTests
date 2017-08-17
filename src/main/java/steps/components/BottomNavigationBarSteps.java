package steps.components;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import components.BottomNavigationBar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BottomNavigationBarSteps {

    private BottomNavigationBar bottomNavBarPage;

    @Step("Initialize list with all bottom NavBar buttons")
    public BottomNavigationBarSteps addAllButtonsToList() {
        bottomNavBarPage.navBarButtons.add(bottomNavBarPage.accountButton);
        bottomNavBarPage.navBarButtons.add(bottomNavBarPage.dramaButton);
        bottomNavBarPage.navBarButtons.add(bottomNavBarPage.animeButton);
        bottomNavBarPage.navBarButtons.add(bottomNavBarPage.newButton);
        bottomNavBarPage.navBarButtons.add(bottomNavBarPage.homeButton);
        return this;
    }

    @Step("Should be selected correct button - '{0}'")
    public BottomNavigationBarSteps shouldBeSelectedCorrectButton(String buttonText) {
        WebElementFacade button = bottomNavBarPage.getSelectedNavBarButton();

        assertThat("Should be selected correct button",
                button.getAttribute("name").equals(buttonText),
                is (true));
        return this;
    }

    @Step("Select button - '{0}'")
    public BottomNavigationBarSteps selectButton(String buttonText) {
        bottomNavBarPage.clickOnElement(bottomNavBarPage.getRequiredNavBarButton(buttonText));
        return this;
    }
}
