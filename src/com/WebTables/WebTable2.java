package com.WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable2 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void webtable2() {
		
		String part1="//table/tbody/tr[";
		
		String part2="]/td[";
		String part3="]";
		
		for (int i=0;i<=37;i++) {
			for (int j=0;j<=8;j++) {
				System.out.print(driver.findElement(By.xpath(part1+i+part2+j+part3)).getText()+"\t");
			}
			System.out.println();
			
		}
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}
	

}
