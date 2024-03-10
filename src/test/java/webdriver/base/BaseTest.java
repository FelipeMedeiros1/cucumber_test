package webdriver.base;

import static webdriver.fabrica.driver.FabricaDeDriver.fecharDriver;
import static webdriver.fabrica.driver.FabricaDeDriver.getDriver;

public abstract class BaseTest {


    public static void inicializar(String url) {
        getDriver().get(url);
    }

    public static void finalizar() {
        fecharDriver();

    }
}

