package pages;

import common.Utils;
import net.serenitybdd.core.pages.PageObject;

public abstract class AbstractPage extends PageObject {
    public final Utils utils;

    public AbstractPage() {
        utils = new Utils();
    }

}
