package ui.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import ui.pages.BasePageObject;
import java.util.List;

import static com.codeborne.selenide.Condition.disabled;
import static org.junit.Assert.*;

public class ScenarioSteps {
    static String currentPageName;

    @Given("открыть браузер")
    public void open()
    {

    }
    @When("загружена страница \"(.*)\"")
    public void stepPageLoaded(String pageName) {
        currentPageName = pageName;
    }

    @When("в поле \"(.*)\" ввести значение \"(.*)\"")
    public void fillField(String name, String value) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.fillField(name, value);
    }

    @When("значение поля \"(.*)\" равно \"(.*)\"")
    public void checkField(String name, String value) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        assertEquals(value, page.getField(name).text());
    }

    @When("элемент \"(.*)\" не активен")
    public void disabled(String name) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        assertTrue(page.getField(name).getAttribute("disabled"), true);
        assertTrue(String.valueOf(page.getField(name).shouldBe(disabled)), true);
    }

    @When("элемент \"(.*)\" активен")
    public void notDisabled(String name) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        assertFalse(page.getField(name).getAttribute("disabled"), false);
    }

//    @When("елемент \"(.*)\" доступен")
//    public void checkIsEnabled(String name) throws Exception {
//        Class example = Class.forName("ui.pages." + currentPageName);
//        BasePageObject page = (BasePageObject) example.newInstance();
//        Assert.assertTrue("Кнопка - " + name + " не активна", page.getField(name).isEnabled());
//    }

    @When("выполнено нажатие на \"(.*)\"")
    public void click(String name) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.click(name);
    }

    @When("выполнено нажатие на (\\d+)-й элемент \"(.*)\"")
    public void clickItem(int num, String name) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.click(num, name);
    }

    @When("присутствует (\\d+)-й элемента \"(.*)\" с текстом \"(.*)\"")
    public void checkFieldItem(int num, String name, String value) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        List<SelenideElement> elements = page.getFields(name);
        Assert.assertEquals(value,  elements.get(num - 1).text());
    }

    @When("присутствует элемент \"(.*)\"")
    public void checkField(String name) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.getField(name).shouldBe(Condition.visible);
    }

    @When("выполнено нажатие на элемент \"(.*)\" с текстом \"(.*)\"")
    public void clickIem(String name,String value) throws Exception {
        Class example = Class.forName("ui.pages." + currentPageName);
        BasePageObject page = (BasePageObject) example.newInstance();
        page.click(name,value);
    }

    @When("заполняются поля:")
    public void fillFields(DataTable fields) throws Exception {
        fields.asMap(String.class, String.class).forEach(
                (k, v) -> {
                    try {
                        Thread.sleep(2000);
                        fillField(k, v);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    @When("поля заполнены значениями:")
    public void checkfillFields(DataTable fields) throws Exception {
        fields.asMap(String.class, String.class).forEach(
                (k, v) -> {
                    try {
                        checkField(k, v);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
