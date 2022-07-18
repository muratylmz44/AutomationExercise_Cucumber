package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\Cucumber-reports/ US101 Test Case 2.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags =  "@US102",
        dryRun = false




)


public class Runner {
}
