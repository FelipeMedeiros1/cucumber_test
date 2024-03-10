package aceites.etapas.nubank;

import webdriver.paginas.nubank.AbrirContaPage;

public class AbrirContaUtils {
    private AbrirContaPage page = new AbrirContaPage();

    public void setCpf(String cpf){
        page.cpf(cpf);
    }
    public void preencheDados(String nome, String telefone, String email, String confirmaEmail, Boolean politicaDePrivacidade) {
        try {
            page.nome(nome);
            page.telefone(telefone);
            page.email(email);
            page.confirmaEmail(confirmaEmail);
            page.politicaDePrivacidade(politicaDePrivacidade);

        } catch (Exception e) {
             throw new RuntimeException("Erro ao preencher os dados: " + e.getMessage());
        }
    }

    public void validarTeste() {
        page.mensagem();

    }
}
