package ui.pages;

import com.codeborne.selenide.SelenideElement;
import ui.annotation.FieldName;

import static com.codeborne.selenide.Selenide.$;

public class ContractPage {
    @FieldName(name="Добавить договор")
    public SelenideElement addContract = $("#addContractButton");
}
