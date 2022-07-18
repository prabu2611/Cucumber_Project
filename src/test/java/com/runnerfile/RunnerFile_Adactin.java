package com.runnerfile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFiles\\login.feature",
					glue ="com.stepdefinition",
					tags= "@regression_run",
					monochrome = true,
					dryRun=false,
					strict=true,
					
					publish=true,
					plugin = {"html:Reports/htmlreport.html",
							  "pretty",
							  "json:Reports/jsonreport.json",
							  //"com.cucumber.listener.ExtentCucumberFormatter:Reports/extent_report.html"
								
					}
		
		
		)


public class RunnerFile_Adactin {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver=Base_Class.browserType("chrome");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	

}
