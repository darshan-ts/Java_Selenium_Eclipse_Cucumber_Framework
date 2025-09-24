
package com.SwagLab.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.SwagLab.Utility.BrowserUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SwagLabHooks 
{
	public WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver=BrowserUtil.setDriver("edge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown() 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver!=null)
		{
			driver.quit();
		}
	}

}