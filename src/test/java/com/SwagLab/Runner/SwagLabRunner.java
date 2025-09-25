package com.SwagLab.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/FeatureFiles/1_LoginPage.feature",
							"src/test/resources/FeatureFiles/2_InventoryPage.feature"},
					glue= {"com.SwagLab.Stepdef","com.SwagLab.Hooks"},
					publish=true,
					plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class SwagLabRunner {

}