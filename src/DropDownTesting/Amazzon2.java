package DropDownTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazzon2 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void noOfLinkstest() {
		
		List<WebElement>allitems=new Select (driver.findElement(By.id("searchDropdownBox"))).getOptions();
		
		System.out.println("no of options"+allitems);
		
		for(int i=0;i<allitems.size();i++) {
			System.out.println(allitems.get(i).getText());
		}
	}
	
	@Test
	
	public void teardown() {
		
		driver.quit();
	}
	

		
	

}
