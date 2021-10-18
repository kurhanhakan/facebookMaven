package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.testbase.BaseClass;

public class CreateAccountPage extends BaseClass{

	/**
	 * This is belong to CreateAccount
	 */
	@FindBy(xpath="//input[@name='firstname']")
	public WebElement name;
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	public WebElement reEnterEmail;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	public WebElement password;
	
	
	
	@FindBy(xpath="//select[@id='month']")
	public WebElement month;
	
	@FindBy(xpath="//select[@id='day']")
	public WebElement day;
	
	@FindBy(xpath="//select[@id='year']")
	public WebElement year;
	
	@FindBy(xpath="//span[@data-type='radio']/span[2]")
	public WebElement male;
	
	@FindBy(name="websubmit")
	public WebElement save;
	
	public CreateAccountPage(){
		
		PageFactory.initElements(driver, this);
	}
	
}
