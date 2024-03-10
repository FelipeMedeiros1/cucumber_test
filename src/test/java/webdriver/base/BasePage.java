package webdriver.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import webdriver.fabrica.componentes.*;

import static webdriver.fabrica.driver.FabricaDeDriver.getDriver;

public abstract class BasePage {
    public BasePage() {
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 10);
        PageFactory.initElements(factory, this);
    }

    public String obterTituloDaPagina() {
        return getDriver().getTitle();
    }

    public void inserir() {
    }

    public void alterar() {
    }

    public void excluir() {
    }

    public void confirmar() {

    }

    protected void preenche(WebElement elemento, String valor) {
        rolarParaBaixoAteEncontrar(elemento);
        new CampoTexto().preenche(elemento, valor);
    }

    protected void selecionaUm(WebElement elemento, String valor) {
        new ComboBox().seleciona(elemento, valor);
    }

    protected void selecionaVarios(WebElement elemento, String... valores) {
        new ComboBox().selecionaVarios(elemento, valores);
    }

    protected void selecionaChek(WebElement chk, boolean boleano) {
        new Check().seleciona(chk, boleano);
    }

    protected void clicar(WebElement elemento) {
        esperaElementoSerClicavel(elemento);
        new Botao().clicar(elemento);
    }

    protected void validaMensagem(String msgEsperada, WebElement msgAtual) {
        esperaElementoEstaPresente(msgAtual, msgEsperada);
        new Assertivas().validaMensagem(msgEsperada, msgAtual);
    }

    protected void esperaPor(int miliSegundos) {
        new Espera().esperaPor(miliSegundos);
    }

    protected void esperaElementoSerClicavel(WebElement elemento) {
        new Espera().esperaElementoSerClicavel(elemento);
    }


    protected void rolarParaBaixoAteEncontrar(WebElement elemento) {
        new JS().encontrarCampo(elemento);
    }

    protected void esperaElementoEstaPresente(WebElement elemento, String valor) {
        new Espera().esperaElementoEstaPresente(elemento, valor);
    }

    protected void fecharElementoSobreposto(){
        WebElement elementoSobreposto = null;
        try {
            // Tenta encontrar o elemento sobreposto
            elementoSobreposto = getDriver().findElement(By.xpath("//div[@class='elemento-sobreposto']"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Se o elemento não for encontrado, não há sobreposição
            System.out.println("Nenhum elemento sobreposto encontrado.");
        }

        // Se o elemento sobreposto for encontrado, feche-o
        if (elementoSobreposto != null) {
            // Execute a ação necessária para fechar ou remover o elemento sobreposto
            elementoSobreposto.click(); // Por exemplo, clique no elemento para fechá-lo
            System.out.println("Elemento sobreposto fechado.");
        }
    }


}

