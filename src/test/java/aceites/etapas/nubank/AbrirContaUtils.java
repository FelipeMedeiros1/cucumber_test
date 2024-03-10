package acceptance.etapas.nubank;

import webdriver.pages.nubank.AbrirContaPage;

public class AbrirContaUtils {
    private AbrirContaPage page = new AbrirContaPage();

    public void setCpf(String cpf){
        page.cpf(cpf);
    }
    public void preencheDados(String nome, String telefone, String email,String confirmaEmail, Boolean politicaDePrivacidade) {
        page.nome(nome);
        page.telefone(telefone);
        page.email(email);
        page.confirmaEmail(confirmaEmail);
        page.politicaDePrivacidade(politicaDePrivacidade);
    }

    public void validarTeste() {
        page.mensagem();

    }


}
