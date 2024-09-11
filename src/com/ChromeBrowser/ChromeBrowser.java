package com.ChromeBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\New library\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("http://Google.com");
		/*driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://whatsapp.com");
		*/
		
		
		String actual_GoogleHomePageTitle=driver.getTitle();
		System.out.println(actual_GoogleHomePageTitle);
		
		String expected_GoogleHomePageTitle="Google";
		
		 if (actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle)) {
		    	
		    	
		    	System.out.println("the expected home page title is -Pass");
		    }

		    else {
		    	
		    	System.out.println("the actual home page title is -fail");
		    }
	
			//driver.close();	
		
		driver.quit();
			
			
				
					
					
					
					
		

	}

}
