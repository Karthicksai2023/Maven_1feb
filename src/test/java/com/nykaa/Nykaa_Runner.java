package com.nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.Base_Class;

public class Nykaa_Runner  {
	public static void main(String[] args) throws Exception {
		Browser_Launch() ;
		maximize();
		implicity_Wait(20);
		WebDriver_Methods("get","https://www.nykaa.com");
		
		By driver;
		WebElement signin = driver.findElement(By.xpath("(//button[@kind='secondary'])[1]"));
		click(signin);
		
		WebElement mobilenumber = driver.findElement(By.name("emailmobile" ));
		inputelement(mobilenumber,"9176198176");
		WebElement proceed = driver.findElement(By.id("submitVerfication"));
		click(proceed);
		
		WebElement otp = driver.findElement(By.name("otpValue"));
		click(otp);
		
		Scanner("complete word" otp);
		Thread_Sleep(2000);
		WebElement verify = driver.findElement(By.xpath("//button[@type='submit']"));
		click(verify);
		
		
	}

	
		
	}


