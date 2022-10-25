package net.quebradoresanonimos.calculator.e2e.pages;

import net.quebradoresanonimos.calculator.e2e.core.Locators;
import net.quebradoresanonimos.calculator.e2e.core.BasePage;
import org.openqa.selenium.WebDriver;

public class ProductListPageObject extends BasePage {

    public ProductListPageObject(WebDriver driver) {
        super(driver);
    }

    public ProductDiscountFormPageObject selectProductFromListCode(int code) {
        clickElementByXpath(Locators.XPATH_TABLE_ITEM_PRODUCT_LIST+code+"')]");
        return new ProductDiscountFormPageObject(driver);
    }

}
