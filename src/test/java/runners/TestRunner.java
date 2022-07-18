package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-html-reports/ End2End.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags =  "@End2End",
        dryRun = false




)




public class TestRunner {
}
