package com.automationbaseclass;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;
import com.helperfile.FileReadManager;
import com.pojo.Adactin_Login_Page;

public class Adactin_Base extends Base_Class {
	
	public static void main(String[] args) throws IOException {
		
		driver=browserType("chrome");
		
		urlValue(FileReadManager.getInstance_FRM().getInstance_CR().get_Url());
		
		PageObjectManager pom=new PageObjectManager(driver);
		
		
		textInput(pom.getInstanceAlp().getUsername(),FileReadManager.getInstance_FRM().getInstance_CR().get_Uname());
		
		timeOut(10);
		
		textInput(pom.getInstanceAlp().getPassword(),FileReadManager.getInstance_FRM().getInstance_CR().get_Pass());
		
		buttonMethod(pom.getInstanceAlp().getLogin());
		
		dropDown(pom.getInstanceSearch().getLocate(),"byIndex","2");
		
		dropDown(pom.getInstanceSearch().getHotel(),"byIndex","3");
		
		dropDown(pom.getInstanceSearch().getRoom(),"byIndex","2");
		
		dropDown(pom.getInstanceSearch().getRoomno(),"byIndex","2");
		
		textInput(pom.getInstanceSearch().getCheckin(),"08/07/2022");
		
		textInput(pom.getInstanceSearch().getCheckout(),"12/07/2022");
		
		dropDown(pom.getInstanceSearch().getAdult(),"byIndex","3");
		
		dropDown(pom.getInstanceSearch().getChild(),"byIndex","2");
		
		buttonMethod(pom.getInstanceSearch().getSubmit());
		
		buttonMethod(pom.getInstanceSelect().getRadio());
		
		buttonMethod(pom.getInstanceSelect().getContin());
		
		textInput(pom.getInstanceBooked().getFname(),"Prabu");
		
		textInput(pom.getInstanceBooked().getLname(),"Meganathan");
		
		textInput(pom.getInstanceBooked().getAddress(),"Porur,Chennai");
		
		textInput(pom.getInstanceBooked().getCvv(),FileReadManager.getInstance_FRM().getInstance_CR().get_Ccnum());
		
		dropDown(pom.getInstanceBooked().getCctype(),"byIndex","2");
		
		dropDown(pom.getInstanceBooked().getExpmon(),"byIndex","8");
		
		dropDown(pom.getInstanceBooked().getCcexpyear(),"byIndex","5");
		
		textInput(pom.getInstanceBooked().getCccvv(),FileReadManager.getInstance_FRM().getInstance_CR().get_Cccvv());
		
		buttonMethod(pom.getInstanceBooked().getBook());
		
		buttonMethod(pom.getInstanceFinal().getMyitin());
		
		buttonMethod(pom.getInstanceLogout().getCheckall());
		
		buttonMethod(pom.getInstanceLogout().getCancelall());
		
		alert();
		
		buttonMethod(pom.getInstanceLogout().getLogout());
		
		screenShot("C:\\Users\\prabu\\eclipse-workspace\\Selenium\\Screenshot\\adactincucumber.png");
		
		close();
	}
	
	

}
