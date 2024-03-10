package config.fabrica.components;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Assertivas {
    public void validaMensagem(String msgEsperada, WebElement msgAtual) {
        Assert.assertEquals(msgEsperada, msgAtual.getText());
    }

}
