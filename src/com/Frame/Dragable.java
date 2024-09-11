package com.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragable {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		String applicationurladdress="https://jqueryui.com/droppable/";
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Mahes\\\\eclipse-workspace\\\\selenium\\\\AutomationTesting\\\\New library\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationurladdress);
		
		driver.manage().window().maximize();
		
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		
	 By framewebpagel=By.className("demo-frame");
	 
	WebElement framewebpage=driver.findElement(framewebpagel);
		
	
	driver.switchTo().frame(framewebpage);
		
    By DragMetomytarget=By.id("draggable");
  WebElement dragmetomytargetl=driver.findElement(DragMetomytarget);
		
  String DragMetomytarget_text=dragmetomytargetl.getText();
  
  System.out.println("the element dragmetomytarget text is:"+DragMetomytarget_text);
  
  //driver.quit();
		
	}

}
