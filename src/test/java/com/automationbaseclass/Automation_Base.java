package com.automationbaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class Automation_Base extends Base_Class {
	
	public static void main(String[] args) {
		
		browserType("edge");
		
		urlValue("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		PageObjectManager pom=new PageObjectManager(driver);
		
		
		//WebElement username = driver.findElement(By.id("email"));
		textInput(pom.getInstanceLogin().getUsername(),"prabumeganathan2611@gmail.com");
		
		//WebElement password = driver.findElement(By.id("passwd"));
		textInput(pom.getInstanceLogin().getPassword(),"prabu@123");
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		buttonMethod(submit);
		
		close();
		
		
		
		
		
		
	}
	

}
