package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/LoginFeature.feature",
        glue = "StepDefination",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-reports/report.html"}
)
public class run {
}
