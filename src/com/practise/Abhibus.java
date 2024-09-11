package com.practise;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String applicationurladress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\New library\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		
	  driver=new ChromeDriver();
	  driver.get(applicationurladress);
	  driver.manage().window().maximize();
	  By enquiry=By.className("tabcopy");

	  WebElement enquirybutton=driver.findElement(enquiry);
	  
	  enquirybutton.click();
	 
		
	
		
		
		

	}

}
