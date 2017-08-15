package steps;

import net.thucydides.core.annotations.Step;
import pages.AccountPage;
import pages.BottomNavigationBarPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountPageSteps {

    private AccountPage accountPage;
    private BottomNavigationBarPage bottomNavBarPage;

    @Step("Account Page is Visible")
    public AccountPageSteps accountPageIsVisible() {
        accountPage.accountNavBar.waitUntilVisible();
        assertThat("Should be visible Account Page",
                accountPage.accountNavBar.isCurrentlyVisible(),
                is(true));
        return this;
    }
}
