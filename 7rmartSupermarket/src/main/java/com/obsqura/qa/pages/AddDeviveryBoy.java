package com.obsqura.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;

public class AddDeviveryBoy extends Base {
 
	public  AddDeviveryBoy(WebDriver driver)
{
this.driver=driver;	
PageFactory.initElements(driver,this);
}
	@FindBy(id="name")
	WebElement name;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="phone")
	WebElement phoneno;
	@FindBy(id="address")
	WebElement address;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="//button[@type='submit']")
	WebElement save;
	
	public void addDeliveryBoy()
	{
		PageUtilities.sendInput(name,"Shabna");
		PageUtilities.sendInput(email,"sha123@gmail.com");
		PageUtilities.sendInput(phoneno,"9876543210");
		PageUtilities.sendInput(address,"shabeer manzil");
		PageUtilities.sendInput(username,"sha@123");
		PageUtilities.sendInput(password,"qwerty");
		PageUtilities.clickButton(save);
		
	}
}
