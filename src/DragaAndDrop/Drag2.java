package DragaAndDrop;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Frame.Dragable;

public class Drag2 {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver=new ChromeDriver();

	driver.get("https://jqueryui.com/droppable/");
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	
    Actions action=new Actions(driver);
    
   action.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")),
		   
		   driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).build().perform();
   
   Thread.sleep(3000);
   
   driver.quit();
    		
	
	}

}
