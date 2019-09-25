package processtest.ui.table.actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Action {
    public static SelenideElement rowByCode(String codeValue, String rowToCheck) {
        SelenideElement element;

        StringBuilder locatorBuilder = new StringBuilder("//tr/td[contains(text(),'");
        locatorBuilder.append(codeValue).append("')]");

        StringBuilder locator = new StringBuilder();
        if (rowToCheck.equals("id")) {
            locator.append(locatorBuilder).append("/parent::tr/td[1]");
        }
        if (rowToCheck.equals("status")) {
            locator.append(locatorBuilder).append("/parent::tr/td[3]");
        }
        element = $(By.xpath(locator.toString()));
        element.shouldBe(Condition.visible);

        return element;
    }
}
