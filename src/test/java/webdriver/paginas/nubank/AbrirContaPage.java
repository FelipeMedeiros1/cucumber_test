package config.paginas.nubank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import config.base.BasePage;

public class AbrirContaPage extends BasePage {
    //region

    @FindBy(id = "label-cpf")
    private WebElement cpfLabel;
    @FindBy(id = "field-cpf")
    private WebElement cpf;
    @FindBy(id = "test")
    private WebElement continuar;
    @FindBy(id = "label-name")
    private WebElement nomeLabel;
    @FindBy(id = "field-name")
    private WebElement nome;
    @FindBy(id = "label-phone")
    private WebElement telefoneLabel;
    @FindBy(id = "field-phone")
    private WebElement telefone;
    @FindBy(id = "label-email")
    private WebElement emailLabel;
    @FindBy(id = "field-email")
    private WebElement email;
    @FindBy(id = "label-emailConfirmation")
    private WebElement confirmaEmailLabel;
    @FindBy(id = "field-emailConfirmation")
    private WebElement confirmaEmail;
    @FindBy(xpath = "(//span)[17]")
    private WebElement politicaDePrivacidade;
    @FindBy(xpath = "(//button)[3]")
    private WebElement enviar;
    @FindBy(className = "sc-ksNGjt iQzpHJ")
    private WebElement msgAtual;

//endregion

    public void cpf(String valor) {
        clicar(cpfLabel);
        preenche(cpf, valor);
        clicar(continuar);
    }

    public void nome(String valor) {
        clicar(nomeLabel);
        preenche(nome, valor);
    }

    public void telefone(String valor) {
        clicar(telefoneLabel);
        preenche(telefone, valor);
    }

    public void email(String valor) {
        clicar(emailLabel);
        preenche(email, valor);
    }

    public void confirmaEmail(String valor) {
        clicar(confirmaEmailLabel);
        preenche(confirmaEmail, valor);
    }

    public void politicaDePrivacidade(Boolean valor) {
        selecionaChek(politicaDePrivacidade, valor);
        clicar(enviar);
    }

    public void mensagem(String msgEsperada) {
        validaMensagem(msgEsperada, msgAtual);
    }

    public void mensagem() {
        obterTituloDaPagina();
    }
}
