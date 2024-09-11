package com.TsrtcHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	
	public static void main(String[] args) throws InterruptedException {
		
     //WebDriver driver;
		
		String applicationUrladdress="https://www.tsrtconline.in/oprs-web/";
		
		//System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Mahes\\\\eclipse-workspace\\\\selenium\\\\AutomationTesting\\\\New library\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(applicationUrladdress);
		
		driver.manage().window().maximize();
		
	  By	checkavalibility=By.id("searchBtn");
	
     WebElement	checkavalibiltybutton=driver.findElement(checkavalibility);
		
     checkavalibiltybutton.click();
    // Thread.sleep(10000);
     
    org.openqa.selenium.Alert alert=driver.switchTo().alert();

    alert.accept();
    
    //driver.quit(); 
		
		
		
		
	}

}
