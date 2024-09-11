package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazonss {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		String applicationurl="https://www.amazon.in/";
		
		driver.get(applicationurl);
		
		driver.manage().window().maximize();
		
                  File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                  
                 Files.copy(ss,new File("C:\\Users\\Mahes\\OneDrive\\Desktop\\TestOutput\\files.png"));
                 
                 Thread.sleep(3000);
                 driver.quit();

	}

}
