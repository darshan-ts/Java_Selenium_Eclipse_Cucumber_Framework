package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * run single scenario : tags="@homepage"
 * multiple scenario: tags="@homepage or @fashionpage"
 * skip only fashion scenario:  tags="not @fashionpage"
 * skip multiple scenario: give same tag name and: tags="not @ignore"
 * all scenario: tags="@all"
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue="com.stepdef",
					publish=true,
					tags="@all")
					//tags="@homepage"
					//tags="@mobilepage"
					//tags="@homepage or @fashionpage"
					//tags="not @fashionpage")
					//tags="not @ignore")
public class AmazonRunner {

}