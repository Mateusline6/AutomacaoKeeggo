package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/test/resources/Features",

		glue = "Testes",

		tags = "@Tag1",

		plugin = { "pretty","html: statusReport/report.html" },

		monochrome = true
		
		)
		
public class Runners {

}
