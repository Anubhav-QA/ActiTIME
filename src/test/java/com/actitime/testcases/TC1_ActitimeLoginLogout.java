package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.pages.Actitime_HomePage;
import com.actitime.pages.Actitime_LoginPage;
import com.actitime.utility.BaseTest;

public class TC1_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		Actitime_LoginPage loginPage=new Actitime_LoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() throws InterruptedException
	{
		Actitime_HomePage homePage=new Actitime_HomePage(driver);
		homePage.logoutMethod();
	}
}