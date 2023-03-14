package com.adactinRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.Base_Class;

public class Test_Runner extends Base_Class  {
	public static WebDriver driver1
	;
	public static void main(String[] args) {
		
		
		driver1 =browserLaunch("chrome");
		
		
		geturl("https://adactinhotelapp.com/");
		
		WebElement user = driver1.findElement(By.id("username"));
	inputelement(user,"karthick43");
	


		WebElement password = driver1.findElement(By.id("password"));
		inputelement(password,"life@2023");
	

		WebElement Login = driver1.findElement(By.id("login"));
		Login.click();
		
		System.out.println("Logged In");
		
	}
	
}
