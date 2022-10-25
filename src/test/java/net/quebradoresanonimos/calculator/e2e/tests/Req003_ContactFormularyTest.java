package net.quebradoresanonimos.calculator.e2e.tests;

import net.quebradoresanonimos.calculator.e2e.core.BaseTest;
import net.quebradoresanonimos.calculator.e2e.pages.InitialPageObject;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Req003_ContactFormularyTest extends BaseTest {

    private InitialPageObject page;


    @BeforeEach
    public void setUp() {
        initialize();
        this.page = new InitialPageObject(driver);
    }

    @AfterEach
    public void tearDown() {
        killDriver();
        this.page = null;
    }

    private String testStepsDefault(String name, String email, String type_message, Integer age, String writeHereYourMessage, String duvida, Integer ageMessage) {
        return this.page.goToContactFormulary()
                .setName(name)
                .setEmail(email)
                .setType_message(type_message)
                .setAge(age)
                .setWriteHereYourMessage(writeHereYourMessage)
                .submit()
                .getMessageResultFormContact(type_message,ageMessage);
    }

    @Nested
    @DisplayName("Mensagem de Sucesso")
    class SuccessMessage{

        final String name = "QuebradoresAnonimos";
        final String email = "quebradores@bing.com.br";
        final String writeHereYourMessage = "Lets find bugs!";

        @Test
        @DisplayName("Quando a mensagem é do tipo DUVIDA e a idade é menor que 18 anos ENTAO Mensagem de DÚVIDA por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsDuvidaAndAgeLessThan18THENSuccessMessage(){

            String result = testStepsDefault(name, email,"duvida", 15, writeHereYourMessage, "duvida", 15);
            assertThat(result, is("Mensagem de DÚVIDA por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!"));
        }
    }

}

