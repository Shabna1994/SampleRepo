package com.obsqura.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class ManageCOD extends Base {

	public ManageCOD(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@value='no']")	//radio button selection
	WebElement codno;
	@FindBy(xpath="//input[@value='yes']")
	WebElement codyes;
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement codAlert;


	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	public void manageCOD()
	{
		PageUtilities.clickButton(codno);
		PageUtilities.clickButton(saveButton);
		PageUtilities.clickButton(codyes);
		PageUtilities.clickButton(saveButton);
	}
	public String codAlert()
	{
		String actualMsg= codAlert.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;

	}
}