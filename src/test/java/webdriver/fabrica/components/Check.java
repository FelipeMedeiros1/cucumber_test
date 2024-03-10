package config.fabrica.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static config.fabrica.driver.FabricaDeDriver.getDriver;

public class Check {

    public boolean seleciona(WebElement elemento, Boolean boleano) {
        if (boleano == true) {
            if (!elemento.isSelected()) {
                elemento.click();
            }
        }
        return false;
    }


    public void seleciona(WebElement elemento) {
        elemento.click();
    }

    public void seleciona(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public boolean estaSelecionado(WebElement element) {
        return element.isSelected();
    }

    public boolean estaSelecionado(String id) {
        return getDriver().findElement(By.id(id)).isSelected();
    }
}
