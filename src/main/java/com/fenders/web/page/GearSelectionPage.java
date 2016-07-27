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

public class GearSelectionPage extends BasePage {
	 
	 @FindBy (xpath = ".//*[@id='bcKE6iaag1kWIaaadeBJo4i9o7']/div[1]/a[1]/img")
	 WebElement FirstGuitar_Button;
	 

	 public GearSelectionPage(WebDriver driver) {
		    super(driver);
	        isLoaded();        
	    }
	 
	 
     public void isLoaded(){
		    waitForPageToLoad(Page.GearSelectionPage);
     }

	 	 
	 
	 public GuitarDetailPage clickFirstGuitar(){	
		 	waitForVisibility(FirstGuitar_Button);
		    FirstGuitar_Button.click();		    		    
		    waitForPageToLoad(Page.GuitarDetailPage);
	  	    return new GuitarDetailPage(getDriver());
	 }
}
