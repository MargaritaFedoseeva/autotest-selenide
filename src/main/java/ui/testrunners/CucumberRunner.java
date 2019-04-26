package ui.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:order_form"}, glue = {"ui.steps"},
        plugin = {"pretty",
                "json:terget/report.json",
              "junit:terget/report.xml"}
              )
public class CucumberRunner {
    public static void main(String[] args) throws Exception {
        JUnitCore.main(
                CucumberRunner.class.getName());
    }
}
