package com.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String applicationUrlAddress="http://flipkart.com";
		System.setProperty("webdriver chrome driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\driver files new\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		String actual_FlipkartPageUrlAddress=driver.getCurrentUrl();
		System.out.println("the application url address is flipkart="+actual_FlipkartPageUrlAddress);
System.out.println(applicationUrlAddress);
driver.quit();
	}

}
