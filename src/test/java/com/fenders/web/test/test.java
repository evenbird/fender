package com.fenders.web.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.fenders.web.page.CartPage;
import com.fenders.web.page.CheckoutBillingPage;
import com.fenders.web.page.CheckoutPage;
import com.fenders.web.page.CheckoutShippingPage;
import com.fenders.web.page.GearSelectionPage;
import com.fenders.web.page.GuitarDetailPage;
import com.fenders.web.page.HomePage;

/**
*
daniel zeng
July 26, 2016
*/

public class test {
			
	protected WebDriver driver = new FirefoxDriver();
	
	@Test
	public void test1(){
		
		driver.get("http://shop.fender.com/en-US/");
		
		HomePage homPage = new HomePage(driver);
		GearSelectionPage selectGuitar = homPage.clickShopNowButton();
		GuitarDetailPage pickGuitar = selectGuitar.clickFirstGuitar();
		pickGuitar.clickAddToCart();
		CartPage cartPage = pickGuitar.clickViewCart();
		cartPage.selectQuantity("1");
		CheckoutPage checkoutPage = cartPage.clickSecureCheckout();
		CheckoutShippingPage checkoutAndShipping = checkoutPage.clickCheckoutAsGuest();
		checkoutAndShipping.fillShippingInfo("test", "test", "test", "test", "Glendale", "California", "91111", "6262111234");
		CheckoutBillingPage checkoutBillingPage = checkoutAndShipping.clickContinue();
		
	}
	
	@AfterTest
	public void closebroser(){
		driver.close();
	}

}
