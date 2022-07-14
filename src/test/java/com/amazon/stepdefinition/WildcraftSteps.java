package com.amazon.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.amazon.objectrepository.WildcraftPage;
import com.amazon.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class WildcraftSteps extends CommonActions{
	WildcraftPage w=new WildcraftPage();
	
	@Given("user launch amazon appilication")
	public void user_launch_amazon_appilication() {
		System.out.println("Launch the Browser");	
	    
	}

	@When("user search wildcraft product and select")
	public void user_search_wildcraft_product_and_select() {	
	    insertText(w.getSearch(), "Wildcraft");
	}

	@When("add the product to cart")
	public void add_the_product_to_cart() {
	    w.getProductsearch().click();
	}

	@Then("validate and take screenshot")
	public void validate_and_take_screenshot() throws Throwable {
		
		switchwindow(1);
		String text = w.getProductText().getText();
		System.out.println("The product name is :"+text);
		ScreenShot("product");
	}



}
