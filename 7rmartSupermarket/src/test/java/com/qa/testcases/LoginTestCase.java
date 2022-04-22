
 package com.qa.testcases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.devtools.v85.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import com.beust.jcommander.Parameters;
import com.obsqura.main.base.Base;
import com.obsqura.qa.pages.LoginPage;
import com.qa.exelcode.ExelRead;
import com.obsqura.qa.pages.DashBoard;


public class LoginTestCase extends Base {


	LoginPage loginPage;
	DashBoard dashboard;

		
//@org.testng.annotations.Parameters({"browser"}) 
	
//@BeforeMethod
	public void before()
	{

		initialization( );
		dashboard=new DashBoard(driver);
	}
	
	@Test
	public void loginTc01() throws IOException
	{

		loginPage=new LoginPage(driver) ;	
		String usr1=ExelRead.readstringdata(0,0,"Sheet1","C:\\Users\\SHABNA\\OneDrive\\Desktop\\Book1.xlsx");   //exel read data
		String ps1=ExelRead.readstringdata(0,1,"Sheet1","C:\\Users\\SHABNA\\OneDrive\\Desktop\\Book1.xlsx");
		loginPage.login(usr1,ps1);  
		
		dashboard=new DashBoard(driver);

		String actualTitle = dashboard.loginvalidateLogin();
		System.out.println(actualTitle);
		String expectedTitle = "7rmart supermarket";
		Assert.assertEquals(actualTitle, expectedTitle);


	}

	@AfterMethod
	public void logOut()
	{
		dashboard=new DashBoard(driver);
		dashboard.logOut();

		
	}

	
}
