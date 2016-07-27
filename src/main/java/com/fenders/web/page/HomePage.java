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

public class HomePage extends BasePage {
	 
	 @FindBy (xpath = ".//*[@id='home-slot-2-container']/article/div[2]/div[1]/a/div[2]/p[3]")
	 WebElement ShopNow_Button;
	 

	 public HomePage(WebDriver driver) {
		    super(driver);
	        isLoaded();        
	    }
	 
	 
     public void isLoaded(){
		    waitForPageToLoad(Page.HomePage);
     }

	 	 
	 
	 public GearSelectionPage clickShopNowButton(){	
		 	waitForVisibility(ShopNow_Button);
		    ShopNow_Button.click();		    		    
		    waitForPageToLoad(Page.GearSelectionPage);
	  	    return new GearSelectionPage(getDriver());
	 }
	 	 
	 
}
