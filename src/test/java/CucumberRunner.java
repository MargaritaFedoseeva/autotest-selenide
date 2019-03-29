import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/contracts/addСontract.feature"}, glue = {"ui.steps"},
        plugin = {"pretty",
                "json:D://reports/cucumber.json",
              "junit:D://reports/cucumber.xml"})
public class CucumberRunner {
    public static void main(String[] args) throws Exception {
        JUnitCore.main(
                "CucumberRunner");
    }
}
