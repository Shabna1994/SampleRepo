package com.obsqura.qa.pages;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.RandomNumberUtil;
import com.qa.utilities.WaitUtil;

public class AddOfferCodes extends Base{

	public  AddOfferCodes(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}
	//add offercode
	@FindBy(id="offer_code")
	WebElement offerCode;
	@FindBy(xpath="(//input[@value='yes'])[1]")
	WebElement firstOrderUser;
	@FindBy(id="offer_per")
	WebElement offerPercentage;
	@FindBy(id="offer_price")
	WebElement price;
	@FindBy(xpath = "//div[@class='note-editable card-block']")
	WebElement description;
	@FindBy(id="main_img")
	WebElement imageUpload;
	@FindBy(xpath = "//strong[text()='Copyright © 2022 ']")
	WebElement scrillbyFooterText;
	@FindBy(xpath="//button[@type='submit' and @name='create']")
	WebElement saveButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement addOfferAlert;
	
	public void addOfferCode(String offerCode1,String offerPercentage1 ,String price1 ,String description1,String imageUpload1) 
	{
		
		WaitUtil.visibilityOfEleLocated(driver,offerCode);
		
		PageUtilities.sendInput(offerCode,offerCode1);                              
		PageUtilities.clickButton(firstOrderUser);                                        
		WaitUtil.visibilityOfEleLocated(driver,offerPercentage);
		PageUtilities.sendInput(offerPercentage,offerPercentage1);                                                        
		PageUtilities.sendInput(price,price1); 
		PageUtilities.scrollByWebelement(driver, saveButton);
		WaitUtil.visibilityOfEleLocated(driver,description);
		PageUtilities.sendInput(description,description1);                                       
		PageUtilities.sendInput(imageUpload,imageUpload1); 
		WaitUtil.visibilityOfEleLocated(driver, scrillbyFooterText);
		PageUtilities.scrollByWebelement(driver, scrillbyFooterText);
		WaitUtil.waitForEleToBeClickable(driver, saveButton);
		PageUtilities.clickButton(saveButton);
		WaitUtil.visibilityOfEleLocated(driver, scrillbyFooterText);
	}

	public String addAlertMsg()
	{
		WaitUtil.visibilityOfEleLocated(driver, addOfferAlert);
		String actualMsg = addOfferAlert.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}
	
	
}
