package com.SwagLab.Stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Utility.BrowserUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageStep 
{

	//WebDriver driver=BrowserUtil.getDriver();
	
	//create object of page class to call methods
	LoginPage lp=new LoginPage(BrowserUtil.getDriver());
	String actTitle;
	
@Given("Open Swaglab application")
public void open_swaglab_application() {

BrowserUtil.getDriver().get("https://www.saucedemo.com/");

}

@When("User get the current page title")
public void user_get_the_current_page_title() {

	actTitle=lp.getAppTitle();
	System.out.println("Application current page title: "+actTitle);
	
}

@Then("Title should match with {string}")
public void title_should_match_with(String expTitle) {
   
	Assert.assertEquals(actTitle,expTitle);
	System.out.println("Title matched...!");
	
}

@When("User enter valid username and password")
public void user_enter_valid_username_and_password() {
    
	lp.enterUsername("standard_user");
	lp.enterPassword("secret_sauce");
}

@When("User click on Login button")
public void user_click_on_login_button() 
{
    lp.clickLoginButton();
}

@Then("User should be navigate to inventory page and login successfull")
public void user_should_be_navigate_to_inventory_page_and_login_successfull() {

	
	String expTitle="inventory";
	//Assert.assertTrue(BrowserUtil.getDriver().getCurrentUrl().contains(expTitle));
	Assert.assertTrue(lp.getAppUrl().contains(expTitle));
	System.out.println("Login Completed...!");
			
}




}