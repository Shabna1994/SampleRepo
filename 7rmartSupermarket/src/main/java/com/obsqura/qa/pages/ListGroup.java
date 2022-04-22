package com.obsqura.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class ListGroup extends Base {

	public ListGroup(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//i[@class='fas fa-edit'])[1]")
	WebElement edit;
	@FindBy(id="titlep")
	WebElement GroupName;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;

	public void editGroupButton()
	{   
		WaitUtil.visibilityOfEleLocated(driver,edit);
		WaitUtil.waitForEleToBeClickable(driver, edit);
		edit.click();
	}
	public void addGroup()
	{   

		PageUtilities.sendInput(GroupName, "GroupName, grpname");
		PageUtilities.clickButton(saveButton);
	}

}
