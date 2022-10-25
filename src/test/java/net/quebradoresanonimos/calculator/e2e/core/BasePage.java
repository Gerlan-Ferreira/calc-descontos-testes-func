package net.quebradoresanonimos.calculator.e2e.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    private BasePage() {
        super();
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElementByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickElementByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickElementByAttribute(String attribute, String value) {
        driver.findElement(By.xpath("//*[@attribute='value']"
                .replace("attribute", attribute)
                .replace("value", value)))
                .click();
    }

    public WebElement getElementById(String locator) {
        return driver.findElement(By.id(locator));
    }

    public String getInputValueById(String locator) {
        return getElementById(locator).getAttribute("value");
    }

    public void typeInputTextById(String locator, String text) {
        WebElement element = getElementById(locator);
        element.clear();
        element.sendKeys(text);
    }

    public String getTextByXpath(String text){
        return driver.findElement(By.xpath(text)).getText();
    }

    public void clickElementById(String locator){
        WebElement element = getElementById(locator);
        element.click();

    }

}
