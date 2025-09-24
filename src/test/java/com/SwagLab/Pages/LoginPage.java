package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Encapsulation=private data and public method
	
	private WebDriver driver;

	public LoginPage(WebDriver driver)//driver form hooks
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//locator
	//private By username=By.id("user-name");
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	//methods/actions
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void enterUsername(String un)
	{
		username.sendKeys(un);
	}
	

	public void enterPassword(String psw)
	{
		password.sendKeys(psw);
	}
	
	public void clickLoginButton()
	{
		loginBtn.click();
	}
	public InventoryPage doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginBtn.click();
		
		//login page--->inventory page
		return new InventoryPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}