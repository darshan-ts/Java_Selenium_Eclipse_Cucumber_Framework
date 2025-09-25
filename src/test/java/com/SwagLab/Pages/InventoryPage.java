package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage
{

	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)//driver from hooks
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//locators
	
	@FindBy(xpath="//div[@class='inventory_list']//div[@class='inventory_item_name ']")
	private List<WebElement> allProducts;
	
	@FindBy(id="add-to-cart")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartOption;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement cartProduct;
	
	//methods
	
	
	public int getProductCount()
	{
		return allProducts.size();
	}
	
	public void getProductDetails()
	{
		System.out.println("****Product details*****");
		for(WebElement i:allProducts)
		{
			System.out.println(i.getText());
		}
	}
	
	public void checkProductAvailability(String pname)
	{
		
		for(WebElement i:allProducts)
		{
			if(i.getText().contains(pname))
			{
				System.out.println("Product Found!");
				break;
			}

		}
	}
	
	
	
	public void addProductIntoCart(String pname)
	{
		for(WebElement i:allProducts)
		{
			if(i.getText().contains(pname))
			{
				
				System.out.println("Product found..."+pname);
				i.click();
				break;
				
			}
		}
		
		//click on add to cart
		addToCartBtn.click();
		System.out.println("Product added into cart!");
		
	}
	
	
	public void launchCartPage()
	{
		cartOption.click();
		//cart page navigation
	}
	
	public String getCartProductDetails()
	{
		return cartProduct.getText();
	}
	
	
	
	
	
	
}