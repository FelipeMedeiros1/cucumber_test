package config.fabrica.components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static config.fabrica.driver.FabricaDeDriver.getDriver;

public class JS {
     public Object executarScript(String cmd, Object... param) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return js.executeScript(cmd, param);
    }
    public JS encontrarBotao(WebElement element) {
        executarScript("window.scrollBy(0,arguments[0])", element.getLocation().y--);

        return null;
    }
    public JS zoom(int porcentagem) {
        executarScript("document.body.style.zoom = '"+porcentagem+"%';");
        return null;
    }
    public JS encontrarCampo(WebElement elemento) {

        new JS().executarScript("arguments[0].scrollIntoView(true);", elemento);

        return null;
    }



}
