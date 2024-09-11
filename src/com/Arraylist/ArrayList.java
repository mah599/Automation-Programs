package com.Arraylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayList {

	public static void main(String[] args) {
	WebDriver driver;
		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/guest/link/home.do?h=1";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		 driver.get(applicationUrlAddress);
		List<WebElement> LinksL = driver.findElements(By.className("tabcopy"));
		System.out.println(LinksL.size());
		for(int i=0;i<=LinksL.size()-1;i++) {
			System.out.println(LinksL.get(i).getText());
		}
		 
		 

	}

}
