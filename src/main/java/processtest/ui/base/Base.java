package processtest.ui.base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Browsers.CHROME;
import static java.lang.Boolean.TRUE;

/**
 * Provides basic configuration for test environment.
 * @author Nikolai Grunin
 */
public abstract class Base {
    @BeforeSuite
    public void setUp() {
        /**Setup for local running of test*/
        Configuration.browser = CHROME;
        Configuration.startMaximized = TRUE;
        Configuration.timeout = 30000;
    }
}
