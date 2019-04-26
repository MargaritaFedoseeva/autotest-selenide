package ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ui.annotation.Name;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageHms extends BasePageObject {

    @Name(name="Имя пользователя")
    public SelenideElement login = $("#username");

    @Name(name="Пароль")
    public SelenideElement password = $(By.id("password"));

    @Name(name="Войти")
    public SelenideElement loginButton = $(By.id("kc-login"));

    @Override
    public SelenideElement getField(String name) throws Exception {
        return getField(name, "ui.pages.LoginPageHms");
    }

    @Override
    public ElementsCollection getCollection(String name) throws Exception {
        return getCollection(name, "ui.pages.LoginPageHms");
    }
}
