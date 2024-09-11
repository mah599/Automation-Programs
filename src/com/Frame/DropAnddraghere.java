package com.Frame;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAnddraghere {

	public static void main(String[] args) {
	
		
WebDriver driver;
		
		String applicationUrladdress="https://jqueryui.com/droppable/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrladdress);
		
		driver.manage().window().maximize();
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
	By frameofwebpage=By.className("demo-frame");
		
	WebElement frameofwebpagel=driver.findElement(frameofwebpage);
	
	driver.switchTo().frame(frameofwebpagel);
	
	
     By dragmetomytarget=By.id("draggable");
     
    WebElement dragmetomytargetl=driver.findElement(dragmetomytarget);
    
    String dragmetomytarget_text=dragmetomytargetl.getText();
    
    System.out.println("the element drag me to my target is :"+dragmetomytarget_text);
    
   By dropherel=By.id("droppable");
   
   
  WebElement drophere=driver.findElement(dropherel);
  
  
 Actions action=new Actions(driver);
 
  action.dragAndDrop(dragmetomytargetl, drophere).build().perform();
  
  
	
     

	}

}
