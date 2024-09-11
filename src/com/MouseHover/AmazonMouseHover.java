package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseHover {

	public static void main(String[] args) {
	
	WebDriver driver;
	 
	String applicationurladdress="https://amazon.in";
	
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\New library\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
	
  driver=new ChromeDriver();
  
  driver.get(applicationurladdress);
  
  driver.manage().window().maximize();
  
  By hellosigninl = By.id("nav-link-accountList");
  
 WebElement hellosignin=driver.findElement(hellosigninl);
 
 Actions action=new Actions(driver);
		
  action.moveToElement(hellosignin).build().perform();
  
  By yourordersl= By.linkText("Your Orders");
  
  WebElement yourorders=driver.findElement(yourordersl);
  
  
  yourorders.click();
 
  
 // driver.close();
  
		
		
	}

}















