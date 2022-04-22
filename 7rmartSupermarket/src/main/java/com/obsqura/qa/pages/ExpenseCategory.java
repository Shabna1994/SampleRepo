package com.obsqura.qa.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class ExpenseCategory extends Base{
	public   ExpenseCategory(WebDriver driver)             //constructor
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger' and @href='javascript:void(0)']")
	WebElement addNewExpenseButton;

	@FindBy(id="name")
	WebElement enterNewExpense;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement saveButtonClick;

	@FindBy(xpath ="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchNewExpense;
	@FindBy(id="un")
	WebElement enterExpense;
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement searchButtonClick;

	@FindBy(xpath = "(//tr//td)[1]")
	WebElement searchvalidation;

	public void addExpenseCategory()
	{
		WaitUtil.visibilityOfEleLocated(driver, addNewExpenseButton);
		WaitUtil.waitForEleToBeClickable(driver, addNewExpenseButton);
		addNewExpenseButton.click();

	}

	public void editExpenseCategory()
	{
		WaitUtil.visibilityOfEleLocated(driver, addNewExpenseButton);
		WaitUtil.waitForEleToBeClickable(driver,addNewExpenseButton);
		addNewExpenseButton.click();

		Random r=new Random();
		int low=10,high=100;
		int result=r.nextInt(high-low)+low;
		enterNewExpense.sendKeys("Food"+result);
		WaitUtil.visibilityOfEleLocated(driver, saveButtonClick);
		WaitUtil.waitForEleToBeClickable(driver,saveButtonClick);
		saveButtonClick.click();
	}

	public void searchExpenseCategory(String enterExpense1)
	{
		WaitUtil.visibilityOfEleLocated(driver, searchNewExpense);
		WaitUtil.waitForEleToBeClickable(driver,searchNewExpense);
		searchNewExpense.click();
		WaitUtil.visibilityOfEleLocated(driver,enterExpense);
		PageUtilities.sendInput(enterExpense, enterExpense1);
		WaitUtil.visibilityOfEleLocated(driver,searchButtonClick);
		WaitUtil.waitForEleToBeClickable(driver,searchButtonClick);
		searchButtonClick.click();
	}
	public String statusValidation()
	{
		String actualMsg = searchvalidation.getText();
		System.out.println(actualMsg);
		return actualMsg;
	}
}








