package com.AlertHandle;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TsrtcCheckAvailability {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void checkavailability() throws InterruptedException {
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		Thread.sleep(3000);
		
	    Alert alert=driver.switchTo().alert();
	    
	    String txt=alert.getText();
	 Assert.assertEquals(txt, "Please select start place.");
	 
	
	    Thread.sleep(3000);
	    alert.accept();
		
	}
	
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
	}

}
