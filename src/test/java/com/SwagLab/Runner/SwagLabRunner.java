package com.SwagLab.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/LoginPage.feature",
					glue= {"com.SwagLab.Stepdef","com.SwagLab.Hooks"},
					publish=true)
public class SwagLabRunner {

}