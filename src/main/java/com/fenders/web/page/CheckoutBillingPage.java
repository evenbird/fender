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
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 *
daniel zeng
July 26, 2016
 */

public class CheckoutBillingPage extends BasePage {
	 
//	 @FindBy (xpath = ".//*[@id='primary']/div[2]/div[3]/div/div/form/fieldset/div/button")
//	 WebElement CheckoutAsGuest_Button;
//	 

	 public CheckoutBillingPage(WebDriver driver) {
		    super(driver);
	        isLoaded();        
	    }
	 
	 
     public void isLoaded(){
		    waitForPageToLoad(Page.CheckoutBillingPage);
     } 
	 
//	 public CheckoutShippingPage clickCheckoutAsGuest(){	
//		 	waitForVisibility(CheckoutAsGuest_Button);
//		 	CheckoutAsGuest_Button.click();		    		    
//		    waitForPageToLoad(Page.CheckoutShippingPage);
//	  	    return new CheckoutShippingPage(getDriver());
//	 }
}
