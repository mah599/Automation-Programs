package com.Arraylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apsrtc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		//114.0.5735.134
		
		
		String applicationUrladdress="https://www.apsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\driver files new\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrladdress);
		
	driver.manage().window().maximize();
		
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home</a> 
		
		List<WebElement>Locator=driver.findElements(By.tagName("a"));
		
		System.out.println(Locator.size());
		
		for (int i=20;i<=Locator.size();i++)
		{
			System.out.println(Locator.get(i).getText());
			Thread.sleep(10000);
			
			driver.close();
		}
	
		
	
		

	}

}