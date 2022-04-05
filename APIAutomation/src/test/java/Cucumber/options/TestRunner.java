package Cucumber.options;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict=true,
		features="src/test/java/features", 
		glue={"stepdefinations"},
		plugin = {"json:target/jsonReports/cucumber-reports.json"},
		tags = {"@Users"}
		)
public class TestRunner {

}
