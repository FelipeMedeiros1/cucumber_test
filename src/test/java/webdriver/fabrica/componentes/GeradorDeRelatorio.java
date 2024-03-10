package webdriver.fabrica.componentes;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeradorDeRelatorio {

    public static void gerarRelatorio() {

        criarDiretoriosArquivos();
        File reportOutputDirectory = new File("target/relatorio");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/relatorio/cucumber.json");

        String projectName = "Cucumber";
        boolean runWithJenkins = false;
        boolean parallelTesting = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }

    private static void criarDiretoriosArquivos() {
        String diretorioRelatorio = "target/relatorio";
        String arquivoCucumberJson = "target/relatorio/cucumber.json";

        File diretorio = new File(diretorioRelatorio);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        File arquivo = new File(arquivoCucumberJson);
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}