package com.Bing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingAssignment {

	public static void main(String[] args) {
		
		
		String applicationUrlAddress="http://google.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\geckodriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
	

	}

}
