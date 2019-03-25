package ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ui.annotation.FieldName;

import java.util.List;

public class LoginPage extends BasePageObject {

    @FieldName(name="Логин")
    @FindBy(id = "login")
    public SelenideElement login;

    @FieldName(name="Пароль")
    @FindBy(id = "password")
    public SelenideElement password;

    @FieldName(name="Войти")
    @FindBy(id = "loginButton")
    public SelenideElement loginButton;

    @Override
    public SelenideElement getField(String name) throws Exception {
        return getField(name, "ui.pages.LoginPage");
    }

    @Override
    public List<SelenideElement> getFields(String name) throws Exception {
        return getFields(name, "ui.pages.LoginPage");
    }
}
