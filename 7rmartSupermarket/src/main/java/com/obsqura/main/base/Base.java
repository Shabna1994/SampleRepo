
package com.obsqura.main.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.obsqura.qa.pages.DashBoard;


public class Base {
	public static WebDriver driver;
	public static Properties prop;




	@BeforeSuite

	public void initialization()

	{

		prop = new Properties();
		//File file = new File("C:\\Users\\SHABNA\\eclipse-workspace\\7rmartSupermarket\\src\\main\\java\\com\\qa\\config\\config.properties");
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");//config related data

		try {
			FileInputStream inputStream = new FileInputStream(file);

			prop.load(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
		} catch (FileNotFoundException fie) {
			fie.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}




		//sequential execution from config file

		if(prop.getProperty("browser").equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver=new ChromeDriver();

		}else if(prop.getProperty("browser").equalsIgnoreCase("Edge"))
		{	
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();
		}    




		/*	//browser value from xml file	
		 * if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver=new ChromeDriver();

	      }else if(browser.equalsIgnoreCase("Edge"))
		{	
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();
		}   

		 */

		driver.get(prop.getProperty("url"));   
		//driver.get(prop.getProperty("userName1"));   
		//driver.get(prop.getProperty("password"));  
		driver.manage().window().maximize();
	}



	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}

}
