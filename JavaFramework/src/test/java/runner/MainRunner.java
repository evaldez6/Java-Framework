package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/"
				+ "featurefiles/Gmail.feature"}, 
		glue = {"classpath:"},
		monochrome = true,
		plugin = {"pretty", "html:target/gmailtest", 
				"json:target/gmailtest.json" 
				}
		)

public class MainRunner {

}
