package webdriver.fabrica.componentes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static webdriver.fabrica.driver.FabricaDeDriver.getDriver;


public class CampoTexto {
    public void preencheDados(By by, String text) {
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(text);
    }
    public void preenche(WebElement elelmento, String valor) {
        elelmento.clear();
        elelmento.sendKeys(valor);
    }
    public void preenche(String id, String texto){
        preencheDados(By.id(id), texto);
    }

    public String obterValorCampo(WebElement element, String value) {
        return element.getAttribute(value);
    }
    public String obterValorCampo(String id_campo,String valor) {
        return getDriver().findElement(By.id(id_campo)).getAttribute(valor);
    }

}
