package com.seb.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/xylp/eclipse-workspace/FreeCrmBDD/src/com/seb/features/Login.feature"
		,glue = {"com.seb.stepdefinition"}
		,format = {"pretty", "html:test-output"}
				)

public class TestRunner {
	
	

}
