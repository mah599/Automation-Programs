package com.FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandling1 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
	}
        @Test
        public void draganddrop() throws InterruptedException {
        	
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        
        Actions action=new Actions(driver);
        
        action.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']")),
        		driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();
        
        Thread.sleep(5000);
        }
        
        @AfterMethod
        
        public void teardown() throws InterruptedException {
        	
        	Thread.sleep(6000);
        	
        	driver.quit();
        }
	
	
}
