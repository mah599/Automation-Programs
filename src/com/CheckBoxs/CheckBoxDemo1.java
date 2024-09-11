package com.CheckBoxs;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;		

public class CheckBoxDemo1 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	
	public void checkbox() {
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	
	@Test
	
	public void checkbox2() throws InterruptedException {
		
		WebElement e1=driver.findElement(By.xpath("//input[@value='Butter']"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();",e1);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();", e1);
		
		Thread.sleep(3000);
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	
	@Test
	
	public void checkbox3() throws InterruptedException {
		
		List<WebElement> allchecks=driver.findElements(By.xpath("//td[@class='table5']/input"));
		
		for (int i=0;i<=allchecks.size();i++) {
			
			if (allchecks.get(i).isSelected()) {
				WebElement e1=allchecks.get(i);
				//((JavascriptExecutor)driver).executeScript("arguments[0].click();",e1);

				((JavascriptExecutor)driver).executeScript("arguments[0].click();", e1);
				Thread.sleep(3000);
			}
		}
		
		

		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}
	
	@Test
	public void checkbox4() throws InterruptedException {
		
		
	List<WebElement> allchecks=driver.findElements(By.xpath("//td[@class='table5']/input"));
		
		for (int i=0;i<=allchecks.size();i++) {
			
			if (!allchecks.get(i).isSelected()) {
				WebElement e1=allchecks.get(i);
				//((JavascriptExecutor)driver).executeScript("arguments[0].click();",e1);

				((JavascriptExecutor)driver).executeScript("arguments[0].click();", e1);
				Thread.sleep(3000);
			}
		}

		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	}

	@Test
	
	public void teardown() throws InterruptedException {
		
		Thread.sleep(6000);
		
		driver.quit();
	}
}
