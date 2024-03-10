package webdriver.fabrica.componentes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class Log4jConfig {
    private static final Logger logger = LogManager.getLogger(Log4jConfig.class);

    public static void configure() {
        try {
            // Configura o Log4j com o arquivo de configuração log4j2.xml no diretório src/main/resources
            Configurator.initialize(null, "src/main/resources/log4j2.xml");
            logger.info("Log4j configurado com sucesso!");
        } catch (Exception e) {
            logger.error("Erro ao configurar o Log4j: " + e.getMessage());
        }
    }

    public static <T> void log(T objeto) {
        Log4jConfig.configure();
        logger.info("Objeto recebido: " + objeto.toString());
    }
    // https://reports.cucumber.io.

}