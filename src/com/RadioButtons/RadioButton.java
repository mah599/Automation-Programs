package com.RadioButtons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	
	public void radiobutton() {
		
	Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
	Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
	
	Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
	}
	
	@Test
	
	public void radiobutton2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	@Test
	
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.quit();
	}

}
