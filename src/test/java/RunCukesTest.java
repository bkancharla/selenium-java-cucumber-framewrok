import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ={"com.automation.steps" , "com.automation.framework"},
        tags = {"~@ignore", "~@wip"}
)
public class RunCukesTest {
}