package com.Google.ecommerce.Pagelibrary;

import java.util.List;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccount {
	
	WebDriver driver;
	static Logger log = Logger.getLogger(CreateAnAccount.class.getName());

	WebElement mrRadionButton =  driver.findElement(By.xpath("//*[@id='id_gender1']")) ;
	WebElement mrsRadioButton =  driver.findElement(By.xpath("//*[@id='id_gender2']")) ;
	WebElement craeteAnAccoutn =  driver.findElement(By.xpath("//*[@id='noSlide']/h1"));
	WebElement yourPersonalInfo =  driver.findElement(By.xpath("//*[@id='account-creation_form']/div[1]/h3"));
	WebElement firstName =  driver.findElement(By.xpath("//*[@id='customer_firstname']"));
	WebElement lastname =  driver.findElement(By.xpath("//*[@id='customer_lastname']"));
	WebElement emailAddress =  driver.findElement(By.xpath("//*[@id='email']"));
	WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
	WebElement days =  driver.findElement(By.xpath("//*[@id='days']"));
	WebElement months =  driver.findElement(By.xpath("//*[@id='months']"));
	WebElement year = driver.findElement(By.xpath("//*[@id='years']"));
	WebElement signUpForOurNewsletter =  driver.findElement(By.xpath("//*[@id='newsletter']"));
	WebElement receiveSpecialOffer =  driver.findElement(By.xpath("//*[@id='optin']"));
	WebElement yourAddress =  driver.findElement(By.xpath("//*[@id='account-creation_form']/div[2]/h3"));
	
	WebElement yourAddressFirstName =  driver.findElement(By.id("firstname"));
	WebElement yourAddressLasstName =  driver.findElement(By.id("lastname"));
	WebElement yourAddressCompany =  driver.findElement(By.id("firstname"));
	WebElement yourAddressPrimary =  driver.findElement(By.id("address1"));
	WebElement yourAddressSecondry =  driver.findElement(By.id("address2"));
	WebElement yourAddressCity =  driver.findElement(By.id("city"));
	WebElement yourAddressPostalCode =  driver.findElement(By.id("postcode"));
	WebElement yourAddressStateDropDown = driver.findElement(By.xpath("//*[@id='id_state']"));
	WebElement yourAddressCountryName = driver.findElement(By.xpath("//*[@id='id_country']"));
	WebElement yourAddressPhoneNumber = driver.findElement(By.xpath("//*[@id='phone_mobile']"));
	WebElement yourAddressAlias = driver.findElement(By.xpath("//*[@id='alias']"));
	
	/**
	 * This method will select Mr radio button in create an account page
	 */
	public void selectMrRadioButton(){
		log.info("selecting Mr radio button");
		mrRadionButton.click();
		
	}
	
	public void selectMrsRadioButton(){
		log.info("selecting Mrs radio button");
		mrsRadioButton.click();
		
	}
	
	public boolean createAnAccountMethodlabel(){
		
		log.info("Create an account label is being displayed or not");
		
		try{
		craeteAnAccoutn.isDisplayed();
		return true;
	}
	
		catch (Exception e)	{		
		return false;
	
	}
	
}
	public boolean yourPersonalInfolabel(){
		
		log.info("yourPersonalInfo label is being displayed or not");
		
		try{
		yourPersonalInfo.isDisplayed();
		return true;
	}
	
		catch (Exception e)	{		
		return false;
	
	}
	
}
	
	public void EnterfirstName(String firstName){
		log.info("Entering First name");
		this.firstName.sendKeys("firstName");
		
	}
	
	public void EnterLastName(String firstName){
		log.info("Entering Last name");
		this.lastname.sendKeys("lastname");
		
	}
	
	public void EnterEmailAddress(String firstName){
		log.info("Entering emailAddress");
		this.emailAddress.sendKeys("emailAddress");
		
	}
	
	public void SelectingDayInDropDown(String day){
		log.info("Clicking on day drop dowm");
		
		days.click();
		String day1 = ".//*[@id='days']/option[";
		String day2 = "]";
		log.info("Selecting date in generic manner from ropdown");
		driver.findElement(By.xpath(day1+day+day2)).click();
		}
	
	public void SelectMonthData(String month){
		months.click();
		
		List<WebElement> monthData= driver.findElements(By.xpath(".//*[@id='months']/option"));
		
		for(WebElement mon : monthData){
			if(mon.getText().contains(month)){
				log.info("Clicking on month drop down");
				mon.click();
		}
		}

	}
	}
	