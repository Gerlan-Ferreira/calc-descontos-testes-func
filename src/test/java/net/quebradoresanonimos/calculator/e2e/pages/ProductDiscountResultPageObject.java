package net.quebradoresanonimos.calculator.e2e.pages;

import net.quebradoresanonimos.calculator.e2e.core.Locators;
import net.quebradoresanonimos.calculator.e2e.core.BasePage;
import org.openqa.selenium.WebDriver;

public class ProductDiscountResultPageObject extends BasePage {

    public ProductDiscountResultPageObject(WebDriver driver) {
        super(driver);
    }

    public String getDiscountFactorText() {
        return getInputValueById(Locators.ID_INPUT_DISCOUNT_FACTOR_RESULT);
    }

    public String getMessageResult(){return getTextByXpath(Locators.XPATH_MESSAGE_SUCCESS_DISCOUNT_PRODUCT);}

}
