package processtest.ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import processtest.ui.base.Base;
import processtest.ui.pages.TablePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.close;
import static processtest.ui.table.actions.Action.rowByCode;

public class TestTablePageElements extends Base {

    @AfterClass
    public static void tearDown() {
        close();
    }

    @Test
    public void open() {
        tablePage.openUrl(URL);
    }

    @Test
    public void searchTableElements() {
        rowByCode("353", "id").shouldHave(text("3"));
        rowByCode("353", "status").shouldHave(text("failed"));
    }


    /*Objects of testing pages*/
    private final TablePage tablePage = new TablePage();

    /*Constants for test data*/
    private static final String URL = "file:///C:/Users/ngrunin/IdeaProjects/Prozesstest/src/main/resources/table.html";
}
