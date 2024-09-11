package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		String applicationurladdress="https://www.youtube.com/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ytd-searchbox-spt")).click();
		driver.findElement(By.tagName("input")).sendKeys("simha movie");
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
		driver.findElement(By.tagName("yt-formatted-string")).click();
		
		
		
		
		
		
		
	}

}
