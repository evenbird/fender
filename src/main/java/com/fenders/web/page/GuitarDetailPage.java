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
hmaheshwari
Oct 21, 2015
3:53:17 PM

 */

public class GuitarDetailPage extends BasePage {
	 
	 @FindBy (xpath = ".//*[@id='bcKE6iaag1kWIaaadeBJo4i9o7']/div[1]/a[1]/img")
	 WebElement FirstGuitar_Button;
	 
	 @FindBy (id = "add-to-cart")
	 WebElement AddToCart_Button;
	 
	 @FindBy (xpath = ".//*[@id='mini-cart']/div[1]/a[2]/span[1]")
	 WebElement ViewCart_Button;
	 
	 

	 public GuitarDetailPage(WebDriver driver) {
		    super(driver);
	        isLoaded();        
	    }
	 
	 
     public void isLoaded(){
		    waitForPageToLoad(Page.GuitarDetailPage);
     }

	 	 
	 
	 public void clickAddToCart(){	
		 	waitForVisibility(AddToCart_Button);
		    AddToCart_Button.click();		    		    
//		    waitForPageToLoad(Page.GuitarDetailPage);
	 }
	 
	 public CartPage clickViewCart(){	
		 	waitForVisibility(ViewCart_Button);
		 	ViewCart_Button.click();		    		    
		    waitForPageToLoad(Page.CartPage);
	  	    return new CartPage(getDriver());
	 }
}
