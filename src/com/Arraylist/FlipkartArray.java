package com.Arraylist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartArray {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		String applicationUrladdress="https://www.flipkart.com/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\New library\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrladdress);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("6302279450");
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Mahesh@143");
		
		driver.findElement(By.xpath("//input[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		//driver.findElement(by)
		
		//<div class="eFQ30H" data-tkid="M_9ec254d5-808e-4559-9dc1-61b1da21fcf8_1_DMEFXQX0ZIXD_MC.BYIXDBQAWBHQ"><a href="https://www.flipkart.com/mobile-phones-big-saving-days-dec22-eidj8fs-store?param=16&amp;fm=neo%2Fmerchandising&amp;iid=M_9ec254d5-808e-4559-9dc1-61b1da21fcf8_1_DMEFXQX0ZIXD_MC.BYIXDBQAWBHQ&amp;otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles%2B%2526%2BTablets_BYIXDBQAWBHQ&amp;otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&amp;cid=BYIXDBQAWBHQ"><div class="_1mkliO"><div class="CXW8mj" style="height: 64px; width: 64px;"><img class="_396cs4  _3exPp9" alt="Mobiles &amp; Tablets" src="https://rukminim1.flixcart.com/fk-p-flap/128/128/image/e2268d56d09df684.png?q=100"></div></div><div class="xtXmba">Mobiles &amp; Tablets</div></a></div>
		
		/*List<WebElement>linksl=driver.findElements(By.className("eFQ30H"));
		
		System.out.println(linksl.size());
		for(int i=1;i<=linksl.size();i++)
		{
			System.out.println(linksl.get(i).getText());
		}*/

	}
	

}
