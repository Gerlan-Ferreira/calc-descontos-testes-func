package net.quebradoresanonimos.calculator.e2e.tests;

import net.quebradoresanonimos.calculator.e2e.core.BaseTest;
import net.quebradoresanonimos.calculator.e2e.pages.InitialPageObject;
import org.junit.jupiter.api.*;

import java.time.Duration;

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

    private String testStepsDefault(String name, String email, String type_message, Integer age, String writeHereYourMessage) {
        return this.page.goToContactFormulary()
                .setName(name)
                .setEmail(email)
                .setType_message(type_message)
                .setAge(age)
                .setWriteHereYourMessage(writeHereYourMessage)
                .submit()
                .getMessageResultFormContact(type_message,age);
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

            String result = testStepsDefault(name, email,"duvida", 15, writeHereYourMessage);
            assertThat(result, is("Mensagem de DÚVIDA por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo DUVIDA e a idade entre 18 e 29 anos ENTAO Mensagem de DÚVIDA por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsDuvidaAndAgeBetween18And29THENSuccessMessage(){

            String result = testStepsDefault(name, email,"duvida", 22, writeHereYourMessage);
            assertThat(result, is("Mensagem de DÚVIDA por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo DUVIDA e a idade entre 30 e 64 anos ENTAO Mensagem de DÚVIDA por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsDuvidaAndAgeBetween30And64THENSuccessMessage(){

            String result = testStepsDefault(name, email,"duvida", 39, writeHereYourMessage);
            assertThat(result, is("Mensagem de DÚVIDA por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo DUVIDA e a idade a partir de 65 anos ENTAO Mensagem de DÚVIDA por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsDuvidaAndAgeFrom65THENSuccessMessage(){

            String result = testStepsDefault(name, email,"duvida", 66, writeHereYourMessage);
            assertThat(result, is("Mensagem de DÚVIDA por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo SUGESTÃO e a idade é menor que 18 anos ENTAO Mensagem de SUGESTÃO por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsSugestaoAndAgeLessThan18THENSuccessMessage(){

            String result = testStepsDefault(name, email,"sugestao", 15, writeHereYourMessage);
            assertThat(result, is("Mensagem de SUGESTÃO por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo SUGESTÃO e a idade entre 18 e 29 anos ENTAO Mensagem de SUGESTÃO por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsSugestaoAndAgeBetween18And29THENSuccessMessage(){

            String result = testStepsDefault(name, email,"sugestao", 22, writeHereYourMessage);
            assertThat(result, is("Mensagem de SUGESTÃO por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo SUGESTÃO e a idade entre 30 e 64 anos ENTAO Mensagem de SUGESTÃO por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsSugestaoAndAgeBetween30And64THENSuccessMessage(){

            String result = testStepsDefault(name, email,"sugestao", 39, writeHereYourMessage);
            assertThat(result, is("Mensagem de SUGESTÃO por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo SUGESTÃO e a idade a partir de 65 anos ENTAO Mensagem de SUGESTÃO por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsSugestaoAndAgeFrom65THENSuccessMessage(){

            String result = testStepsDefault(name, email,"sugestao", 66, writeHereYourMessage);
            assertThat(result, is("Mensagem de SUGESTÃO por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo RECLAMAÇÃO e a idade é menor que 18 anos ENTAO Mensagem de RECLAMAÇÃO por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsReclamacaoAndAgeLessThan18THENSuccessMessage(){

            String result = testStepsDefault(name, email,"reclamacao", 15, writeHereYourMessage);
            assertThat(result, is("Mensagem de RECLAMAÇÃO por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo RECLAMAÇÃO e a idade entre 18 e 29 anos ENTAO Mensagem de RECLAMAÇÃO por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsReclamacaoAndAgeBetween18And29THENSuccessMessage(){

            String result = testStepsDefault(name, email,"reclamacao", 22, writeHereYourMessage);
            assertThat(result, is("Mensagem de RECLAMAÇÃO por usuário de idade ENTRE 18 E 29 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo RECLAMAÇÃO e a idade entre 30 e 64 anos ENTAO Mensagem de RECLAMAÇÃO por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsReclamacaoAndAgeBetween30And64THENSuccessMessage(){

            String result = testStepsDefault(name, email,"reclamacao", 39, writeHereYourMessage);
            assertThat(result, is("Mensagem de RECLAMAÇÃO por usuário de idade ENTRE 30 E 64 ANOS foi enviada com sucesso!"));
        }

        @Test
        @DisplayName("Quando a mensagem é do tipo RECLAMAÇÃO e a idade a partir de 65 anos ENTAO Mensagem de RECLAMAÇÃO por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!")
        public void whenMessageTypeIsReclamacaoAndAgeFrom65THENSuccessMessage(){

            String result = testStepsDefault(name, email,"reclamacao", 66, writeHereYourMessage);
            assertThat(result, is("Mensagem de RECLAMAÇÃO por usuário de idade A PARTIR DE 65 ANOS foi enviada com sucesso!"));
        }
    }

    @Nested
    @DisplayName("Mensagem de Erro")
    class ErrorMessage{

        @Test
        @DisplayName("Quando o campo NOME estiver vazio, e email, tipo de mensagem e escreva aqui sua mensagem preenchidos ENTAO Sua mensagem não pôde ser enviada no momento! Tente mais tarde.")
        public void whenFieldNameIsEmptyAndFieldsEmailTypeMessageAndWriteHereYourMessageFilledTHENSuaMensagemNaoPodeSerEnviadaNoMomentoTenteMaisTarde(){

            String email = "quebradores@bing.com.br";
            String typeMessage = "duvida";
            Integer age = 18;
            String writeHereYourMessage = "Lets find bugs!";

            String result = testStepsDefault("", email,typeMessage, age, writeHereYourMessage);
            assertThat(result, is("Sua mensagem não pôde ser enviada no momento! Tente mais tarde."));

        }

        @Test
        @DisplayName("Quando o campo EMAIL estiver vazio, e nome, tipo de mensagem e escreva aqui sua mensagem preenchidos ENTAO Sua mensagem não pôde ser enviada no momento! Tente mais tarde.")
        public void whenFieldEmailIsEmptyAndFieldsNameTypeMessageAndWriteHereYourMessageFilledTHENSuaMensagemNaoPodeSerEnviadaNoMomentoTenteMaisTarde(){
            String name  = "Quebradores Anonimos";
            String typeMessage = "duvida";
            Integer age = 18;
            String writeHereYourMessage = "Lets find bugs!";

            String result = testStepsDefault(name, "",typeMessage, age, writeHereYourMessage);
            assertThat(result, is("Sua mensagem não pôde ser enviada no momento! Tente mais tarde."));

        }

        @Test
        @DisplayName("Quando o campo TIPO DE MENSAGEM estiver vazio, e nome, email e escreva aqui sua mensagem preenchidos ENTAO Sua mensagem não pôde ser enviada no momento! Tente mais tarde.")
        public void whenFieldTypeMessageIsEmptyAndFieldsNameEmailAndWriteHereYourMessageFilledTHENSuaMensagemNaoPodeSerEnviadaNoMomentoTenteMaisTarde(){
            String name = "QuebradoresAnonimos";
            String email = "quebradores@bing.com.br";
            Integer age = 18;
            String writeHereYourMessage = "Lets find bugs!";


            String result = testStepsDefault(name, email,"", age, writeHereYourMessage);
            assertThat(result, is("Sua mensagem não pôde ser enviada no momento! Tente mais tarde."));

        }

        @Test
        @DisplayName("Quando o campo ESCREVA AQUI SUA MENSAGEM estiver vazio, e nome, email e tipo de mensagem preenchidos ENTAO Sua mensagem não pôde ser enviada no momento! Tente mais tarde.")
        public void whenFieldWriteHereYourMessageIsEmptyAndFieldsNameEmailAndWriteHereYourMessageFilledTHENSuaMensagemNaoPodeSerEnviadaNoMomentoTenteMaisTarde(){
            String name = "QuebradoresAnonimos";
            String email = "quebradores@bing.com.br";
            String typeMessage = "duvida";
            Integer age = 18;

            String result = testStepsDefault(name, email,typeMessage, age, "");
            assertThat(result, is("Sua mensagem não pôde ser enviada no momento! Tente mais tarde."));
        }
    }

}

