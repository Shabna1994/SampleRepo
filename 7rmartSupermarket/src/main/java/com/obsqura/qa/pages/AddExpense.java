package com.obsqura.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class AddExpense  extends Base{       //page related to ManageExpense in Manage Expense

	public   AddExpense(WebDriver driver)            
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="user_id")
	WebElement user;
	@FindBy(id="ex_date")
	WebElement date;
	@FindBy(xpath = "//label[@for='date']")
	WebElement dateclick;
	@FindBy(id="ex_cat")
	WebElement category;
	@FindBy(id="order_id")
	WebElement orderId;
	@FindBy(id="purchase_id")
	WebElement purchaseId;
	@FindBy(id="ex_type")
	WebElement expenseType;
	@FindBy(id="amount")
	WebElement amount;
	@FindBy(id="content")
	WebElement remark;
	@FindBy(xpath ="//input[@type='file']" )
	WebElement image;

	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;


	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertVali;



	public void addExpenses(String date1,String amount1,String remark1,String image1)
	{
		PageUtilities.dropDown(user,"Admin(Admin)");
		PageUtilities.clearInput(date);
		PageUtilities.sendInput(date,date1);
		PageUtilities.clickButton(dateclick);
		PageUtilities.dropDown(category,"NewYear expense");
		PageUtilities.dropDown(orderId,"11");
		PageUtilities.dropDown(purchaseId,"4");
		PageUtilities.dropDown(	expenseType,"Debit Bank");
		PageUtilities.sendInput(amount, amount1);
		PageUtilities.sendInput(remark,remark1);
		WaitUtil.visibilityOfEleLocated(driver, saveButton);
		PageUtilities.scrollByWebelement(driver, saveButton);
		PageUtilities.sendInput(image,image1);
		PageUtilities.clickButton(saveButton);

	}

	public String alertValidation()
	{
		String actualMsg = alertVali.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}

}
