package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "src/test/java/features", dryRun=true,
		glue="StepDefinitions")

public class testRunner2 {



}
