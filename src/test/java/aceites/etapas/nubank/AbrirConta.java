package aceites.etapas.nubank;

import webdriver.base.BaseTest;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
public class AbrirConta extends BaseTest {

    private AbrirContaUtils abrirConta = new AbrirContaUtils();

    @Dado("que acesso a página de abertura de conta")
    public void acessarPaginaInicial() {
        inicializar("https://nubank.com.br/pedir/nu/?utm_source=google&utm_medium=cpc&utm_campaign=1784086961&utm_term=118905407472&utm_word=nubank&utm_content=502413793352&ad_position=&match_type=b&location=1001773&device=c&utm_keyword_id=kwd-488984618592&utm_placement=&extension=&geolocation=1001773&google_channel=google_brand&gad_source=1&gclid=CjwKCAiA6KWvBhAREiwAFPZM7twonCdRjqmr2s4fc8VgxlAKjL0NjsFveTvFo8sTmtWdWIo911tfEhoCjpEQAvD_BwE");

        abrirConta.setCpf("574.378.590-25");
    }
    @Quando("eu preencho o formulário com os dados corretos")
    public void preencherFormulario() {
        abrirConta.preencheDados("Fulano de Tal", "11999998877", "t@gmail.com", "t@gmail.com", true);
    }
    @Entao("eu devo ver uma mensagem indicando que a conta foi aberta com sucesso")
    public void validarMensagemSucesso() {
        abrirConta.validarTeste();

        finalizar();
    }
}
