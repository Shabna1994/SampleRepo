package com.obsqura.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class ListProducts extends Base {
	public ListProducts(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}

	//add productbutton
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")
	WebElement addnewProductButton; 
	//search productbutton
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchProductButton; 

	//search productpage
	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement title;
	@FindBy(id="cat_id")
	WebElement entercategoty; 
	//@FindBy(xpath = "//select[@id='sb']")
	//WebElement enterSubCategory; 
	@FindBy(xpath="//button[@name='Search']")
	WebElement searchButtonClick; 
	@FindBy(xpath ="//button[text()='P712']")
	WebElement srollDown;

	@FindBy(xpath ="//h4[text()='List Products']")
	WebElement searchValidation;


	//deleteproductButton
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]")
	WebElement deleteproductButton; 

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement deleteValidation;

	public void addProduct()
	{
		PageUtilities.clickButton(addnewProductButton);

	}
	public void searchProduct(String title1)
	{

		PageUtilities.clickButton(searchProductButton);
		WaitUtil.visibilityOfEleLocated(driver,title);
		PageUtilities.sendInput(title, title1);
		WaitUtil.visibilityOfEleLocated(driver,entercategoty);
		
		PageUtilities.clickButton(searchButtonClick);
		PageUtilities.scrollByWebelement(driver,searchValidation);


	}

	public String searchValidation()
	{
		String actualData=searchValidation.getText();
		return actualData ;
	}
	public void deleteProduct()
	{
		PageUtilities.clickButton(deleteproductButton);
		driver.switchTo().alert().accept();
		WaitUtil.visibilityOfEleLocated(driver,deleteValidation);
	}
	public String deleteValidation()
	{
		String actualData=deleteValidation.getText();
		String trimMessage=actualData.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;

	}

}



