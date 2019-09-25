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
        rowByCode(CODE, ID).shouldHave(text(EXPECTED_ID));
        rowByCode(CODE, STATUS).shouldHave(text(EXPECTED_STATUS));
    }


    /*Objects of testing pages*/
    private final TablePage tablePage = new TablePage();

    /*Constants for test data*/
    private static final String URL = "file:///C:/Users/ngrunin/IdeaProjects/Prozesstest/src/main/resources/table.html";
    private static final String CODE = "353";
    private static final String ID = "id";
    private static final String STATUS = "status";
    private static final String EXPECTED_ID = "3";
    private static final String EXPECTED_STATUS = "failed";
}
