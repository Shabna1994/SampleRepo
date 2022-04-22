package com.qa.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.obsqura.main.base.Base;

public class PageUtilities extends Base {

	public static void sendInput(WebElement ele,String input)
	{
		WaitUtil.visibilityOfEleLocated(driver, ele);
		ele.clear();
		WaitUtil.visibilityOfEleLocated(driver, ele);
		ele.sendKeys(input);

	}
	public static void clickButton(WebElement ele)
	{
		WaitUtil.visibilityOfEleLocated(driver, ele);
		WaitUtil.waitForEleToBeClickable(driver, ele);
		ele.click();
	}

	public static void dropDown(WebElement ele,String text)
	{
		WaitUtil.visibilityOfEleLocated(driver, ele);
		Select statusDrp = new Select(ele);  
		statusDrp.selectByVisibleText(text);

	}
	public static void scrollByWebelement(WebDriver driver,WebElement ele) 
	{
		WaitUtil.visibilityOfEleLocated(driver, ele);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
	}
	public static void clearInput(WebElement ele)
	{
		WaitUtil.visibilityOfEleLocated(driver, ele);
		ele.clear();
	}
}
