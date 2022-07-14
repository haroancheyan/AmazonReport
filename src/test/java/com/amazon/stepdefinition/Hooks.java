package com.amazon.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.resources.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions{
	@Before
	public void launchTheBrowser() {
		launch();
		
	}

	@After
	public void afterScenario(Scenario scen) {
		if(scen.isFailed()) {
			System.out.println("scenario failed");
			final byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scen.embed(screenshotAs, "image/png");
			
		}
		else {
			System.out.println("scenario passed");
			final byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scen.embed(screenshotAs, "image/png");
		}
		driver.quit();
	}
}
