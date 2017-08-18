package components;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.AbstractPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BottomNavigationBar extends AbstractPage {

    @iOSFindBy(accessibility = "Home")
    public WebElementFacade homeButton;

    @iOSFindBy(accessibility = "New")
    public WebElementFacade newButton;

    @iOSFindBy(accessibility = "Anime")
    public WebElementFacade animeButton;

    @iOSFindBy(accessibility = "Drama")
    public WebElementFacade dramaButton;

    @iOSFindBy(accessibility = "Account")
    public WebElementFacade accountButton;

    public List<WebElementFacade> navBarButtons = new ArrayList<>(5);

    public WebElementFacade getSelectedNavBarButton() {
        return navBarButtons.stream()
                .filter(w -> w.getValue() != null)
                .findFirst()
                .orElse(null);
    }

    public WebElementFacade getRequiredNavBarButton(String buttonText) {
       return navBarButtons.stream()
                .filter(w -> w.getAttribute("name").equals(buttonText))
                .findAny()
                .orElse(null);
    }

}
