package com.orangeHRM.orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.platform.win32.Netapi32Util.User;

public class OrangeHomePage {
	public WebDriver driver;
	
	@FindBy(how = How.ID, using="txtUsername")
	public WebElement uname;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(how = How.ID, using="btnLogin")
	public WebElement loginButton;
	
	public OrangeHomePage(WebDriver obj){
		this.driver = obj;
		PageFactory.initElements(driver, this);
	}
	
	public void fillUserName(String usrname){
		this.uname.sendKeys(usrname);
	}

	public void fillPassword(String pwd){
		this.password.sendKeys(pwd);
	}
	
	public void clickLoginButton(){
		this.loginButton.click();
	}
	
	public void loginAsAdmin(){
		fillUserName("Admin");
		fillPassword("admin");
		clickLoginButton();
	}
}
