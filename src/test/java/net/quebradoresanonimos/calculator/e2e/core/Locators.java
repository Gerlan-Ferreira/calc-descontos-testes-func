package net.quebradoresanonimos.calculator.e2e.core;

public class Locators {

    public static final String CSS_MENU_PRODUCT = "a.nav-link[href='/produtos']";

    public static final String CSS_MENU_FORM_CONTACT = "a.nav-link[href='/contato']";
    public static final String ID_SELECT_CLIENT_TYPE = "tipoCliente";
    public static final String ID_INPUT_QUANTITY = "quantidade";
    public static final String ID_INPUT_DISCOUNT_FACTOR_RESULT = "fator";
    public static final String XPATH_TABLE_ITEM_PRODUCT_LIST = "//a[contains(@href, '/itens/add/produto/";
    public static final String XPATH_MESSAGE_SUCCESS_DISCOUNT_PRODUCT = "//div[@class='alert alert-dismissable alert-success']//span[.='Fator de desconto calculado com sucesso!']";

    public static final String ID_NAME_FORM_CONTACT = "nome";

    public static final String ID_EMAIL_FORM_CONTACT = "email";

    public static final String ID_TYPE_MESSAGE_FORM_CONTACT = "tipo_";

    public static final String ID_IDADE_FORM_CONTACT = "idade";
    public static final String VALUE_IDADE_LESS18_FORM_CONTACT = "Menor que 18 anos";

    public static final String VALUE_IDADE_MAIORIGUALA18_E_MENORQUE30_FORM_CONTACT = "Entre 18 e 29 anos";

    public static final String VALUE_IDADE_MAIORIGUALA30_E_MENORQUE65_FORM_CONTACT = "Entre 30 e 64 anos";

    public static final String VALUE_IDADE_MAIORIGUALA65FORM_CONTACT = "A partir de 65 anos";

    public static final String ID_ESCREVA_SUA_MENSAGEM = "mensagem";

    public static final String XPATH_MESSAGE_SUCCESS_DUVIDA_MENORQUE_18_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de DÚVIDA por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_DUVIDA_MAIORIGUAL_A_18_MENORQUE30_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de DÚVIDA por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_DUVIDA_MAIORIGUAL_A_30_MENORQUE65_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de DÚVIDA por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_DUVIDA_MAIORIGUAL_A_65_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de DÚVIDA por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_SUGESTAO_MENORQUE_18_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de SUGESTÃO por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_SUGESTAO_MAIORIGUAL_A_18_MENORQUE30_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de SUGESTÃO por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_SUGESTAO_MAIORIGUAL_A_30_MENORQUE65_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de SUGESTÃO por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_SUGESTAO_MAIORIGUAL_A_65_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de SUGESTÃO por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_RECLAMACAO_MENORQUE_18_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de RECLAMAÇÃO por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_RECLAMACAO_MAIORIGUAL_A_18_MENORQUE30_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de RECLAMAÇÃO por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_RECLAMACAO_MAIORIGUAL_A_30_MENORQUE65_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de RECLAMAÇÃO por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!']";

    public static final String XPATH_MESSAGE_SUCCESS_RECLAMACAO_MAIORIGUAL_A_65_FORM_CONTACT = "//div[@class='alert alert-dismissable alert-success']//span[.='Mensagem de RECLAMAÇÃO por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!']";


}
