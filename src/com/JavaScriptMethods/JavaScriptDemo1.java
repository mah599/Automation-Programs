package com.JavaScriptMethods;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptDemo1 {
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.pepperfry.com/");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void scrolldown() {
		
		//Object org.openqa.selenium.JavascriptExecutor.executeScript(String script, Object... args)
		//((JavascriptExecutor)driver).executeScript("Window.scrollBy(0, 1000);");
		
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight);");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight);");
				
	}

	@AfterMethod
	
	public void teardown() throws InterruptedException {
		
		Thread.sleep(6000);
		
		driver.quit();
	}
}
