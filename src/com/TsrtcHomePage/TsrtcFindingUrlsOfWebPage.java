package com.TsrtcHomePage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcFindingUrlsOfWebPage {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver;
			
			String applicationUrladdress="https://www.tsrtconline.in/oprs-web/guest/link/home.do?h=1";
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get(applicationUrladdress);
			
			driver.manage().window().maximize();
		
		WebElement Tsrtc_webpage_all_links = driver.findElement(By.className("menu-wrap"));
		
		
		 List<WebElement> tsrtc_webpagelinks = Tsrtc_webpage_all_links.findElements(By.tagName("a"));
		 
		 for(int i=0;i<=tsrtc_webpagelinks.size()-1;i++) {
			 
			 String Tsrtc_webpagelinksName = tsrtc_webpagelinks.get(i).getText();
			 
			 System.out.println(Tsrtc_webpagelinksName);
			 
			 tsrtc_webpagelinks.get(i).click();
			 
			 String tsrtc_webpageurl_addressurlAddress = driver.getCurrentUrl();
			 
			 System.out.println(tsrtc_webpageurl_addressurlAddress);
			 
			 driver.navigate().back();
			 
			 Tsrtc_webpage_all_links = driver.findElement(By.className("menu-wrap"));
			 
			 tsrtc_webpagelinks=Tsrtc_webpage_all_links.findElements(By.tagName("a"));
			 
		 }
		 driver.quit();
		
		
		
	}

}
