package com.Google.ecommerce.Pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;


public class SignIn {
	
	WebDriver driver;
	
	//Above driver will be initialised by constructor present below.
	
	static Logger log = Logger.getLogger(SignIn.class.getName());
	
	
	By Signin = By.xpath(".///*[@id='header']/div[2]/div/div/nav/div[1]/a");
	By CreateAnAccountAdd = By.xpath(".//*[@id='email_create']");
	By CreateAnAccountSubmitButton = By.xpath(".//*[@id='SubmitCreate']");
	By AlreadyRegEmailAdd = By.xpath(".//*[@id='email']");
	By AlreadyRegPass = By.xpath(".//*[@id='passwd']");
	By SignInButton = By.xpath(".//*[@id='SubmitLogin']");
	
	
	public SignIn(WebDriver driver){
		this.driver=driver;
	}
	
	/**
	*This method will click on signin button on sign in page
	*/
	
	public void ClickonSignin(){
		log.info("Cicling on Signin Button");
		driver.findElement(Signin).click();		
		
	}

	/**
	*This method will enter email id on sign in page
	*/
	public void EnterEmailToCreateAnAccount(String emailaddress){
		log.info("Entering email address");
		driver.findElement(CreateAnAccountAdd).sendKeys(emailaddress);
	}
	
	
	public void ClickOnCreateAnAccountSubmitButton(){
		log.info ("Clicking on Submmit button");
		driver.findElement(CreateAnAccountSubmitButton).click();
	}
	
	public void EnterAlreadyRegEmailAdd(String emailaddress){
		log.info("Enter reg email add");
		driver.findElement(AlreadyRegEmailAdd).sendKeys(emailaddress);
			}


	public void EnterAlreadyRegPass(String password){
		log.info("Enter password");
		driver.findElement(AlreadyRegPass).sendKeys(password);
		
	}
	
	public void clickSignInButton(){
		log.info("Click on Signin button");
		driver.findElement(SignInButton).click();
	}
	
	
}