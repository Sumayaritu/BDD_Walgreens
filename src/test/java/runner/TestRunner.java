package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( tags = " @regression and not @smoke",
                              features = "./src/test/java/features",
                              glue = { "base", "stepsdefinition" }, 
                              plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-json.json" } ,
                              snippets =  SnippetType.CAMELCASE ,
                               dryRun = true, 
                               monochrome=false
                               )

public class TestRunner {

}
