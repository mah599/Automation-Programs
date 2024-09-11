package com.Arraylist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arry {
	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		String applicationUrladdress="https://www.facebook.com/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\New library\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		
       driver =new ChromeDriver();
       
       driver.get(applicationUrladdress);
      String actualTitle_ofFacebookHomePage=driver.getTitle();
      
      
       String expectedTitle_ofFacebookHomePage ="Facebook –  log in or sign up";
       
       System.out.println("the titleof facebook is:"+actualTitle_ofFacebookHomePage);
       
       if(expectedTitle_ofFacebookHomePage.equals(actualTitle_ofFacebookHomePage))
       {
    	   System.out.println("the titleis matche-pass");
    	   
       }
       else
       {
    	   System.out.println("title is not matched-Fail");
       }
      
       driver.quit();
       
       
		
		
		
		
	}

}
