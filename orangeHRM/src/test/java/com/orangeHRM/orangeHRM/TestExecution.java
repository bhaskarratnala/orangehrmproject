package com.orangeHRM.orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExecution {
	public WebDriver driver;
	public OrangeHomePage orangeHomePageObj;
	
	@BeforeTest
	public void launchApp(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium projects\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		orangeHomePageObj = new OrangeHomePage(driver);
		
	}
	
	@Test(priority =0)
	public void verifyLoginAsAdmin(){
		orangeHomePageObj.loginAsAdmin();
	}

}
