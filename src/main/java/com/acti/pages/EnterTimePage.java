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

public class EnterTimePage extends DriverScript {
	
@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement textUserLogged;
@FindBy(id="logoutLink") WebElement linkLogout;
//@FindBy(xpath = "//a[@class='content selected tasks']") WebElement tasksLink;


//***************************page initialization*******************************************************//
public EnterTimePage()
{
	PageFactory.initElements(driver, this);
}


//public void clickTasks()
//{
//	tasksLink.click();
//}
public void clickLogout()
{
	linkLogout.click();
}
public String verifyUserLogged()
{
	return textUserLogged.getText();
	
}
}
