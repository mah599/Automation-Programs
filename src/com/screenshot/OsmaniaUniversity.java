package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class OsmaniaUniversity {

	public static void main(String[] args) throws IOException {
		
		

		WebDriver driver;
		
		String applicationUrladdress="https://www.osmania.ac.in/";
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrladdress);
		
		driver.manage().window().maximize();
		
	    By currentlocationl=By.className("notranslate");
		WebElement currentlocation = driver.findElement(currentlocationl);
		Select sc=new Select(currentlocation);
		List<WebElement> values = sc.getOptions();
		
		for(int i=0;i<=values.size()-1;i++) {
			System.out.println(values.get(i).getText());
			values.get(i).click();
		
			driver.navigate().back();
			currentlocationl=By.className("notranslate");
			currentlocation = driver.findElement(currentlocationl);
			driver.quit();
			
			
			
			
		}
		
	
		
		
		
		


	}

}
