package com.AlertHandle;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling1 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void Alert() throws InterruptedException {
		
		 Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(3000);
	      org.openqa.selenium.Alert alert=driver.switchTo().alert();
	      Thread.sleep(3000);
	      
	      String Actul=alert.getText();
	    Assert.assertEquals(Actul, "Please enter a valid user name");
	    alert.accept();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
