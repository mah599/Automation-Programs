package com.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		
   WebDriver driver;

   String applicationurladdress="https://my.monsterindia.com/sponsered_popup.html";

System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
	 driver=new ChromeDriver();
	 
	 driver.get(applicationurladdress);
	 
	 driver.manage().window().maximize();
	 
	By currentlocationl=By.className("border_grey1");
	
	WebElement currentlocation=driver.findElement(currentlocationl);
	 
	 Select currentlocationselect=new Select(currentlocation);
	 
	 currentlocationselect.selectByVisibleText("Chennai");
	 
	 currentlocationselect.selectByIndex(4);
	 
	 currentlocationselect.selectByValue("491");
	 
	 currentlocationselect.deselectAll();
	 
	 By industryl=By.id("id_industry");
	 
	WebElement industryselectl=driver.findElement(industryl);
	
	Select industryselect=new Select(industryselectl);
	
	industryselect.selectByIndex(2);
	
	industryselect.selectByValue("5");
	
    industryselect.selectByVisibleText("FMCG");
   /* 
    industryselect.deselectByIndex(2);
    
    industryselect.deselectByValue("5");
    
    industryselect.deselectByVisibleText("FMCG");
	*/
    
    industryselect.deselectAll();
  
	 
	 

	}

}
