package com.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Amazonlinkscapture {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver;

		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		   By amazonlinks= By.xpath("//div[text()='Make Money with Us']/parent::div");
		   
		   
		   WebElement amazonalllinks=driver.findElement(amazonlinks);
		    
		    
		    By Linksl=By.tagName("a");
		    
		    
		    List<WebElement> amazon_links = amazonalllinks.findElements(Linksl);
		    
		    
		    int amazon_makemoneyLinks_count=amazon_links.size();
		    
		    for(int index=0;index<=amazon_makemoneyLinks_count;index++) {
		    	
		    	String amazon_makemoneyLInkname=amazon_links.get(index).getText();
		    	
		    	System.out.println(index+" "+amazon_makemoneyLInkname);
		   
		    	
		    	amazon_links.get(index).click();
		    	WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(30));

		    	File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	
				Files.copy(ss,new File("C:\\Users\\Mahes\\OneDrive\\Desktop\\TestOutput\\"+amazon_makemoneyLInkname+".png"));
				
		    	driver.navigate().back();
		  
		    	amazonlinks = By.xpath("//div[text()='Make Money with Us']/parent::div");
		    	
		    	amazonalllinks=driver.findElement(amazonlinks);
		    	
		    	Linksl=By.tagName("a");
		    	
		    	amazon_links = amazonalllinks.findElements(Linksl);
		    	
		    	
		    	
		    }
		    driver.quit();
		    
	}

}














