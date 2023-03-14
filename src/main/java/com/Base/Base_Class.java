package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String broswer) {
		if(broswer.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.driv")+"\\Drivers\\chromedriver.exe" );
			 driver = new ChromeDriver();
			
		}
		
	
		else if(broswer.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.driv")+"\\Drivers\\geckodriver.exe" );
			 driver = new FirefoxDriver();
			 
			
	}else {
		System.out.println("Driver Invalid");
	}
		return driver;
	}
		public static void geturl(String url) {
			driver.get(url);
		

}
public static void inputelement(WebElement element , String value) {
	element.sendKeys(value);
	}
	}