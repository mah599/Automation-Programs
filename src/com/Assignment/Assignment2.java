package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment2 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void Jmeterclick() throws InterruptedException {
		
		//String s1=driver.getWindowHandle();
		
		//driver.switchTo().frame("iframe");
		
		driver.findElement(By.xpath("//iframe[contains(@src,'ads.html')]")).click();
		
		Thread.sleep(10000);
	}
	
	
	
	
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
	}

}
