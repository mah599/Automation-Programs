package com.FrameHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinHotelPP {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	@Test
	
	public void googleplayclick() throws InterruptedException {
		
		String homewindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		Thread.sleep(3000);
		Set<String> allwindow=driver.getWindowHandles();
		Iterator<String> it=allwindow.iterator();
		
		while (it.hasNext()) {
			String windowid=it.next();
			
			driver.switchTo().window(windowid);
			if (driver.getTitle().equals("Not Found")){
				
				break ;
				
			}
		}
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		Thread.sleep(3000);
		driver.switchTo().window(homewindow);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		Thread.sleep(3000);
		 allwindow=driver.getWindowHandles();
		 it=allwindow.iterator();
		 while (it.hasNext()) {
			String windowid=it.next();
			driver.switchTo().window(windowid);
			if (driver.getTitle().equals("TestFlight - Apple"));{
				break ;
			}
		 }
		
		
		 Thread.sleep(3000);

			driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();

			Thread.sleep(3000);

			driver.switchTo().window(homewindow);
	}
	@Test
	public void teradown() {
		
		driver.quit();
	}
	
	 
}
