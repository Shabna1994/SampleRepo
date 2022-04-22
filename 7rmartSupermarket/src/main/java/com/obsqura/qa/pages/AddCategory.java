package com.obsqura.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.RandomNumberUtil;
import com.qa.utilities.WaitUtil;

public class AddCategory extends Base{
	public AddCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	//add new category
	@FindBy(id="category")
	WebElement categoryName;
	@FindBy(id="4-selectable")
	WebElement selectGroup;
	@FindBy(id="main_img")
	WebElement imageUpload;
	@FindBy(xpath = "(//input[@value='no'])[1]")
	WebElement topRadio;
	@FindBy(xpath = "(//input[@value='no'])[2]")
	WebElement leftRadio;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickSaveButton;

	@FindBy(xpath = "//footer[@class='main-footer text-sm']")
	WebElement scrolldownWithFooter;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMsg;

	public void addCategory(String categoryName1 ,String imageUpload1 )
	{
 
		PageUtilities.sendInput(categoryName,categoryName1);
		PageUtilities.clickButton(selectGroup);
        PageUtilities.scrollByWebelement(driver, scrolldownWithFooter);
        PageUtilities.sendInput(imageUpload,imageUpload1);
		PageUtilities.clickButton(topRadio);
		PageUtilities.clickButton(leftRadio);
		PageUtilities.clickButton(clickSaveButton);
		WaitUtil.visibilityOfEleLocated(driver, alertMsg);

	}

	public String alertMsg()
	{
		String actualMsg = alertMsg.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}
}



