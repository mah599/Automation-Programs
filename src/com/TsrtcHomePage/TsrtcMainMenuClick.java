package com.TsrtcHomePage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TsrtcMainMenuClick {

	public static void main(String[] args) throws IOException {
	
		
	WebDriver driver;
		
		String applicationUrladdress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\New library\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrladdress);
		
		driver.manage().window().maximize();
		
	     By tSRTC_HeaderBlockl = By.className("menu-wrap");
        
	    WebElement tSRTC_HeaderBlock=driver.findElement(tSRTC_HeaderBlockl);
	    
	   
	    
	    
	    By Linksl=By.tagName("a");
	    
	    List<WebElement>Tsrtc_Headerblocklinks=tSRTC_HeaderBlock.findElements(Linksl);
	    int Tsrtc_HeaderBlockLinks_count=Tsrtc_Headerblocklinks.size()-1;
	    
	    System.out.println("the number of links in the tsrtc header block:"+Tsrtc_HeaderBlockLinks_count);
	    
	    for (int index=0;index<=Tsrtc_HeaderBlockLinks_count;index++)
	    {
	    	String Tsrtc_HeaderblockLInkname=Tsrtc_Headerblocklinks.get(index).getText();
	    	
	    	System.out.println(index+" "+Tsrtc_HeaderblockLInkname);
	    	
	    	
	    	Tsrtc_Headerblocklinks.get(index).click();
	    	
	    	String actual_webpagetitle=driver.getTitle();
	    	
	    	System.out.println(actual_webpagetitle);
	    	
	    	String actual_webpagecurrenturladress=driver.getCurrentUrl();
	    	
	    	System.out.println(actual_webpagecurrenturladress);
	    	
	    	System.out.println();
	    	TakesScreenshot take=(TakesScreenshot)driver;
	    	File ss=take.getScreenshotAs(OutputType.FILE);
	    	Files.copy(ss, new File("C:\\Users\\Mahes\\OneDrive\\Desktop\\TestOutput\\files"+Tsrtc_HeaderblockLInkname+".png"));
	    	
	    	
	    	driver.navigate().back();
	    	
	    	tSRTC_HeaderBlockl=By.className("menu-wrap");
	    	
	    	tSRTC_HeaderBlock=driver.findElement(tSRTC_HeaderBlockl);
	    	
	    	Linksl=By.tagName("a");
	    	
	    	Tsrtc_Headerblocklinks=tSRTC_HeaderBlock.findElements(Linksl);
	    	
	    }
	    driver.quit();
	    
		
		
		
		
		
	}

}
