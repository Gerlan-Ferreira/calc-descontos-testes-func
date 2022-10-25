package net.quebradoresanonimos.calculator.e2e.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    public void initialize() {
        driver = new ChromeDriver();
        driver.get("https://calculadora.diegoquirino.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void killDriver() {
        driver.quit();
    }

}
