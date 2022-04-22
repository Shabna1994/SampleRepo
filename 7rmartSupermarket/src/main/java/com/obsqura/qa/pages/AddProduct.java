package com.obsqura.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.obsqura.main.base.Base;
import com.qa.utilities.PageUtilities;
import com.qa.utilities.WaitUtil;

public class AddProduct extends Base {  //page related to manage product
	public AddProduct(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}


	@FindBy(id="title")
	WebElement enterTitle; 
	@FindBy(xpath="//input[@value='Nonveg']")
	WebElement productType; 
	@FindBy(id="tag")
	WebElement tag;
	@FindBy(id="cat_id")
	WebElement categoryDrp;
	@FindBy(id="sub_id")
	WebElement subCategoryDrp;	
	@FindBy(id="grp_id")
	WebElement groupDrp;
	@FindBy(id="purpose3")
	WebElement priceType;
	@FindBy(id="s_minimum")
	WebElement serverMinimum;
	@FindBy(id="s_max")
	WebElement maximumQuantity;
	@FindBy(id="s_price")
	WebElement serverPrice;
	@FindBy(id="s_mrp")
	WebElement mrp;
	@FindBy(id="s_stock")
	WebElement stockAvailable;
	@FindBy(id="s_pp")
	WebElement purchasePrice;
	@FindBy(xpath="//input[@value='yes' and @name='stock']")
	WebElement stockRadioBtn;
	@FindBy(id="main_img")
	WebElement mainImg;
	@FindBy(xpath = "//input[@value='yes' and @name='featured']")
	WebElement featuredRadio;
	@FindBy(xpath = "//input[@value='yes' and @name='combo']")
	WebElement comboRadio;
	@FindBy(xpath ="//button[@name='create']")
	WebElement saveButtonClick;


	@FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible']")
	WebElement addAlert;

	public void addProduct(String enterTitle1,String tag1,String maximumQuantity1,String serverPrice1,String mrp1,String stockAvailable1,String purchasePrice1,String mainImg1) 
	{

		WaitUtil.visibilityOfEleLocated(driver, enterTitle);
		PageUtilities.sendInput(enterTitle, enterTitle1);
		PageUtilities.clickButton(productType);
		PageUtilities.sendInput(tag,tag1);
		WaitUtil.visibilityOfEleLocated(driver,categoryDrp);
		PageUtilities.dropDown(categoryDrp, "Grocery & Staples");
		WaitUtil.visibilityOfEleLocated(driver, subCategoryDrp);
		//PageUtilities.dropDown(subCategoryDrp,"Masala & Spcies");       //not working
		PageUtilities.dropDown(groupDrp,"Idukki Spices");
		PageUtilities.clickButton(priceType);  
		PageUtilities.dropDown(serverMinimum,"4 Serves");
		PageUtilities.sendInput(maximumQuantity,maximumQuantity1);
		WaitUtil.visibilityOfEleLocated(driver,serverPrice);
		PageUtilities.sendInput(serverPrice,serverPrice1);
		PageUtilities.sendInput(mrp,mrp1);
		PageUtilities.scrollByWebelement(driver, stockRadioBtn);
		WaitUtil.visibilityOfEleLocated(driver,stockAvailable);
		WaitUtil.waitForEleToBeClickable(driver, stockAvailable);
		PageUtilities.sendInput(stockAvailable,stockAvailable1);
		WaitUtil.visibilityOfEleLocated(driver,purchasePrice);
		PageUtilities.sendInput(purchasePrice,purchasePrice1);
		PageUtilities.scrollByWebelement(driver, saveButtonClick);
		PageUtilities.clickButton(stockRadioBtn);
		PageUtilities.scrollByWebelement(driver,mainImg);
		WaitUtil.visibilityOfEleLocated(driver, mainImg);
		PageUtilities.sendInput(mainImg, mainImg1);
		PageUtilities.clickButton(featuredRadio);
		PageUtilities.clickButton(comboRadio);
		PageUtilities.scrollByWebelement(driver, saveButtonClick);
		PageUtilities.clickButton(saveButtonClick);
		WaitUtil.visibilityOfEleLocated(driver, addAlert);
	}
	public String alertMsg()
	{
		WaitUtil.visibilityOfEleLocated(driver, addAlert);
		String actualMsg = addAlert.getText();
		String trimMessage=actualMsg.trim();
		String arr[]=trimMessage.split(" ", 2);
		String result=arr[1];
		return result;



	}



}
