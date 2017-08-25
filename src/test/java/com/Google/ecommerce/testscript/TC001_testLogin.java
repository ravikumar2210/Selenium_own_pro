package com.Google.ecommerce.testscript;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Google.ecommerce.Pagelibrary.SignIn;
import com.Google.ecommerce.testBase.TestBase;


public class TC001_testLogin extends TestBase{
	
	// making reference of SignIn class
	SignIn signIn;
	
	

	@BeforeClass
	public void setUP() throws IOException{
		init();
		
	}
	
	@Test
	public void testlogin() throws InterruptedException{
		
		// Making object of class and suppling driver as under argument section because "Signin" class has a consructor and this constructor will initialise driver over TC0001.
		
			signIn = new SignIn(driver);
			
			
			signIn.ClickonSignin();
			signIn.EnterAlreadyRegEmailAdd("rsk@gmail.com");
			signIn.EnterAlreadyRegPass("password123");
			signIn.clickSignInButton();
			Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void quitBrowser(){
		quitBrowser();
	}

}
