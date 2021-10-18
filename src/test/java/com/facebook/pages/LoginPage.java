package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.testbase.BaseClass;

public class LoginPage extends BaseClass{
	
	
	@FindBy(xpath="//*[@id=\"pageFooterChildren\"]/ul/li[1]/a")
	public WebElement createAccount;
	
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement login;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	

}
