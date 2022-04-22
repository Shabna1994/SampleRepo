package com.obsqura.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class ListOrder extends Base {
	public ListOrder(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	//change Status
	@FindBy(xpath="(//a[text()='Change Status'])[1]")
	WebElement changeStatusClick;
	@FindBy(id="status")
	WebElement changeStatusDropdown;
	@FindBy(xpath="(//button[@name='Update_st'])[1]")
	WebElement clickUpdate;


	//change deliveryDate
	@FindBy(xpath="(//a[text()='Change Delivery Date'])[1]")
	WebElement changeDelevaryDateButton;
	@FindBy(xpath="(//input[@type='date'])[3]")
	WebElement changeDate;
	@FindBy(xpath="(//button[@name='Update_st'])[2]")
	WebElement clickDateUpdate;


	//change deliveryBoy
	@FindBy(xpath="(//a[text()='Assign Delivery Boy'])[1]")
	WebElement changeDelevaryBoyButton;
	@FindBy(id="delivery_boy_id")
	WebElement changeDeliveryBoyDropdown;
	@FindBy(xpath="(//button[@name='assign_del'])[1]")
	WebElement clickDBUpdate;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertValidation;

	public void changeStatus(String changeDate1)
	{
		//change status
		PageUtilities.clickButton(changeStatusClick);
		PageUtilities.dropDown(changeStatusDropdown,"Paid");
		PageUtilities.clickButton(clickUpdate);
		driver.navigate().back(); 
		//date  
		PageUtilities.clickButton(changeDelevaryDateButton);
		PageUtilities.sendInput(changeDate, changeDate1);	
		PageUtilities.clickButton(clickDateUpdate);		
		WaitUtil.visibilityOfEleLocated(driver, alertValidation);

	}
	public void changeDelevaryBoy()
	{
		PageUtilities.clickButton(changeDelevaryBoyButton);

		//changeDeliveryBoy
		PageUtilities.dropDown(changeDeliveryBoyDropdown,"sumesh1");
		PageUtilities.clickButton(clickDBUpdate);
		WaitUtil.visibilityOfEleLocated(driver,alertValidation);
	}


	public void listOrder()
	{
		//change status
		PageUtilities.clickButton(changeStatusClick);
		Select statusDrp = new Select(changeStatusDropdown);  
		statusDrp.selectByVisibleText("Paid"); 
		PageUtilities.clickButton(clickUpdate);
		driver.navigate().back();  

		//date not working                   
		PageUtilities.clickButton(changeDelevaryDateButton);
		changeDate.sendKeys("20/03/22");
		PageUtilities.clickButton(clickDateUpdate);		
		PageUtilities.clickButton(changeDelevaryBoyButton);

		//changeDeliveryBoy
		Select deliveryBoyDrp = new Select(changeDeliveryBoyDropdown);  
		deliveryBoyDrp.selectByVisibleText("sumesh1");
		PageUtilities.clickButton(clickDBUpdate); 

	}
	public String statusValidation()
	{
		String actualMsg = alertValidation.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}



}
