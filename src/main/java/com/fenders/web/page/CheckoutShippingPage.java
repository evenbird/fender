package com.fenders.web.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 *
daniel zeng
July 26, 2016
 */

public class CheckoutShippingPage extends BasePage {

	@FindBy (id = "dwfrm_singleshipping_shippingAddress_addressFields_firstName")
	WebElement FirstName_TextBox;

	@FindBy (id = "dwfrm_singleshipping_shippingAddress_addressFields_lastName")
	WebElement LastName_TextBox;

	@FindBy (id = "dwfrm_singleshipping_shippingAddress_addressFields_address1")
	WebElement Address1_TextBox;

	@FindBy (id = "dwfrm_singleshipping_shippingAddress_addressFields_address2")
	WebElement Address2_TextBox;

	@FindBy (id = "dwfrm_singleshipping_shippingAddress_addressFields_city")
	WebElement City_TextBox;

	@FindBy (id = "dwfrm_singleshipping_shippingAddress_addressFields_states_state")
	WebElement State_DropDown;

	@FindBy (id = "dwfrm_singleshipping_shippingAddress_addressFields_zip")
	WebElement ZipCode_TextBox;

	@FindBy (id = "dwfrm_singleshipping_shippingAddress_addressFields_phone")
	WebElement Phone_TextBox;

	@FindBy (xpath = ".//*[@id='main']/section[2]/div/div[2]/div[2]/div[2]/div[2]/label")
	WebElement Continue_Button;


	public CheckoutShippingPage(WebDriver driver) {
		super(driver);
		isLoaded();        
	}


	public void isLoaded(){
		waitForPageToLoad(Page.CheckoutShippingPage);
	} 

	public void fillShippingInfo(String fName, String lName, String address1, String address2, String city, String state, String zipCode, String phone){	
		waitForVisibility(FirstName_TextBox);
		FirstName_TextBox.sendKeys(fName);
		LastName_TextBox.sendKeys(lName);
		Address1_TextBox.sendKeys(address1);
		Address2_TextBox.sendKeys(address2);
		City_TextBox.sendKeys(city);
		selectState(state);
		ZipCode_TextBox.sendKeys(zipCode);
		Phone_TextBox.sendKeys(phone);

	}

	public void selectState(String State){
		waitForVisibility(State_DropDown);
		Select sel = new Select(State_DropDown);
		sel.selectByVisibleText(State);	 
	}
	
	public CheckoutBillingPage clickContinue(){
		waitForVisibility(Continue_Button);
		Continue_Button.click();
	    waitForPageToLoad(Page.CheckoutBillingPage);
	    return new CheckoutBillingPage(getDriver());
	}
}
