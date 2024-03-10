package webdriver.fabrica.componentes;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Assertivas {
    public static void validaMensagem(String msgEsperada, WebElement msgAtual) {
        Assert.assertEquals(msgEsperada, msgAtual.getText());
    }

    public static void verificaCampo(WebElement elemento, String valor) {
        String valorAtual = elemento.getText().toString().trim();
        if (valorAtual.isEmpty()) {
            valorAtual = null;
        }
        try {
            assert valor.equals(valorAtual);
            System.out.println(valorAtual + ": Ok");
        } catch (AssertionError e) {
            throw new RuntimeException("O valor: " + valor + ", não está preenchido corretamente!");
        }
    }

}
