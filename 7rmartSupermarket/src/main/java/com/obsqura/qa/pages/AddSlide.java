package com.obsqura.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class AddSlide extends Base{

	public AddSlide(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	@FindBy(id="link")
	WebElement link;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveClick;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;


	public void addData(String link1)
	{
		WaitUtil.visibilityOfEleLocated(driver,link);
		PageUtilities.sendInput(link, link1);
		PageUtilities.clickButton(saveClick);

	}

	public String alertMsg()
	{
		WaitUtil.visibilityOfEleLocated(driver,alert);
		String actualMsg =alert.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;

	}

}
