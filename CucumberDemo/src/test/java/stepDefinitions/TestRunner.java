package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",
				 glue= {"stepsDefinitions"},
				 plugin= {"pretty","html:target/HtmlReports","json:target/JSONReport/report.json"}	
		)
public class TestRunner {}
