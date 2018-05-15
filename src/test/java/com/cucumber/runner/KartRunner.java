package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/cucumber/features/kart.feature"
,glue={"com.cucumber.stepdefinitions"}
//,dryRun=true
)
public class KartRunner {

	
	
}
