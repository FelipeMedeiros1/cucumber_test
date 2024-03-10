package config.fabrica.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FabricaDeDriver {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
        @Override
        protected synchronized WebDriver initialValue() {
            return iniciaDriver();
        }
    };

    private FabricaDeDriver() {}

    public static WebDriver getDriver() {
        return threadDriver.get();
    }

    public static WebDriver iniciaDriver() {
        WebDriver driver = null;
        try {
            System.setProperty("webdriver.chrome.driver", "src/main/java/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Erro ao iniciar o driver: " + e.getMessage());
        }
        return driver;
    }

    public static void fecharDriver() {
        WebDriver driver = getDriver();
        driver.manage().deleteAllCookies();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        if (threadDriver != null) {
            threadDriver.remove();
        }
    }
}