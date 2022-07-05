package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.cucumber.suiteslicing.SerenityTags;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/CanadaDrives.feature",
			glue="com.canada.drives.steps",
			tags="@CD2")
public class RunCuke {


}
