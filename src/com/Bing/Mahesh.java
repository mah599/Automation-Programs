package com.Bing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Mahesh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://bing.com");
		String actalTitle = driver.getTitle();
		System.out.println("The Actual Title ="+actalTitle);
		String expectedTitle = "Bing";
		System.out.println("The Expected Title ="+expectedTitle);
	if(actalTitle.equals(expectedTitle)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	//String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://www.bing.com/";
	String actualUrl=driver.getCurrentUrl();
	if(actualUrl.contains(expectedUrl)) {
		System.out.println("Url is Matched");
	}else {
		System.out.println("Url is Unmatched");
	}
		driver.quit();
	}

	

}
