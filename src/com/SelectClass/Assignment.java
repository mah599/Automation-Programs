package com.SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver;

		   String applicationurladdress="https://my.monsterindia.com/sponsered_popup.html";

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
				
			 driver=new ChromeDriver();
			 
			 driver.get(applicationurladdress);
			 
			 driver.manage().window().maximize();
			 
			WebElement currentlocationl=driver.findElement(By.className("border_grey1"));
			
			
			
			 List<WebElement> currentlocation=currentlocationl.findElements(By.tagName("option"));
			
			
			for(int i=0;i<=currentlocation.size();i++);
			
			{
		     
	
				
			}

	}

}
