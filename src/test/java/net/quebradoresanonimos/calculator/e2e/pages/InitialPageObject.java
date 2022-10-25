package net.quebradoresanonimos.calculator.e2e.pages;

import net.quebradoresanonimos.calculator.e2e.core.Locators;
import net.quebradoresanonimos.calculator.e2e.core.BasePage;
import org.openqa.selenium.WebDriver;

import static java.sql.DriverManager.getDriver;

public class InitialPageObject extends BasePage {

    public InitialPageObject(WebDriver driver) {
        super(driver);
    }

    public ProductListPageObject goToProductsListFromMenu() {
        clickElementByCss(Locators.CSS_MENU_PRODUCT);
        return new ProductListPageObject(driver);
    }

    public ContactFormPageObject goToContactFormulary(){
        clickElementByCss(Locators.CSS_MENU_FORM_CONTACT);
        return new ContactFormPageObject(driver);
    }

}
