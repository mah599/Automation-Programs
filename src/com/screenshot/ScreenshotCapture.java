package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotCapture {

	public static void main(String[] args) throws IOException {
	
		
		WebDriver driver;
		
		String applicationurladdress="https://www.bing.com/";
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationurladdress);
		
		//File file =new File("Path");
		
		driver.manage().window().maximize();
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss,new File("C:\\Users\\Mahes\\OneDrive\\Desktop\\TestOutput\\files.png"));
		
		driver.close();
		
		
		

	}

}
