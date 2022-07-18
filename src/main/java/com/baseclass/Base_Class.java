package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
		
		public static WebDriver driver;
		
		public static WebDriver browserType(String browsername) {
		
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\prabu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Users\\prabu\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			
		driver.manage().window().maximize();
		return driver;

	}
		public static void buttonMethod(WebElement element) {
			element.click();
		}
		
		public static void textInput(WebElement element, String value) {
			element.clear();
			element.sendKeys(value);
		}
		
		public static void urlValue(String url) {
			driver.get(url);
		}
		
		public static void timeOut(int i) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public static void dropDown(WebElement element,String type,String value) {
			
			Select s=new Select(element);
			if(type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			}
			else if(type.equalsIgnoreCase("visbiletext")) {
				s.selectByVisibleText(value);
			}
			else if(type.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}
			
		}
		public static void alert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		public static void alertdismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			
		}
	
		
		public static void close() {
			driver.close();
		}
		
		public static void quit() {
			driver.quit();
		}
		
		public static void screenShot(String screenshot) throws IOException {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\prabu\\eclipse-workspace\\Selenium\\Screenshot\\adactincucumber.png");
			FileUtils.copyFile(src,des);
		}
		
		
		
	}


