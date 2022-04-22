package com.obsqura.qa.pages;


import java.util.Random;

import javax.swing.text.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.RandomNumberUtil;
import com.qa.utilities.WaitUtil;



public class DAddPages extends Base
{



	public DAddPages(WebDriver driver) 
	{
this.driver=driver;
PageFactory.initElements(driver,this);
	}
	//add page
	@FindBy(id = "title")
	WebElement title;
	@FindBy(xpath = "//div[@role='textbox']")
	WebElement description;
	@FindBy(id = "page")
	WebElement page;
	@FindBy(id="main_img")
	WebElement imageUploading;
	@FindBy(xpath ="//button[@type='submit' and @name='create']")                  //not working
	WebElement saveButton;
	
	
	//popupvalidation
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertValidation;
	
	public void addPage(String title1,String description1,String page1)
	{
		
		
		PageUtilities.sendInput(title,title1);
		PageUtilities.sendInput(description,description1);
		PageUtilities.sendInput(page,page1);
		PageUtilities.scrollByWebelement(driver, saveButton);
		WaitUtil.waitForEleToBeClickable(driver, saveButton);
		WaitUtil.visibilityOfEleLocated(driver, saveButton);
		PageUtilities.clickButton(saveButton);
		driver.navigate().back();
		PageUtilities.scrollByWebelement(driver, alertValidation);
		
	}
	
	public String addAlertMsg()
	{
		String actualMsg = alertValidation.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	    
	}
}









