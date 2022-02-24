package com.stateFarm.qa.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
					glue = "com.stateFarm.qa.bdd.steps",
				    dryRun = false,
					monochrome = true,
					plugin = {"json:target/jsonReport.json", "junit:target/xmlReport.xml", "html:target/htmlReport.html"}
					)
					
public class TestRunner {

}
