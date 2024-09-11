package com.MouseHover;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseHour2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		By hello=By.id("nav-link-accountList");
		
	WebElement hellos=	driver.findElement(hello);
		
		 Actions action=new Actions(driver);
			
		  action.moveToElement(hellos).build().perform();
		  
		  Thread.sleep(6000);
		  
		  driver.findElement(By.linkText("Your Wish List")).click();
		  
		 System.out.println(driver.getCurrentUrl());
		  
		  Thread.sleep(6000);
		  
		  driver.quit();
	}

}
