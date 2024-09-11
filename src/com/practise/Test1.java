package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\New library\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("6302279450");
		driver.findElement(By.name("pass")).sendKeys("Mahesh@143");
		
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.name("pass")).sendKeys("Mahesh@143");
		//driver.findElement(By.name("login")).click();
		
		
	}

}
