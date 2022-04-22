package com.obsqura.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class DAdminUsers extends Base{

	public DAdminUsers(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	//add new user
	@FindBy(xpath="//div//child::a[@class='btn btn-rounded btn-danger']")
	WebElement addNew;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="user_type")
	WebElement userTypeDropdown;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement submit;

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement addAdminValidation;

	//search with newly added username
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[2]")
	WebElement search;
	@FindBy(id="un")
	WebElement usernameSearch;
	@FindBy(id="ut")
	WebElement userTypeSearch;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement clickSearchButton;
	@FindBy(xpath ="//a[@href='http://groceryapp.uniqassosiates.com/admin/user/index?un=Shabna&ut=staff&Search=sr&page_ad=1']")
	WebElement scrolltoSearch;

	@FindBy(xpath = "//td[text()='shabna']")
	WebElement searchButton;


	//delete Admin and validate popupS
	@FindBy(xpath = "(//i[@class='fas fa-trash-alt'])[1]")
	WebElement deleteClick;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement deleteAlertValidation;



	public void adminUsers(String username1,String password1)
	{
		WaitUtil.visibilityOfEleLocated(driver,addNew);
		WaitUtil.waitForEleToBeClickable(driver,addNew);
		PageUtilities.clickButton(addNew);
		PageUtilities.sendInput(username, username1);
		WaitUtil.visibilityOfEleLocated(driver,password);
		PageUtilities.sendInput(password,password1);	
		PageUtilities.dropDown(userTypeDropdown,"Admin");
		WaitUtil.waitForEleToBeClickable(driver, submit);
		PageUtilities.clickButton(submit);

	}

	public String addAdminAlertMsg()
	{
		WaitUtil.visibilityOfEleLocated(driver,addAdminValidation);
		String actualMsg = addAdminValidation.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}



	public void deleteAdmin()
	{
		WaitUtil.visibilityOfEleLocated(driver,deleteClick);
		WaitUtil.waitForEleToBeClickable(driver, deleteClick);
		PageUtilities.clickButton(deleteClick);
		driver.switchTo().alert().accept();

	}
	public String deleteAdminAlert()
	{
		WaitUtil.visibilityOfEleLocated(driver,deleteAlertValidation);
		String actualMsg = deleteAlertValidation.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;
	}
	public void searchAdmin(String usernameSearch1)
	{
		WaitUtil.visibilityOfEleLocated(driver,search);
		WaitUtil.waitForEleToBeClickable(driver,search);
		PageUtilities.clickButton(search);
		PageUtilities.sendInput(usernameSearch,usernameSearch1);
		PageUtilities.dropDown(userTypeSearch,"Staff" );
		WaitUtil.visibilityOfEleLocated(driver,clickSearchButton);
		WaitUtil.waitForEleToBeClickable(driver,clickSearchButton);
		PageUtilities.clickButton(clickSearchButton);
		
	}

	public String searchAdminAlert()
	{
		WaitUtil.visibilityOfEleLocated(driver,searchButton);
		String actualMsg = searchButton.getText();
		return actualMsg;
	}
}
