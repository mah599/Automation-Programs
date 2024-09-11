package com.TsrtcHomePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchButtonCancelTicket {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		String applicationUrladdress="https://www.tsrtconline.in/oprs-web/guest/link/home.do?h=1";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrladdress);
		
		driver.manage().window().maximize();
		 
	By search=By.id("searchBtn");
	
   WebElement	searchbutton=driver.findElement(search);
   
   searchbutton.click();
   
   Thread.sleep(10000);
   
   Alert action=driver.switchTo().alert();
   
   action.accept();
   
   driver.quit();
   
   
   		
	}

	
	
}
