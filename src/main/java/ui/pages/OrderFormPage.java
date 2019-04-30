package ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ui.annotation.Name;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OrderFormPage extends BasePageObject{

    @Name(name="Welcome to frontend")
    public SelenideElement frontend = $("body > app-root > div > h1");

    @Name(name="Создать")
    public SelenideElement createOrderForm = $("#b_create");

    @Name(name="Сохранить")
    public SelenideElement saveOrderForm = $("#b_save");

    // раздел Бланк заказа
    @Name(name="Заголовок раздела Бланк заказа")
    public SelenideElement titleOrderForm = $("order-form-section > div > div.order-section-header");

    @Name(name = "Значение из списока продуктов")
    public ElementsCollection productList = $$("mat-option> span");

    @Name(name = "Продукт")
    public SelenideElement product = $("#mat-select-0 > div > div.mat-select-value > span");

//    @Name(name="Номер бланка заказа")
//    public SelenideElement  = $("#");

    // блок выбора Договора
    @Name(name="Заголовок блока Договор")
    public SelenideElement contractBlockTitle = $("#s_contract");

    @Name(name = "Заголовок поля номер договора")
    public SelenideElement l_contractNumber = $("#l_contractNumber");

    @Name(name = "Номер договора")
    public SelenideElement contractNumber = $("#v_contractNumber");

    @Name(name = "Заголовок поля дата подписания")
    public SelenideElement l_dateSigningContract = $("#l_createDate");

    @Name(name = "Дата подписания")
    public SelenideElement dateSigningContract = $("#v_createDate");

    @Name(name = "Заголовок поля дата окончания действия")
    public SelenideElement l_dateExpirationContract = $("#l_endServiceDate");

    @Name(name = "Дата окончания действия")
    public SelenideElement dateExpirationContract = $("#v_endServiceDate");

    @Name(name = "Наименование услуги")
    public SelenideElement nameService = $("#v_serviceName");

    @Name(name = "Дата начала предоставления услуги")
    public SelenideElement startDateService = $("#v_startServiceDate");

    @Name(name = "Дата окончания предоставления услуги")
    public SelenideElement endDateService = $("#v_endServiceContract");

    // блок выбора Контрагента
    @Name(name="Заголовок блока Контрагент")
    public SelenideElement contractorBlockTitle = $("#s_contractor");

    @Name(name = "Наименование контрагента")
    public SelenideElement contractorFullName = $("#v_fullName");

    @Name(name = "Телефон контрагента")
    public SelenideElement phoneContractor = $("#v_cphone");

    @Name(name = "ИНН контрагента")
    public SelenideElement innContractor = $("#v_cinn");

    @Name(name = "КПП контрагента")
    public SelenideElement kppContractor = $("#v_ckpp");

    @Name(name = "ОГРН контрагента")
    public SelenideElement ogrnContractor = $("#v_cogrn");

    @Name(name = "Юридический адрес контрагента")
    public SelenideElement lAddressContractor = $("#v_clAddress");

    @Name(name = "Фактический адрес контрагента")
    public SelenideElement aAddressContractor = $("#v_caAddress");

    // блок выбора Отправителя
    @Name(name = "Наименовнаие отправителя")
    public SelenideElement nameSender = $("#v_nameSender");

    @Name(name = "Телефон отправителя")
    public SelenideElement phoneSender = $("#v_phone");

    @Name(name = "ИНН отправителя")
    public SelenideElement innSender = $("#v_inn");

    @Name(name = "КПП отправителя")
    public SelenideElement kppSender = $("#v_kpp");

    @Name(name = "ОГРН отправителя")
    public SelenideElement ogrnSender = $("#v_ogrn");

    @Name(name = "Юридический адрес отправителя")
    public SelenideElement legalAddressSender = $("#v_legalAddress");

    @Name(name = "Фактический адрес отправителя")
    public SelenideElement actualAddressSender = $("#v_actualAddress");

    @Name(name = "Код подразделения")
    public SelenideElement depCodeSender = $("#v_depCode");

    @Name(name = "Категория")
    public SelenideElement categorySender = $("#v_category");

    @Name(name = "Email")
    public SelenideElement emailSender = $("#v_email");

    //раздел Отправление
    @Name(name = "Вид отправления")
    public ElementsCollection typeOfDeparture = $$("div>mat-option > span");

    @Name(name = "Категория отправления")
    public ElementsCollection departureCategory = $$("div>mat-option > span");

    @Name(name = "Классификация отправления")
    public ElementsCollection shipmentClassification = $$("div>mat-option > span");

    @Name(name = "Отметки отправления")
    public ElementsCollection departureMarks = $$("div>mat-option > span");

    @Name(name = "Разряд почтового отправления")
    public ElementsCollection postDischarge = $$("div>mat-option > span");

    @Name(name = "Выполнение операций совмещения и приклеивания")
    public ElementsCollection performingAlignmentAndGluingOperations = $$("div>mat-option > span");

    @Override
    public SelenideElement getField(String name) throws Exception {
        return getField(name, "ui.pages.OrderFormPage");
    }

    @Override
    public ElementsCollection getCollection(String name) throws Exception {
        return getCollection(name, "ui.pages.OrderFormPage");
    }
}
