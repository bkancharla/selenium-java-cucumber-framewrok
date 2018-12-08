import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue ={"com.automation.steps","com.automation.hooks"},
        strict = true,
        tags = {"not @ignore", "not @wip"}
)
public class RunCukesTest extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        System.out.println("DDUE");
        return super.scenarios();
    }
}