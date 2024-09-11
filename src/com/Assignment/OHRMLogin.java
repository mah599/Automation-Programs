package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMLogin {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		 driver.get(applicationUrlAddress);
		 
		String actualTitleof_OHRMLoginpage= driver.getTitle();
		 
		 System.out.println("the actual titl of orhmloginpage:"+actualTitleof_OHRMLoginpage);
		 
		 String expectedTitleOf_OHRMLoginPage="OrangeHRM";
		 
		 System.out.println("the expected title is :"+expectedTitleOf_OHRMLoginPage);
		 
		 if(expectedTitleOf_OHRMLoginPage.equals(actualTitleof_OHRMLoginpage)) {
			 
			 System.out.println("the titleis matched-Pass");
			 
		 }
		 else {
			 
			 System.out.println("the title is not matched-Fail");
		 }
		 
		 String actual_ORHMHomePageUrl=driver.getCurrentUrl();
		 
		 System.out.println("the actual ORHMHome page url is :"+actual_ORHMHomePageUrl);
		 
		 String expected_ORHMHomePageUrl="orangehrm-4.2.0.1";
		 
		 System.out.println("the expecte orhmhome page url is :"+expected_ORHMHomePageUrl);
		 
		 if(actual_ORHMHomePageUrl.contains(expected_ORHMHomePageUrl))
		 {
			 System.out.println("the orhmurlis matched-Pass");
		 }
		 else
		 {
			 System.out.println("the urlis not matched -Fail");
			 
		 }
		 
		 //<div id="logInPanelHeading">LOGIN Panel</div>
		/* 
		 driver.findElement(By.id("logInPanelHeading"));
		 
		 String expectedText="logInPanelHeading";
		 
		 if(expectedText.equals(By.id(expectedText)))
		 {
			 System.out.println("the text is matched-pass");
			 
		 }
		 else
		 {
			 System.out.println("the text is not matched-fail");
		 }
		 */
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		driver.quit();
		 
		 
		 
		 
		
		  
	
		
		
		
		

	}

}
