package com.obsqura.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class ListOfferCodes extends Base {

	public ListOfferCodes(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	//ClickNewButton
	@FindBy(xpath="//i[@class='fas fa-edit']")
	WebElement newButtonClick;

	//deleteOfferCode
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]")
	WebElement delete;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement deleteOfferAlert;
	public void listOfferCode()
	{
		WaitUtil.visibilityOfEleLocated(driver,newButtonClick);
		WaitUtil.waitForEleToBeClickable(driver,newButtonClick);
		PageUtilities.clickButton(newButtonClick);
	}

	public void deleteOfferCode() 
	{
		PageUtilities.clickButton(delete);
		driver.switchTo().alert().accept();
		WaitUtil.visibilityOfEleLocated(driver,deleteOfferAlert);
		
	}

	public String deleteAlertMsg()
	{ 
		WaitUtil.visibilityOfEleLocated(driver,deleteOfferAlert);
		String actualMsg = deleteOfferAlert.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}

}
