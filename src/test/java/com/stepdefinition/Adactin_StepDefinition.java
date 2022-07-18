package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automationbaseclass.PageObjectManager;
import com.baseclass.Base_Class;
import com.helperfile.FileReadManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_StepDefinition extends Base_Class {

	public static WebDriver driver = browserType("chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("User is Lanuch the Application")
	public void user_is_lanuch_the_application() throws IOException {
		urlValue(FileReadManager.getInstance_FRM().getInstance_CR().get_Url());
	}

	/*
	 * @When("User is enter the username in username field") public void
	 * user_is_enter_the_username_in_username_field() throws IOException {
	 * textInput(pom.getInstanceAlp().getUsername(),
	 * FileReadManager.getInstance_FRM().getInstance_CR().get_Uname());
	 * 
	 * }
	 * 
	 * @When("User is enter the password in password field") public void
	 * user_is_enter_the_password_in_password_field() throws IOException {
	 * textInput(pom.getInstanceAlp().getPassword(),
	 * FileReadManager.getInstance_FRM().getInstance_CR().get_Pass());
	 * 
	 * }
	 */

	@When("User is enter the {string} in username field")
	public void user_is_enter_the_in_username_field(String uname) throws IOException {
		textInput(pom.getInstanceAlp().getUsername(), FileReadManager.getInstance_FRM().getInstance_CR().get_Uname());
	}

	@When("User is give timeout")
	public void user_is_give_timeout() {
		timeOut(10);
	}

	@When("User is enter the {string} in password field")
	public void user_is_enter_the_in_password_field(String password) throws IOException {
		textInput(pom.getInstanceAlp().getPassword(), FileReadManager.getInstance_FRM().getInstance_CR().get_Pass());

	}

	@Then("User is enter the Submit Button")
	public void user_is_enter_the_submit_button() {
		buttonMethod(pom.getInstanceAlp().getLogin());

	}

	@When("User Get Fill Hotel Details in that application")
	public void user_get_fill_hotel_details_in_that_application() {
	}

	@When("User is Select Hotel Location in dropdown field")
	public void user_is_select_hotel_location_in_dropdown_field() {
		dropDown(pom.getInstanceSearch().getLocate(), "byIndex", "2");
	}

	@When("User is Select Hotel name in dropdown field")
	public void user_is_select_hotel_name_in_dropdown_field() {
		dropDown(pom.getInstanceSearch().getHotel(), "byIndex", "2");
	}

	@When("User is Select Hotel Room type in dropdown field")
	public void user_is_select_hotel_room_type_in_dropdown_field() {
		dropDown(pom.getInstanceSearch().getRoom(), "byIndex", "3");
	}

	@When("User is Select No of Rooms in dropdown field")
	public void user_is_select_no_of_rooms_in_dropdown_field() {
		dropDown(pom.getInstanceSearch().getRoomno(), "byIndex", "2");
	}

	@When("User is enter the check in date in checkin field")
	public void user_is_enter_the_check_in_date_in_checkin_field() {
		textInput(pom.getInstanceSearch().getCheckin(), "14/07/2022");
	}

	@When("User is enter the check out date in checkout field")
	public void user_is_enter_the_check_out_date_in_checkout_field() {
		textInput(pom.getInstanceSearch().getCheckout(), "16/07/2022");
	}

	@When("User is Select No of Adult in dropdown field")
	public void user_is_select_no_of_adult_in_dropdown_field() {
		dropDown(pom.getInstanceSearch().getAdult(), "byIndex", "3");
	}

	@When("User is Select No of Child in dropdown field")
	public void user_is_select_no_of_child_in_dropdown_field() {
		dropDown(pom.getInstanceSearch().getChild(), " byIndex", "2");
	}

	@Then("User is enter the Search Button")
	public void user_is_enter_the_search_button() {
		buttonMethod(pom.getInstanceSearch().getSubmit());
	}

	@When("User Confirmation the Select Hotel Details")
	public void user_confirmation_the_select_hotel_details() {
	}

	@When("User Confirm the Details are corrected or not")
	public void user_confirm_the_details_are_corrected_or_not() {
	}

	@When("User is Select Button in radio button field")
	public void user_is_select_button_in_radio_button_field() {
		buttonMethod(pom.getInstanceSelect().getRadio());
	}

	@Then("User is click the continue Button")
	public void user_is_click_the_continue_button() {
		buttonMethod(pom.getInstanceSelect().getContin());
	}

	@When("User Enter the Communication and Credit Card details")
	public void user_enter_the_communication_and_credit_card_details() {
	}

	@When("User is enter the firstname in text field")
	public void user_is_enter_the_firstname_in_text_field() {
		textInput(pom.getInstanceBooked().getFname(), "Prabu");
	}

	@When("User is enter the lastname in text field")
	public void user_is_enter_the_lastname_in_text_field() {
		textInput(pom.getInstanceBooked().getLname(), "Meganathan");
	}

	@When("User is enter the Billing address in text field")
	public void user_is_enter_the_billing_address_in_text_field() {
		textInput(pom.getInstanceBooked().getAddress(), "Porur,Chennai");
	}

	@When("User is enter the {int} digits Credit card in text field")
	public void user_is_enter_the_digits_credit_card_in_text_field(Integer int1) throws IOException {
		textInput(pom.getInstanceBooked().getCvv(), FileReadManager.getInstance_FRM().getInstance_CR().get_Ccnum());
	}

	@When("User Select the Credit card Type in dropdown field")
	public void user_select_the_credit_card_type_in_dropdown_field() {
		dropDown(pom.getInstanceBooked().getCctype(), "byIndex", "2");
	}

	@When("User Select the Credit card expiry month in dropdown field")
	public void user_select_the_credit_card_expiry_month_in_dropdown_field() {
		dropDown(pom.getInstanceBooked().getExpmon(), "byIndex", "5");
	}

	@When("User Select the Credit card expiry year in dropdown field")
	public void user_select_the_credit_card_expiry_year_in_dropdown_field() {
		dropDown(pom.getInstanceBooked().getCcexpyear(), "byIndex", "6");

	}

	@When("User is enter the Credit card cvv number in text field")
	public void user_is_enter_the_credit_card_cvv_number_in_text_field() throws IOException {
		textInput(pom.getInstanceBooked().getCccvv(), FileReadManager.getInstance_FRM().getInstance_CR().get_Cccvv());
	}

	@Then("User is Click Book Now Button")
	public void user_is_click_book_now_button() {
		buttonMethod(pom.getInstanceBooked().getBook());
	}

	@When("User Verify the Hotel Details ,Bill Amount and Billing address")
	public void user_verify_the_hotel_details_bill_amount_and_billing_address() {
	}

	@When("User is click My itinerary button")
	public void user_is_click_my_itinerary_button() {
		buttonMethod(pom.getInstanceFinal().getMyitin());
	}

	@Then("User to See the Booking order id and booking details")
	public void user_to_see_the_booking_order_id_and_booking_details() {
	}
	
	@When("User is click checkall option")
	public void user_is_click_checkall_option() {
		buttonMethod(pom.getInstanceLogout().getCheckall());
	}

	@When("User is click cancelall option")
	public void user_is_click_cancelall_option() {
		buttonMethod(pom.getInstanceLogout().getCancelall());
	}
	@When("user is click alert option ok Button")
	public void user_is_click_alert_option_ok_button() {
		alert();
	}
	@When("user is click logout")
	public void user_is_click_logout() {
		buttonMethod(pom.getInstanceLogout().getLogout());
	}
	@When("user is get screenshot")
	public void user_is_get_screenshot() throws IOException {
		screenShot("C:\\Users\\prabu\\eclipse-workspace\\Selenium\\Screenshot\\adactincucumber.png");
	}
	@Then("user is close the browser")
	public void user_is_close_the_browser() {
		close();
	}




}
