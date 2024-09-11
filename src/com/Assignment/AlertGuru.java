package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class AlertGuru {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Guru99() throws InterruptedException {
		
		driver.findElement(By.name("uid")).sendKeys("mngr266311");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678@");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("https://demo.guru99.com/v4/")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.name("AccSubmit")).sendKeys("123456");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(3000);
	}
	
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
	}
	

}
