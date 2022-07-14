package com.amazon.resources;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;
	
	public static void launch() {
		
		WebDriverManager.edgedriver().setup();
		EdgeOptions options=new EdgeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("headless");
		driver = new EdgeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	}
	
	public static void insertText(WebElement element,String value) {
		element.sendKeys(value,Keys.ENTER);
	}
	public static void switchwindow(int i) {
		Set<String>id=driver.getWindowHandles();
		List<String>cid=new ArrayList<>(id);
		driver.switchTo().window(cid.get(i));
	}
	public static void ScreenShot(String name) throws Throwable {
		TakesScreenshot tk=(TakesScreenshot)driver;
	    File src = tk.getScreenshotAs(OutputType.FILE);
	    File trg=new File("C:\\Users\\haroa\\eclipse-workspace\\AmazonProduct\\src\\test\\resources\\ScreenShot\\"+name+".png");
	    FileUtils.copyFile(src, trg);
	}

}
