package config.fabrica.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static config.fabrica.driver.FabricaDeDriver.getDriver;

public class Espera {

    public void esperaElementoAparecerNaTela(int time) {
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void esperaElementoSerClicavel(WebElement elemento) {
        new WebDriverWait(getDriver(), 15).until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void esperaElementoEstaPresente(WebElement elemento, String valor) {
        new WebDriverWait(getDriver(), 120).until(ExpectedConditions.textToBePresentInElementValue(elemento, valor));
    }

    public void finalizaEspera() {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public void esperaAteElementoAparecerNaTela(String id) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    }


    public void esperaAteElementoDesaparecerDaTela(String imgId) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(imgId)));
    }


    public void esperaPor(int segundos)  {
        try {
            new Thread().sleep(segundos);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
