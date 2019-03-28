package ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ui.annotation.FieldName;

import java.util.List;

public class ContractPage extends BasePageObject{

    @FieldName(name = "Добавить договор")
    @FindBy(id = "addContractButton")
    public SelenideElement addContract;

    @FieldName(name = "Номер договора")
    @FindBy(id = "")
    public SelenideElement numberContract;

    @FieldName(name = "Дата подписания")
    @FindBy(id = "")
    public SelenideElement dateSigningContract;

    @FieldName(name = "Дата окончания действия")
    @FindBy(id = "")
    public SelenideElement dateExpirationContract;

    @FieldName(name = "Наименование договора")
    @FindBy(id = "")
    public SelenideElement nameContract;

    @FieldName(name = "Дата начала предоставления услуги")
    @FindBy(id = "")
    public SelenideElement startDateService;

    @FieldName(name = "Дата окончания предоставления услуги")
    @FindBy(id = "")
    public SelenideElement endDateService;

    @FieldName(name = "Наименование контрагента в договоре")
    @FindBy(id = "")
    public SelenideElement nameContractorInContract;


    @Override
    public SelenideElement getField(String name) throws Exception {
        return getField(name, "ui.pages.ContractPage");
    }

    @Override
    public List<SelenideElement> getFields(String name) throws Exception {
        return getFields(name, "ui.pages.ContractPage");
    }
}
