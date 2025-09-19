package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps 
{
	public WebDriver driver;
	public String actTitle;

@Given("open Amazon application")
public void open_amazon_application() {
    
	driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
}

@When("User get the home page title")
public void user_get_the_home_page_title() throws InterruptedException 
{
	Thread.sleep(2000);
    actTitle=driver.getTitle();
}

@Then("Title should match with home page")
public void title_should_match_with_home_page() {
    String expTitle="Shopping site in India";
    Assert.assertTrue(actTitle.contains(expTitle));
    System.out.println("Home page title matched!");
}

@When("User open Sell page")
public void user_open_sell_page() throws InterruptedException 
{
	Thread.sleep(2000);
    driver.findElement(By.linkText("Sell")).click();
}

@When("User get the Sell page title")
public void user_get_the_sell_page_title() {
   actTitle=driver.getTitle();
}

@Then("Title should match with Sell page")
public void title_should_match_with_sell_page() {
    String expTitle="All Categories";
    Assert.assertTrue(actTitle.contains(expTitle));
    System.out.println("Sell page title matched...!");
}

@When("User open mobile page")
public void user_open_mobile_page() throws InterruptedException
{Thread.sleep(2000);
   driver.findElement(By.linkText("Mobiles")).click();
}

@When("get the mobile page title")
public void get_the_mobile_page_title()
{
   actTitle=driver.getTitle();
}

@Then("Title should match with mobile page")
public void title_should_match_with_mobile_page()
{
	String expTitle="Mobile Phones";
    Assert.assertTrue(actTitle.contains(expTitle));
    System.out.println("Mobile page title matched...!");
}

@When("User open fashion page")
public void user_open_fashion_page() throws InterruptedException
{
	Thread.sleep(2000);
    driver.findElement(By.linkText("Fashion")).click();
}

@When("get the fashion page title")
public void get_the_fashion_page_title() {
   actTitle=driver.getTitle();
}

@Then("Title should match with fashion page")
public void title_should_match_with_fashion_page() {
    String expTitle="Fashion Store";
    Assert.assertTrue(actTitle.contains(expTitle));
    System.out.println("Fashion page title matched...!");
}




}