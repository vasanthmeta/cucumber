package com.def;


import com.base.BaseClass;
import com.pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
		PojoClass pc;
	
	@Given("User Launch Adactin Web Application")
	public void user_Launch_Adactin_Web_Application() {
		launchBrowser();
		maxiWindow();
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/");

	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		pc=new PojoClass();
		type(pc.getTxtUser(), username);
		type(pc.getTxtPass(), password);
	}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {
		pc=new PojoClass();
		btnClick(pc.getBtnLogin());
	}

	@Then("User verify Search Hotel page is displayed")
	public void user_verify_Search_Hotel_page_is_displayed() {
		boolean verSearchhotel = getPageUrl().contains("SearchHotel");
		System.out.println("Search Hotel Page is Displayed:");
	    System.out.println(verSearchhotel);
	}

	@When("User Selects valid {string},{string} and {string}")
	public void user_Selects_valid(String location, String hotel, String roomType) {
		selectbyVisibletext(pc.getLocationHotel(), location);
		selectbyVisibletext(pc.getHotelName(), hotel);
		selectbyVisibletext(pc.getRoomType(), roomType);
		
	}

	@When("User clicks search button")
	public void user_clicks_search_button() {
	   btnClick(pc.getSearchBtn());
	}

	@Then("User verify Select Hotel page is displayed")
	public void user_verify_Select_Hotel_page_is_displayed() {
	   boolean verSelecthotel = getPageUrl().contains("SelectHotel");
	   System.out.println("Select Hotel Page is Displayed");
	   System.out.println(verSelecthotel);
	}

	@When("User clicks radio button and clicks continue button")
	public void user_clicks_radio_button_and_clicks_continue_button() {
		pc=new PojoClass();
		btnClick(pc.getRadioBtn());
		btnClick(pc.getContinueBtn());
	}
	
	@Then("User verify Book a Hotel page is displayed")
	public void user_verify_Book_a_Hotel_page_is_displayed() {
	    boolean verBookHotel = getPageUrl().contains("BookHotel");
	    System.out.println("Verify Book Hotel Page is Displayed");
	    System.out.println(verBookHotel);
	}

	@When("User enters valid {string},{string} and {string}")
	public void user_enters_valid_and(String firstName, String lastName, String billingAddress) {
		type(pc.getFirstName(), firstName);
		type(pc.getLastName(), lastName);
		type(pc.getAddress(), billingAddress);
	}

	@When("User enters valid {string},{string},{string},{string} and {string}")
	public void user_enters_valid_and(String cardNumber, String cardType, String expMonth, String expYear, String cvv) {
		type(pc.getCcNum(), cardNumber);
		selectbyVisibletext(pc.getCcType(), cardType);
	    selectbyVisibletext(pc.getExpMonth(), expMonth);
	    selectbyVisibletext(pc.getExpYear(), expYear);
	    type(pc.getCcCvv(), cvv);
	}

	@When("USer clicks Book now button")
	public void user_clicks_Book_now_button() {
		btnClick(pc.getBooknowBtn());
	}

	
	@Then("User verify Adactin Login Page is Displayed")
	public void user_verify_Adactin_Login_Page_is_Displayed() {
		boolean pcDisp = getPageUrl().contains("adactin");
		System.out.println("Login Page Displayed:");
	    System.out.println(pcDisp);
	}

	@When("User enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		pc=new PojoClass();
	    type(pc.getTxtUser(), "vasanth");
	    type(pc.getTxtPass(), "32435435643");
	}

	@Then("User verify Error message is Displayed")
	public void user_verify_Error_message_is_Displayed() {
		pc=new PojoClass();
		String err = getText(pc.getErrorMsg());
		System.out.println(err);
		
	} 

	
	
}