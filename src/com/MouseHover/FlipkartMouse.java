package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouse {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
     By	mahesh=By.className("H6-NpN");
     
     WebElement mahi= driver.findElement(mahesh);
     
     Actions action=new Actions(driver);
     action.moveToElement(mahi).build().perform();
     
     Thread.sleep(6000);
     
     driver.findElement(By.className("AT0fUR")).click();
     
     Thread.sleep(6000);
     driver.quit();
	}

}
