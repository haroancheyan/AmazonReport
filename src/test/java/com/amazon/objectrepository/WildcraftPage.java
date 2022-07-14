package com.amazon.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.resources.CommonActions;

public class WildcraftPage extends CommonActions {
	public WildcraftPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	
	@FindBy(xpath="//span[contains(text(),'Wildcraft Hypadry Unisex Rain Cheater Suit E Plus')]")
	private WebElement productsearch;
	
	@FindBy(id="productTitle")
	private WebElement producttext;
	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getProductsearch() {
		return productsearch;
	}
	public WebElement getProductText() {
		return producttext;
	}

}
