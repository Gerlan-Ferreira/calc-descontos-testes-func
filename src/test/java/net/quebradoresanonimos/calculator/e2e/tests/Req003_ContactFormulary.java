package net.quebradoresanonimos.calculator.e2e.tests;

import net.quebradoresanonimos.calculator.e2e.core.BaseTest;
import net.quebradoresanonimos.calculator.e2e.pages.InitialPageObject;
import net.quebradoresanonimos.calculator.e2e.pages.ProductDiscountResultPageObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Req003_ContactFormulary extends BaseTest {



    @BeforeEach
    public void setUp() {
        initialize();
    }

    @AfterEach
    public void tearDown() {
        killDriver();
    }
}
