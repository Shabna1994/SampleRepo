package com.obsqura.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.main.base.Base;
import com.qa.utilities.WaitUtil;

public class ListSubCategories extends Base{
	public ListSubCategories(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath = "(//i[@class='fas fa-edit'])[2]//parent::a")
	WebElement clickEditButton;
	//editcategory
	@FindBy(id="cat_id")
	WebElement categoryName;
	@FindBy(id="subcategory")
	WebElement subCategoryName;


	@FindBy(id="main_img")
	WebElement imageUpload;


	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickUpdateButton;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement editAlert;


	public void listSubCategory1() 
	{

		WaitUtil.visibilityOfEleLocated(driver,clickEditButton);
		WaitUtil.waitForEleToBeClickable(driver,clickEditButton);;
		clickEditButton.click();
	}
	public void listSubCategory() 
	{
		Select cat1 = new Select(categoryName);  
		cat1.selectByVisibleText("Grocery & Staples");
		WaitUtil.visibilityOfEleLocated(driver,imageUpload);
		imageUpload.sendKeys("C:\\Users\\SHABNA\\OneDrive\\Pictures\\Saved Pictures\\toy.jpg");

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",clickUpdateButton);

		WaitUtil.visibilityOfEleLocated(driver,clickUpdateButton);
		WaitUtil.waitForEleToBeClickable(driver,clickUpdateButton);
		clickUpdateButton.click();
	}
	public String editCategoryAlert()
	{
		WaitUtil.visibilityOfEleLocated(driver,editAlert);
		String actualMsg= editAlert.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}

}