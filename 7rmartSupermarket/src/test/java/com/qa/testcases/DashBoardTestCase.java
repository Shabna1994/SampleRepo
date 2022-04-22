package com.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.obsqura.main.base.Base;
import com.obsqura.qa.pages.DAddPages;
import com.obsqura.qa.pages.DAdminUsers;
import com.obsqura.qa.pages.DListPage;
import com.obsqura.qa.pages.DashBoard;
import com.obsqura.qa.pages.EditPages;
import com.obsqura.qa.pages.LoginPage;
import com.qa.utilities.CommonMethods;
import com.qa.utilities.RandomNumberUtil;


public class DashBoardTestCase extends Base{

	LoginPage loginPage;
	DashBoard dashboard;
	DListPage dListPage;
	DAddPages addPage;
	DAdminUsers addadmin;
	EditPages  editPages;


	@BeforeMethod

	public void login() throws IOException
	{

		CommonMethods.login();
		dashboard=new DashBoard(driver);	
		
	}


	@Test    //verify add button and it can able to  add new page to database
	public void dashBoard03()   
	{
		dashboard.dmanagePage();
		dListPage = new DListPage(driver);
		dListPage.listpage();

		addPage=new DAddPages(driver);     
		addPage.addPage("Testing Page"+RandomNumberUtil.randomNum(),"Automation Testing","First Page"+RandomNumberUtil.randomNum());

		String actualMsg= addPage.addAlertMsg();
		System.out.println(actualMsg);
		Assert.assertNotEquals(actualMsg,"Created Successfully ");

	}



	@Test    //verify Search button when we try to search with page title
	public void dashBoard04()
	{


		dashboard.dmanagePage();
		dListPage = new DListPage(driver);
		dListPage.searchpage("Testing Page41");
		String actualTitle = dListPage.searchListPageValidation();
		String expectedTitle = "Testing Page41";
		Assert.assertEquals(actualTitle, expectedTitle);


	}

	@Test    //verify edit option when user try to edit the data on ListPages
	public void dashBoard05()                   
	{

		dashboard.dmanagePage();

		dListPage = new DListPage(driver);
		dListPage.clickEdit();

		editPages = new EditPages(driver);
		editPages.editPage("page Description","PageName1");

		String actualMsg= editPages.alertMsg();
		System.out.println(actualMsg);
		Assert.assertNotEquals(actualMsg,"Page Updated Successfully");	
	}


	@Test    //verify delete button to reset the data in ListPages
	public void dashBoard06()                                
	{


		dashboard.dmanagePage();

		dListPage = new DListPage(driver);
		dListPage.deleteUser();


		String actualMessage = dListPage.deleteAlertMsg();
		String expectedMsg ="Deleted Successfully" ;
		Assert.assertEquals(actualMessage, expectedMsg);
	}


	@Test   //verify to add button  in AdminUsers
	public void adminUsersTc07()
	{                                           

		dashboard.adminUsers();
		addadmin=new  DAdminUsers(driver);
		addadmin.adminUsers("Shabna"+RandomNumberUtil.randomNum(),"sha123");

		String actualMsg= addadmin.addAdminAlertMsg();
		System.out.println(actualMsg);
		String expectedMsg ="Created Successfully" ;
		Assert.assertEquals(actualMsg, expectedMsg);

	}

	@Test   //verify the currect popup message is shown when we try to delete a user in database
	public void adminUsersTc08()
	{

		dashboard.adminUsers();


		addadmin=new  DAdminUsers(driver);
		addadmin.deleteAdmin();
		String actualMsg= addadmin.deleteAdminAlert();
		System.out.println(actualMsg);
		String expectedMsg ="Deleted Successfully" ;
		Assert.assertEquals(actualMsg, expectedMsg);
	}



	@Test   //verify the search buttons are working or not  when search with username
	public void adminUsersTc09()
	{

		dashboard.adminUsers();
		addadmin=new  DAdminUsers(driver);
		addadmin.searchAdmin("shabna");
		String actualMsg= addadmin.searchAdminAlert();
		String expectedMsg ="shabna" ;
		Assert.assertEquals(actualMsg, expectedMsg);

	}
	@AfterMethod
	public void logout()
	{

		dashboard.logOut();	
	}

}
