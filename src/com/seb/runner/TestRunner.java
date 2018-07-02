package com.seb.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/xylp/eclipse-workspace/FreeCrmBDD/src/com/seb/features/Deals.feature"
		,glue = {"com.seb.stepdefinition"}
		,format = {"pretty", "html:test-output", "json:json-output/cucumber.xml"}
		,monochrome = true
		,strict = true
		,dryRun = false
				)

public class TestRunner {
	
	

}
