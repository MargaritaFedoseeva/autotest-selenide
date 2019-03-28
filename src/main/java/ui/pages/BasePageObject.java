package ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ui.annotation.FieldName;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public abstract class BasePageObject {

    public abstract SelenideElement getField(String name) throws Exception;

    public SelenideElement getField(String name, String className) throws Exception {
        Class example = Class.forName(className);
        List<Field> fields = Arrays.asList(example.getFields());
        for (Field field : fields) {
            if (field.getAnnotation(FieldName.class).name().equals(name)) {
                return $(By.id(field.getAnnotation(FindBy.class).id()));
            }
        }
        Assert.fail("Не объявлен элемент с наименованием " + name);
        return null;
    }

    public abstract List<SelenideElement> getFields(String name) throws Exception;

    public List<SelenideElement> getFields(String name, String className) throws Exception {
        Class example = Class.forName(className);
        List<Field> fields = Arrays.asList(example.getFields());
        for (Field field : fields) {
            if (field.getAnnotation(FieldName.class).name().equals(name)) {
                return $$(By.id(field.getAnnotation(FindBy.class).id()));
            }
        }
        Assert.fail("Не объявлен элемент с наименованием " + name);
        return null;
    }

    // заполнить поле
    public void fillField(SelenideElement field, String value) {
        field.setValue(value);

    }

    public void click(String name) throws Exception {
        SelenideElement element = getField(name);
         element.click();
    }

    public void fillField(String name, String value) throws Exception {
        SelenideElement element = getField(name);
        fillField(element, value);

    }

    public void click(int num, String name) throws Exception {
        List<SelenideElement> elements = getFields(name);
        elements.get(num - 1).click();
    }

    public void click(String name, String value) throws Exception {
        List<SelenideElement> elements = getFields(name);
        for (SelenideElement element : elements) {
            if (element.getText().equalsIgnoreCase(value)) {
                element.click();
                break;
            }

        }
    }

}
