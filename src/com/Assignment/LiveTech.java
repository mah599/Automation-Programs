package com.Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LiveTech {
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.livetech.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void livetechlinks() throws InterruptedException {
		
		driver.findElement(By.xpath("//i[@class='fa fa-facebook']")).click();
	Thread.sleep(7000);
		
		driver.findElement(By.xpath("//i[@class='fa fa-instagram']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//i[@class='fa fa-linkedin']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//i[@class='fa fa-twitter']")).click();
		Thread.sleep(7000);
	
	}
	
	@Test
	
	public void Testlinks(String title) throws InterruptedException {
		
		String windowid=driver.getWindowHandle();
		
		Set<String> allwin=driver.getWindowHandles();
		Iterator<String> it=allwin.iterator();
		
		while (it.hasNext()) {
			
			String windowId=it.next();
			driver.switchTo().window(windowId);
		
			
			if (driver.getTitle().equals(title)) {
				break;
				
			}
			}
		System.out.println("current url"+driver.getCurrentUrl());
		
		driver.switchTo().window(windowid);
			
	}


			
		
		                   
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
