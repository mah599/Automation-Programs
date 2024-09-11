package com.TsrtcHomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainmenuUrl {

	public static void main(String[] args) {
		
		
		
WebDriver driver;
		
		String applicationUrladdress="https://www.tsrtconline.in/oprs-web/guest/link/home.do?h=1";
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrladdress);
		
		driver.manage().window().maximize();
		
		 By tSRTC_HeaderBlockl=By.className("menu-wrap");
	        
		    WebElement tSRTC_HeaderBlock=driver.findElement(tSRTC_HeaderBlockl);
		    
		    
		    By Linksl=By.tagName("a");
		    
		    List<WebElement>Tsrtc_Headerblocklinks=tSRTC_HeaderBlock.findElements(Linksl);
		    int Tsrtc_HeaderBlockLinks_count=Tsrtc_Headerblocklinks.size()-1;
		    
		    System.out.println("the number of links in the tsrtc header block:"+Tsrtc_HeaderBlockLinks_count);
		    
		   
		    
	}

}
