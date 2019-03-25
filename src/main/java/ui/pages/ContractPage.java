package ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ui.annotation.FieldName;

import java.util.List;

public class ContractPage extends BasePageObject{

    @FieldName(name = "Добавить договор")
    @FindBy(id = "addContractButton")
    public SelenideElement addContract;


    @Override
    public SelenideElement getField(String name) throws Exception {
        return getField(name, "ui.pages.ContractPage");
    }

    @Override
    public List<SelenideElement> getFields(String name) throws Exception {
        return getFields(name, "ui.pages.ContractPage");
    }
}
