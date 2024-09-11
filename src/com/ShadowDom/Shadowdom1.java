package com.ShadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shadowdom1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
  @Test
  public void shadowdom() {
	  
	  WebElement shadowdom1= driver.findElement(By.xpath("//div[@id='shadow_host']"));
	  SearchContext shadowroot1=shadowdom1.getShadowRoot();
	//org.openqa.selenium.InvalidArgumentException: invalid argument: invalid locator

			//WebElement element1=shadowRoot1.findElement(By.xpath("//input[@type='text']"));


			//using cssSelector
	  WebElement e1=shadowroot1.findElement(By.cssSelector("input[type='text']"));
	  e1.sendKeys("selenium");
  }
  
  @AfterMethod
  
  public void teardown() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.quit();
  }

}