package br.com.santander.test.runners;
import br.com.santander.test.support.CustomTestNGCucumberTestsWeb;
import br.com.santander.test.support.CustomTestNGCucumberTestsWeb;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "classpath:features", //
		glue = "br.com.santander.test", //
		tags = {"@web","@CT=046"}, //
		plugin = { "json:target/cucumber-report/cucumber.json" }, //
		monochrome = true, //
		snippets = SnippetType.CAMELCASE //
)

public class GeneralRunner extends CustomTestNGCucumberTestsWeb {

}