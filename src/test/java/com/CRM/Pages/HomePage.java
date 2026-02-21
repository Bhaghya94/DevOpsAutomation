package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	// Encapsulation = private data + public methods
	private WebDriver driver;
	
	
	// initialize driver - constructor
	public HomePage(WebDriver driver) {  // base class driver
		this.driver = driver;
	}
	
	
	// data member(locator)
	private By link = By.linkText("Sign In");
	
	
	// methods(functionality to test)
	public String getAppUrl() {
		
		return driver.getCurrentUrl();	
	}
	
	public String getAppTitle() {
		
		return driver.getTitle();
	}
	
	public String getStatusOfLink() {
		
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}

}
