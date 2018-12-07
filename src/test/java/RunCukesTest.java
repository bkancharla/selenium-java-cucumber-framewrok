import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue ={"com.automation.steps"},
        tags = {"~@ignore", "~@wip"}
)
public class RunCukesTest extends AbstractTestNGCucumberTests {
}