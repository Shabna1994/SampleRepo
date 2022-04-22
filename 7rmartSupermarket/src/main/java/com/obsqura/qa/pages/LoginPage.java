package com.obsqura.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.main.base.Base;
import com.qa.exelcode.ExelRead;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;



public class LoginPage extends Base {

	public  LoginPage(WebDriver driver)            
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath ="//input[@name='username']")
	WebElement userName;
	@FindBy(xpath ="//input[@name='password']")
	WebElement passWord ;
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement login;



	
	public void login(String usr1, String ps1) throws IOException
	{
		usr1=ExelRead.readstringdata(0,0,"Sheet1","C:\\Users\\SHABNA\\OneDrive\\Desktop\\Book1.xlsx");   //exel read data
		ps1=ExelRead.readstringdata(0,1,"Sheet1","C:\\Users\\SHABNA\\OneDrive\\Desktop\\Book1.xlsx");
		PageUtilities.sendInput(userName,usr1);
		PageUtilities.sendInput(passWord,ps1);
		PageUtilities.clickButton(login);


	}

	
	
	
	
	
	public void loginFail(String username,String password)
	{

		PageUtilities.sendInput(userName, username);
		PageUtilities.sendInput(passWord, password);
		PageUtilities.clickButton(login);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


