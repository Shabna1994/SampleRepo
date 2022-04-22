package com.obsqura.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class ListLocations extends Base {



	public ListLocations(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	//addButtonClick
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement addButtonClick;

	public void listLocation()
	{

		WaitUtil.visibilityOfEleLocated(driver, addButtonClick);
		WaitUtil.waitForEleToBeClickable(driver, addButtonClick);
		PageUtilities.clickButton(addButtonClick);
	}
}