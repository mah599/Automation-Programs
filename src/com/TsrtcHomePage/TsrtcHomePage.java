package com.TsrtcHomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcHomePage {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		String application_Urladdress="https://www.tsrtconline.in/oprs-web/guest/link/home.do?h=1";
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Mahes\\\\eclipse-workspace\\\\selenium\\\\AutomationTesting\\\\DriverFiles\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(application_Urladdress);
		
		driver.manage().window().maximize();
		
		By linksl=By.tagName("a");
		
			List<WebElement>TSRTC_HomePagelinks=(List<WebElement>) driver.findElements(linksl);
			
		
		int TSRTC_HomePAgelinks_count=TSRTC_HomePagelinks.size();
		
		System.out.println("the tsrtc home page linksl is: "+TSRTC_HomePAgelinks_count);
		
		for(int i=0;i<=TSRTC_HomePagelinks.size()-1;i++)
		{
			String TSRTC_HomePageLinksName=TSRTC_HomePagelinks.get(i).getText();
			
			System.out.println(i+" "+TSRTC_HomePageLinksName);
		}
		driver.quit();
		
		
		
		
		
		
	}

}
