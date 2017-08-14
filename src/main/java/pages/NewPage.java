package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class NewPage extends AbstractPage {
    private static final By newAnimeTitleList = By.className("XCUIElementTypeCell");

    public WebElementFacade getFirstAnimeTitle() {
        return findAll(newAnimeTitleList).get(0);
    }
}
