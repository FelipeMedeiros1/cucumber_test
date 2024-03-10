package aceites.executor;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/funcionalidades",
        glue = "aceites/etapas",
        publish = true
)
public class CucumberTest {
}
