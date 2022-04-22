package com.obsqura.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.obsqura.main.base.Base;
import com.qa.utilities.WaitUtil;

public class ListExpense extends Base{       //page related to ManageExpense in Manage Expense

	public   ListExpense(WebDriver driver)            
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	//add expense
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement listExpense1;

	//editExpense
	@FindBy( xpath = "(//a[@role=\"button\"]//child::i[@class=\"fas fa-edit\"])[1]" )
	WebElement editExpense;

	//delete expensebutton
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]")
	WebElement deleteExpense;
	//delete alertValidation
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertValidation;


	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement deleteAlertValidation;

	public void listExpense()
	{
		WaitUtil.visibilityOfEleLocated(driver,listExpense1);
		WaitUtil.waitForEleToBeClickable(driver,listExpense1);
		listExpense1.click();
	}

	public void editExpense()
	{
		WaitUtil.visibilityOfEleLocated(driver,editExpense);
		WaitUtil.waitForEleToBeClickable(driver,editExpense);
		editExpense.click();
	}

	public void deleteExpense()
	{
		WaitUtil.visibilityOfEleLocated(driver,deleteExpense);
		WaitUtil.waitForEleToBeClickable(driver,deleteExpense);
		deleteExpense.click();
		driver.switchTo().alert().accept();
	}
	public String deleteAlert()
	{

		WaitUtil.visibilityOfEleLocated(driver,deleteAlertValidation);
		String actualMsg = deleteAlertValidation.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}







}
