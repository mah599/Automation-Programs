package com.ScrolldownJavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollDownDemo1 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void scrolldown() {
		//type casting
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 1000);");
		
          ((JavascriptExecutor)driver).executeScript("win", null);
		
	
		
	}

}
