package com.facebook.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;
import com.facebook.utils.CommonMethods;
import com.facebook.utils.ExcelUtility;



public class Login extends CommonMethods {

	@Test(groups = "smoke",dataProvider="userInfo")
	public void validLogin(String username, String password) {

		LoginPage page = new LoginPage();
		
		sendText(page.username, username);
		sendText(page.password,password);
		
		click(page.login);

	
	}
	@DataProvider
	public Object[][] userInfo(){
		
		Object[][] data = {{"johnDoe@gmail.com", "123456"}};
		
		return data;
 		
	}
	
	/**
	 * If you want to pull data from excel file 
	 */
	
	public Object[][] excelData(){
		
	 String filePath = System.getProperty("user.dir")+"/src/test/resources/testdata/Excel.xlsx";
	 String sheet = "Data";	
	
	 Object[][] data = ExcelUtility.excelIntoArray(filePath, sheet);
	 
	 return data;
	}

}
