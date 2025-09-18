package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//@RunWith is a junit annotation that tells we are running current class as Cucumber class.
//@CucumberOptions is a place where we need to attach feature file(features=) and step_definition_file(glue=) in terms of key-value pair.
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Google.feature",
					glue="com.stepdef")
public class GoogleRunner {

}
