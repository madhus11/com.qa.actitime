package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Developed By:
 * Reviewed By:
 * Last date modified on:2/2/22
 * Description:
 * 
 */


//**********************************page elements**************************************************//
public class LoginPage extends DriverScript {
	//page elements
	@FindBy(id="username") WebElement textboxusername;
	@FindBy(name="pwd") WebElement texboxpassword;
	@FindBy(xpath = "//div[text()='Login ']") WebElement buttonLogin;
	@FindBy(id = "loginRecoveryLinkContainer") WebElement linkForgotPassword;

	//***************************page initialization*******************************************************//
	
	public boolean verifyLinkforgotpassword()
	{
		return linkForgotPassword.isDisplayed();
	}
	public LoginPage()
	{
PageFactory.initElements(driver, this);
	}
//******************************************page methods*****************************************************//
	
public void enterusername(String username)
	{
		textboxusername.sendKeys(username);
		}
	public void enterpassword(String password)
	{
		texboxpassword.sendKeys(password);	
	}
	public void clickLogin()
	{
		buttonLogin.click();
	}
	}
