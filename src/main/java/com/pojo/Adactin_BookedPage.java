package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_BookedPage {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cvv;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmon;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	public Adactin_BookedPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	

}
