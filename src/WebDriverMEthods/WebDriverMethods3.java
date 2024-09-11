package WebDriverMEthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.Select;

import com.SelectClass.SelectClass;

public class WebDriverMethods3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		
		
	WebElement date=driver.findElement(By.id("day"));
		
		Select s1=new Select(date);
		s1.selectByVisibleText("5");
		
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		
		s2.selectByVisibleText("Feb");
		
	WebElement year=driver.findElement(By.id("year"));
		
	Select s3=new Select(year);
		s3.selectByVisibleText("2001");
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
	
		
	}

}
