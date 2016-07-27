package com.fenders.web.page;

public enum Page {
	
	/***** Common Pages *****/
	HomePage("Fender: The Spirit of Rock 'n' Roll since 1946"),
	GearSelectionPage("Back To School | Fender Gear"),
	GuitarDetailPage("Starcaster®, Maple Fingerboard, Black | Fender Electric Guitars"),
	CartPage("Cart | My Fender"),
	CheckoutPage("Checkout | Fender"),
	CheckoutShippingPage("Checkout Shipping | Fender"),
	CheckoutBillingPage("Billing Checkout | Fender");
	
    private String title;
 
    private Page(String title) {
        this.title = title;
    }
  
    public String getTitle() {
        return title;
    }
 
    /*@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }*/
 
}