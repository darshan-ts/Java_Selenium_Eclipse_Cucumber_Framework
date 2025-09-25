package com.SwagLab.Stepdef;

import java.util.List;

import org.testng.Assert;

import com.SwagLab.Pages.InventoryPage;
import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Utility.BrowserUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class InventoryPageStep
{
	LoginPage lp=new LoginPage(BrowserUtil.getDriver());
	InventoryPage ip;
	int count;
	
	
	
	@Given("User must be login woth valid credentials")
	public void user_must_be_login_woth_valid_credentials(DataTable dataTable) 
	{
		BrowserUtil.getDriver().get("https://www.saucedemo.com/");
		List<List<String>> data=dataTable.cells();
		String un=data.get(0).get(0);
		String psw=data.get(0).get(1);
		
		ip=lp.doLogin(un,psw);
	    
	}

	@Given("User is on Inventory page")
	public void user_is_on_inventory_page() {
	   
		Assert.assertTrue(lp.getAppUrl().contains("inventory"));
		System.out.println("User is on Inventory page...");
	}

	@When("User get the current product count")
	public void user_get_the_current_product_count() {

		count=ip.getProductCount();
	}

	@Then("Total product should be {int}")
	public void total_product_should_be(Integer expcount) {
	   
		Assert.assertEquals(count,expcount);
		System.out.println("Total products are: "+count);
	}

	@When("User get the current product details")
	public void user_get_the_current_product_details() {

		ip.getProductDetails();
	}

	@Then("Product detials should be display")
	public void product_detials_should_be_display() {

		ip.checkProductAvailability("Sauce Labs Backpack");
	}

	@When("User add product {string} into cart")
	public void user_add_product_into_cart(String pname) {
		
		ip.addProductIntoCart(pname);

	}

	@Then("Product should be added into cart")
	public void product_should_be_added_into_cart() {
	   ip.launchCartPage();
	   System.out.println("Product In Cart: "+ip.getCartProductDetails());
	   
	}

//	@Then("open cart page to observe that product")
//	public void open_cart_page_to_observe_that_product() {
//
//
//	}


}