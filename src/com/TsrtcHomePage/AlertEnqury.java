package com.TsrtcHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEnqury {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
			
			String applicationUrladdress="https://www.tsrtconline.in/oprs-web/guest/link/home.do?h=1";
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get(applicationUrladdress);
			
			driver.manage().window().maximize();
			
		By	submit=By.id("searchBtn");
		
	WebElement	submitbutton=driver.findElement(submit);
		
		submitbutton.click();
	    Thread.sleep(10000);
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		
        alert.accept();
        
    
        
        driver.quit();
	}

}
