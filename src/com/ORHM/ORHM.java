package com.ORHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ORHM {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		//validation of orangehrmtitle
		
		
		String actual_titleoforangehrmloginpage=driver.getTitle();
				
				String expected_titleoforangehrmloginpage="OrangeHRM";
		
		System.out.println("the title odf ORHM title is:"+actual_titleoforangehrmloginpage);
		if(actual_titleoforangehrmloginpage.equals(expected_titleoforangehrmloginpage))
		{
			System.out.println("the title is matched_PASS");
			
		}
		else
		{
			System.out.println("the title is not matched_FAIL");
		}
		
		
		//logipage url address
		
		 
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
			 
			 
			 
		
	//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Mahesh@reddy");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		driver.findElement(By.id("txtPassword")).sendKeys("Mahesh@143");
		
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.name("Submit")).click();
		
		
			//navigate add employe page
		
	By pim=By.id("menu_pim_viewPimModule");

	
	WebElement piml=driver.findElement(pim);
		
	Actions action=new Actions(driver);
	action.moveToElement(piml).build().perform();
   
	By	Addemployel=By.id("menu_pim_addEmployee");
		
	WebElement	AddEmploye=driver.findElement(Addemployel);
	
	
   AddEmploye.click();
   
   driver.findElement(By.className("formInputText")).sendKeys("Mahesh");
   
   driver.findElement(By.id("lastName")).sendKeys("Reddy");
   
   String expected_id="0";
   String actual_id=driver.getPageSource();
   
   if(actual_id.equals(expected_id))
   {
	   System.out.println("id is matched-PASS");
	   
   }
   else
   {
	   System.out.println("id is not matched_FAIL");
	   
   }
         
              //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>

 By welocomeadmin=By.id("welcome");
 
            WebElement welcomeadminl=driver.findElement(welocomeadmin);
            
            welcomeadminl.click();
            
            
            //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
            
            
            

           By logout=By.tagName("a");
           
          WebElement logoutl=driver.findElement(logout);
          
          Thread.sleep(10000);
          
          logoutl.click();
  
   
	driver.quit();
	}
	
	
	
	

}
