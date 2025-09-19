package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabSteps 
{
	
public WebDriver driver;

@Given("Open application with url {string}")
public void open_application_with_url(String url) 
{
	driver=new EdgeDriver();
	driver.get(url);
    
}

@When("User enter valid username as {string} and enter valid password as {string}")
public void user_enter_valid_username_as_and_enter_valid_password_as(String un, String psw) {
    
	driver.findElement(By.id("user-name")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(psw);
}

@When("User click on Login button")
public void user_click_on_login_button() 
{
 driver.findElement(By.id("login-button")).click();   
}

@Then("User should be navigated to inventory page.")
public void user_should_be_navigated_to_inventory_page()
{
	String actUrl=driver.getCurrentUrl();
	String expUrl="inventory";
	Assert.assertTrue(actUrl.contains(expUrl),"Login Fail");
	System.out.println("Login Completed!");
    
}



}