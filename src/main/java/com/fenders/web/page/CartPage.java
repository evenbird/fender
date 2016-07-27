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

public class CartPage extends BasePage {

	@FindBy (id = "dw_frmquantity")
	WebElement Quantity_DropDown;

	@FindBy (xpath = "//div[2]/div/form/fieldset/button")
	WebElement SecureCheckout_Button;

	//	 @FindBy (id = "checkout-form")
	//	 WebElement SecureCheckout_Button;


	public CartPage(WebDriver driver) {
		super(driver);
		isLoaded();        
	}


	public void isLoaded(){
		waitForPageToLoad(Page.CartPage);
	}

	public void selectQuantity(String num){
		waitForVisibility(Quantity_DropDown);
		Select sel = new Select(Quantity_DropDown);
		sel.selectByVisibleText(num);	 
	}

	public CheckoutPage clickSecureCheckout(){	
		waitForVisibility(SecureCheckout_Button);
		SecureCheckout_Button.click();		    		    
		waitForPageToLoad(Page.CheckoutPage);
		return new CheckoutPage(getDriver());
	}
}
