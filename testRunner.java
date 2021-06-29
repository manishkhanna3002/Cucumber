package CucumberOptions;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

//import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "src/test/java/features",
		glue="StepDefinitions", tags="@SmokeTest", monochrome=true, dryRun=true,
		plugin= {"pretty","html: target/cucumber", "json: target/cucumber.json","junit: target/cucuber.xml"})



public class testRunner {
	
}

