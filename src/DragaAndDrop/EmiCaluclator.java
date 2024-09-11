package DragaAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmiCaluclator {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://emicalculator.net/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		
		action.dragAndDropBy(driver.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default")),  25,35 ).build().perform();
		 action.dragAndDropBy(driver.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default")), 25, (int) 37.5).build().perform();
		 
		 driver.quit();
		

	}

}
