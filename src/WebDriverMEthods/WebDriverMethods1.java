package WebDriverMEthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		   WebDriver driver=new ChromeDriver();
			
			driver.get("https://adactinhotelapp.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("reyaz0806");
			
			driver.findElement(By.id("password")).sendKeys("reyaz123");
			
			Thread.sleep(1000);
			
			driver.findElement(By.className("login_button")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("datepick_in")).clear();
			
			Thread.sleep(1000);
			
			driver.findElement(By.className("date_pick")).sendKeys("31-07-2024");
			
			Thread.sleep(1000);
			
			driver.quit();
			
		

	}

}
