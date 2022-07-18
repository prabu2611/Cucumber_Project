package com.pojoautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_LoginPage {
	
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	
	public Auto_LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	public static WebDriver getDriver() {
		return driver;
	}




	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}
	
	

}
