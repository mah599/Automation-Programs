package com.qa.testing1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Qa1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
			
		
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://google.com");
	
	driver.get("http://bing.com");
	driver.manage().window().maximize();
	driver.get("http://flipkart.com");
	
	//driver.quit();
	
		
		
		
	}

}
