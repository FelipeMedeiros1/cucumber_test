package config.fabrica.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static config.fabrica.driver.FabricaDeDriver.getDriver;

public class Botao {
    public void clicar(By by) {
        getDriver().findElement(by).click();
    }

    public void clicar(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public void clicar(WebElement element) {
        element.click();
    }


}

