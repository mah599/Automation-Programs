package WebDriverMEthods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WevDriverMethods4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sell on Amazon")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		//Thread.sleep(2000);
		 
		
		
		driver.findElement(By.linkText("Sell under Amazon Accelerator")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.amazon.in/");driver.navigate().back();
		
		//Thread.sleep(2000);
		 
		driver.findElement(By.linkText("Protect and Build Your Brand")).click();
		
		//driver.findElement(By.className("nav_a")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Amazon Global Selling")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[8]/a")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
	
		//Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Fulfilment by Amazon")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		//Thread.sleep(1000);
	driver.findElement(By.linkText("Advertise Your Products")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
driver.findElement(By.linkText("Amazon Pay on Merchants")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		driver.quit();
		
	}

}
