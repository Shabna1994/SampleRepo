package com.obsqura.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.main.base.Base;
import com.qa.utilities.WaitUtil;

public class ListCategory extends Base{
	public ListCategory(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add'])[1]")
	WebElement clickNewButton;
	
	



		public void listCategory()
		{
			WaitUtil.visibilityOfEleLocated(driver,clickNewButton);
			WaitUtil.waitForEleToBeClickable(driver,clickNewButton);
			clickNewButton.click();
			
		}
}
