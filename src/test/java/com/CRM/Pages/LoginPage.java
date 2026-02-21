package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	// initialize driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// locator
	By email = By.id("email-id");
	By password = By.id("password");
	By submitbtn = By.name("submit-name");
	
	
	// method
	public String Login(String em, String pw) {
		
		driver.findElement(email).sendKeys(em);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(submitbtn).click();
		return driver.getCurrentUrl();
	}
}
