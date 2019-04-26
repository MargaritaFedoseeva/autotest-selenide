package ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ui.annotation.Name;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProjectPage extends BasePageObject {

    @Name(name = "Создать проект")
    public SelenideElement addProjectButton = $(By.id("addProjectButton"));

    @Override
    public SelenideElement getField(String name) throws Exception {
        return getField(name, "ui.pages.ProjectPage");
    }

    @Override
    public ElementsCollection getCollection(String name) throws Exception {
        return getCollection(name, "ui.pages.ProjectPage");
    }
}
