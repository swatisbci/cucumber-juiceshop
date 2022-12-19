package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Feature",
		
		glue = {"com.stepDefinations" }, 
		plugin = { "html:target/swati.html" })
public class Runner extends AbstractTestNGCucumberTests {

}
