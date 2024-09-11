package com.JavaScriptMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptDemo2 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.pepperfry.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void Scrolltest() {
		WebElement e1=driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",e1);
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", e1);
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(6000);
		
		driver.quit();
	}

}
