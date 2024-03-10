package config.base;

import static config.fabrica.driver.FabricaDeDriver.fecharDriver;
import static config.fabrica.driver.FabricaDeDriver.getDriver;

public abstract class BaseTest {


    public static void inicializar(String url) {
        getDriver().get(url);
    }

    public static void finalizar() {
        fecharDriver();

    }
}

