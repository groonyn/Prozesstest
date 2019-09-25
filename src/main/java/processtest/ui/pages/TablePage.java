package processtest.ui.pages;

import static com.codeborne.selenide.Selenide.open;

/**
 /**
 * Class describing the page of table for using in tests.
 * @author Nikolai Grunin
 */

public class TablePage {
    public TablePage openUrl(String url) {
        open(url);
        return this;
    }
}
