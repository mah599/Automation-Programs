package com.JavaScriptMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkTest {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.pepperfry.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void LinkTest() throws InterruptedException {
		
		WebElement e1=driver.findElement(By.xpath("//p[text()='Partner With Us']/parent::div"));
		
		List<WebElement> e2=e1.findElements(By.tagName("div"));
		System.out.println("no of links and size is "+e2.size());
		
		for (int i=0;i<=e2.size();i++) {
			
			System.out.println(e2.get(i).getText());
			
		//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",e2.get(i));
					
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", e2.get(i));
				//((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -200);");
			
			Thread.sleep(3000);
			
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -200);");
				Thread.sleep(3000);
				e2.get(i).click();
				
				Thread.sleep(3000);
		}
	}
	
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
	}

}
