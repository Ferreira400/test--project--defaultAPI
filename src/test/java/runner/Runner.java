package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"gherkin"},
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
       // tags = {"@tags"},
        dryRun = false
)

public class Runner {}
