package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//WebElement Refname = driver.Findelement (By.Locators("Value"));
	
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement user;
	
	
	public WebElement getUser() {
		return user;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	@FindBy(id = "password")
	private WebElement pwd;
	
	@FindBy(id = "login")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	
}
