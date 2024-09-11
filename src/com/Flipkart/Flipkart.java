package com.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		String aplicationurl="flopkart.com";

		System.setProperty("webdriver chrome driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\driver files new\\chromedriver_win64 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.getTitle();
		String actualflipkartUrl=driver.getTitle();
		System.out.println("the flipkart tile is ="+actualflipkartUrl);
		driver.quit();
		
	}

}
