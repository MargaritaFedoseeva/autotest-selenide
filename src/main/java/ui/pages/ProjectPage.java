package ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ui.annotation.FieldName;

import java.util.List;

public class ProjectPage extends BasePageObject {

    @FieldName(name = "Создать проект")
    @FindBy(id = "addProjectButton")
    public SelenideElement addProjectButton;

    @Override
    public SelenideElement getField(String name) throws Exception {
        return getField(name, "ui.pages.ProjectPage");
    }

    @Override
    public List<SelenideElement> getFields(String name) throws Exception {
        return getFields(name, "ui.pages.ProjectPage");
    }
}
