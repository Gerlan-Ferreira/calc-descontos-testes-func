package net.quebradoresanonimos.calculator.e2e.pages;

import net.quebradoresanonimos.calculator.e2e.core.BasePage;
import net.quebradoresanonimos.calculator.e2e.core.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactFormPageObject extends BasePage {
    public ContactFormPageObject(WebDriver driver) {
        super(driver);
    }

    String name;
    String email;

    String type_message;

    String age;
    String writeHereYourMessage;

    public String getName() {
        return name;
    }

    public ContactFormPageObject setName(String name) {
        this.name = name;
        typeInputTextById(Locators.ID_NAME_FORM_CONTACT, name);
        return this;

    }

    public String getEmail() {
        return email;
    }

    public ContactFormPageObject setEmail(String email) {
        typeInputTextById(Locators.ID_EMAIL_FORM_CONTACT, email);
        this.email = email;
        return this;
    }

    public String getType_message() {
        return type_message;
    }

    public ContactFormPageObject setType_message(String type_message) {
        this.type_message = type_message;
        switch (type_message){
            case "duvida":
                clickElementById(Locators.ID_TYPE_MESSAGE_FORM_CONTACT+type_message+"");
                break;
            case "sugestao":
                clickElementById(Locators.ID_TYPE_MESSAGE_FORM_CONTACT+type_message+"");
                break;
            case "reclamacao":
                clickElementById(Locators.ID_TYPE_MESSAGE_FORM_CONTACT+type_message+"");
                break;
        }

        return this;

    }

    public String getAge() {
        return age;
    }

    public ContactFormPageObject setAge(Integer age){
        this.age = age.toString();
        if (age < 18){
            new Select(getElementById(Locators.ID_IDADE_FORM_CONTACT))
                    .selectByValue(Locators.VALUE_IDADE_MENOR_QUE_18_FORM_CONTACT);
        } else if ((age >= 18) && (age < 30)) {
            new Select(getElementById(Locators.ID_IDADE_FORM_CONTACT))
                    .selectByValue(Locators.VALUE_IDADE_MAIOR_IGUAL_A_18_E_MENOR_QUE_30_FORM_CONTACT);
        } else if ((age >= 30) && (age < 65)) {
            new Select(getElementById(Locators.ID_IDADE_FORM_CONTACT))
                    .selectByValue(Locators.VALUE_IDADE_MAIOR_IGUAL_A_30_E_MENOR_QUE_65_FORM_CONTACT);
        } else if ((age > 65)) {
            new Select(getElementById(Locators.ID_IDADE_FORM_CONTACT))
                    .selectByValue(Locators.VALUE_IDADE_MAIOR_IGUAL_A_65_FORM_CONTACT);
        }

        return this;
    }

    public String getWriteHereYourMessage() {
        return writeHereYourMessage;
    }

    public ContactFormPageObject setWriteHereYourMessage(String writeHereYourMessage) {
        this.writeHereYourMessage = writeHereYourMessage;
        typeInputTextById(Locators.ID_ESCREVA_SUA_MENSAGEM, writeHereYourMessage);

        return this;

    }

    public ContactFormPageObject submit() {
        clickElementByAttribute("type", "submit");
        return new ContactFormPageObject(driver);
    }

    public String getMessageResultFormContact(String type_message, Integer age) {

        String result = "";

        if ((type_message!= "") && (age != null)) {
            switch (type_message) {
                case "duvida":
                    if (age < 18) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_DUVIDA_MENORQUE_18_FORM_CONTACT);
                    } else if ((age >= 18) && (age < 30)) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_DUVIDA_MAIORIGUAL_A_18_MENORQUE30_FORM_CONTACT);
                    } else if ((age >= 30) && (age < 65)) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_DUVIDA_MAIORIGUAL_A_30_MENORQUE65_FORM_CONTACT);
                    } else if (age >= 65) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_DUVIDA_MAIORIGUAL_A_65_FORM_CONTACT);
                    }
                    break;
                case "sugestao":
                    if (age < 18) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_SUGESTAO_MENORQUE_18_FORM_CONTACT);
                    } else if ((age >= 18) && (age < 30)) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_SUGESTAO_MAIORIGUAL_A_18_MENORQUE30_FORM_CONTACT);
                    } else if ((age >= 30) && (age < 65)) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_SUGESTAO_MAIORIGUAL_A_30_MENORQUE65_FORM_CONTACT);
                    } else if (age >= 65) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_SUGESTAO_MAIORIGUAL_A_65_FORM_CONTACT);
                    }
                    break;
                case "reclamacao":
                    if (age < 18) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_RECLAMACAO_MENORQUE_18_FORM_CONTACT);
                    } else if ((age >= 18) && (age < 30)) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_RECLAMACAO_MAIORIGUAL_A_18_MENORQUE30_FORM_CONTACT);
                    } else if ((age >= 30) && (age < 65)) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_RECLAMACAO_MAIORIGUAL_A_30_MENORQUE65_FORM_CONTACT);
                    } else if (age >= 65) {
                        result = getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_RECLAMACAO_MAIORIGUAL_A_65_FORM_CONTACT);
                    }
                    break;
            }
        } else {
            result = getTextByXpath(Locators.XPATH_MESSAGE_ERROR_FORM_CONTACT);
        }

        return result;

    }
}
