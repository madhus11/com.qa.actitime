package com.acti.tests;

import org.testng.annotations.Test;

import com.acti.pages.LoginPage;
import com.acti.utilis.Helper;

public class LoginTests extends BaseTest {
	

	@Test(priority = 1)
	public void testlogin() 
	{
		lp.enterusername("admin");
		lp.enterpassword("manager");
		lp.clickLogin();

		String actual = etp.verifyUserLogged();
		System.out.println(actual);
		etp.clickLogout();
		Helper.fn_sleep();
		
	}

	@Test(priority = 2)
	public void validateForgotPasswordLink() 
	{
		initApplication();
		LoginPage lp = new LoginPage();
		boolean flag = lp.verifyLinkforgotpassword();
		System.out.println(flag);
		Helper.fn_sleep();
		

	}
}
