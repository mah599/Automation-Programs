package DropDownTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	 public void noOfLinksTest() {
		
			driver.findElement(By.id("searchDropdownBox"));
			
			List<WebElement> allelements=driver.findElements(By.tagName("option"));
			System.out.println("no of links"+allelements.size());
			
			for (int i=0;i<allelements.size();i++) {
				System.out.println(allelements.get(i).getText());
			}
	}
			
			@AfterMethod
			
			public void teardown() {
				
				driver.quit();
			
	}
	
	
	
	

	

}
