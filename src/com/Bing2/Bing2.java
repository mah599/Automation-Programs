package com.Bing2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver chrome driver","C:\\Users\\Mahes\\eclipse-workspace\\selenium\\AutomationTesting\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		String actualtitle=driver.getTitle();
		String expectedTitle="Bing";
		System.out.println("the expected title is ="+expectedTitle);
		if(actualtitle.equals(expectedTitle)) {
			System.out.println("expected title is matched-pass");
			
		}
		else {
			System.out.println("the expected title is not matched-fail");
			
		}
		if(expectedTitle.charAt(0)=='B') {
			System.out.println("char matched=pASS");
		}
		else {
			System.out.println("char not matched=fail");
		}
		String expected_Title="bing.com";
		String actual_Title=driver.getCurrentUrl();
		System.out.println("actual title is ="+actual_Title);
		if (actual_Title.contains(expected_Title)) {
			System.out.println("matched=pass");
		}
			else {
				System.out.println();
				
			}
		

	}

}
