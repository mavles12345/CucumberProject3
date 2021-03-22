package org.stepdefinition;

import org.modulespage.BookHotelPage;
import org.modulespage.BookingConfirm;
import org.modulespage.LoginPage;
import org.modulespage.SearchHotel;
import org.modulespage.SelectHotePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.utility.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends LibGlobal {

	WebDriver driver;

	LoginPage loginpage;

	SearchHotel hotelsearch;

	SelectHotePage hotelSelect;

	BookHotelPage hotelBook;

	BookingConfirm orderPage;

	@Given("User should enter the {string}, {string} and click the login")
	public void user_should_enter_the_and_click_the_login(String username, String password)
			throws InterruptedException {

		launchBrowser();
		loadUrl("https://adactinhotelapp.com/");
		Thread.sleep(3000);
		loginpage = new LoginPage();
		loginpage.login(username, password);

	}

	@When("User user should enter the details {string},{string},{string},{string},{string},{string},{string},{string} and click the search button")
	public void user_user_should_enter_the_details_and_click_the_search_button(String location, String hotels,
			String room, String noofroom, String checkin, String checkout, String adult, String child) {

		hotelsearch = new SearchHotel();

		hotelsearch.searchHotel(location, hotels, room, noofroom, checkin, checkout, adult, child);

	}

	@When("User select the hotel and continue")
	public void user_select_the_hotel_and_continue() {

		hotelSelect = new SelectHotePage();
		hotelSelect.selectHotel();

	}

	@When("user should enter booking details {string},{string},{string},{string},{string},{string},{string},{string} and click the book now")
	public void user_should_enter_booking_details_and_click_the_book_now(String firstname, String lastname,
			String billingaddress, String cardno, String cardtype, String expmonth, String expyear, String cvv)
			throws InterruptedException {

		hotelBook = new BookHotelPage();
		hotelBook.bookHotel(firstname, lastname, billingaddress, cardno, cardtype, expmonth, expyear, cvv);

	}

	@Then("User should verify the order number and close the browser")
	public void user_should_verify_the_order_number_and_close_the_browser() throws InterruptedException {
		Thread.sleep(7000);
		orderPage = new BookingConfirm();
		orderPage.bookingConfirm();
	}

}
