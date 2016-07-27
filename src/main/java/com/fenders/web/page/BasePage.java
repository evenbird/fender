package com.fenders.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	private WebDriver driver;
	private static final int timeout = 30;
	
    public BasePage() {}
    
    public BasePage(WebDriver driver) {
        this();
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    
    public final WebDriver getDriver() {
        return driver;
    }
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public void waitForPageToLoad(final Page page){
		
		try{
			//Wait for the correct page title
			 WebDriverWait wait = new WebDriverWait(driver, timeout); //here, wait time is 20 seconds
		     wait.until(new ExpectedCondition<Boolean>() {
			            public Boolean apply(WebDriver d) {			            	
			            		return getPageTitle().contains(page.getTitle());			            		                
			            }
			 });
    	}catch (Exception e){
    		logAndFailTheTestCase("Timed out Waiting for "+page.name());
    		
		}
	}
	
	public void waitForVisibility(WebElement element) throws Error{
		new WebDriverWait(getDriver(), timeout)
		.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void logAndFailTheTestCase(String msg){
		 Reporter.log(msg);
		 Assert.fail(msg);
		 System.out.println(msg);
	}

}
