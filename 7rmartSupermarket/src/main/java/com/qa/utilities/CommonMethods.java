package com.qa.utilities;

import java.io.IOException;

import com.obsqura.main.base.Base;
import com.obsqura.qa.pages.DashBoard;
import com.obsqura.qa.pages.LoginPage;
import com.qa.exelcode.ExelRead;

public class CommonMethods extends Base{
	static LoginPage loginPage;
	static DashBoard dashboard;
	
	public static void login() throws IOException
	{
		String usr1=ExelRead.readstringdata(0,0,"Sheet1","C:\\Users\\SHABNA\\OneDrive\\Desktop\\Book1.xlsx");   //exel read data
		String ps1=ExelRead.readstringdata(0,1,"Sheet1","C:\\Users\\SHABNA\\OneDrive\\Desktop\\Book1.xlsx");
		loginPage=new LoginPage(driver) ;	
		loginPage.login(usr1,ps1);	
		
	}
}


