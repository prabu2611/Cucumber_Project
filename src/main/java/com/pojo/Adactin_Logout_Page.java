package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Logout_Page {
	
	public static WebDriver driver;
	
	@FindBy(id="check_all")
	private WebElement checkall;
	
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancelall;
	
	@FindBy(id="logout")
	private WebElement logout;
	
	public Adactin_Logout_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCheckall() {
		return checkall;
	}

	public WebElement getCancelall() {
		return cancelall;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	


}
