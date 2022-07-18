package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_FinalPage {
	
	public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement myitin;
	
	
	public Adactin_FinalPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	public WebElement getMyitin() {
		return myitin;
	}
	
	

}
