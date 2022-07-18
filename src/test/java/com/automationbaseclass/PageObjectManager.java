package com.automationbaseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojo.Adactin_BookedPage;
import com.pojo.Adactin_FinalPage;
import com.pojo.Adactin_Login_Page;
import com.pojo.Adactin_Logout_Page;
import com.pojo.Adactin_SearchPage;
import com.pojo.Adactin_Select_Page;
import com.pojoautomation.Auto_LoginPage;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private Adactin_Login_Page alp;
	private Adactin_SearchPage search;
	private Adactin_Select_Page select;
	private Adactin_BookedPage book;
	private Adactin_FinalPage myitin;
	private Adactin_Logout_Page alop;
	private Auto_LoginPage login;
	
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	
	public Adactin_Login_Page getInstanceAlp() {
		alp=new Adactin_Login_Page(driver);
		return alp;
	}
	public Adactin_SearchPage getInstanceSearch() {
		search=new Adactin_SearchPage(driver);
		return search;
	}
	public Adactin_Select_Page getInstanceSelect() {
		select=new Adactin_Select_Page(driver);
		return select;
	}
	
	public Adactin_BookedPage getInstanceBooked() {
		book=new Adactin_BookedPage(driver);
		return book;
	}
	
	public Adactin_FinalPage getInstanceFinal() {
		myitin=new Adactin_FinalPage(driver);
		return myitin;
	}
	public Adactin_Logout_Page getInstanceLogout() {
		alop=new Adactin_Logout_Page(driver);
		return alop;
	}

	
	public Auto_LoginPage getInstanceLogin() {
		login=new Auto_LoginPage(driver);
		return login;
	}
	

}
