package org.modulespage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.LibGlobal;

public class SearchHotel extends LibGlobal {

	@FindBy(id = "location")
	private WebElement adcloc;

	@FindBy(id = "hotels")
	private WebElement adchotel;

	@FindBy(id = "room_type")
	private WebElement adcroom;

	@FindBy(id = "room_nos")
	private WebElement adcroomNo;

	@FindBy(id = "datepick_in")
	private WebElement adccheckIn;

	@FindBy(id = "datepick_out")
	private WebElement adccheckOut;

	@FindBy(id = "adult_room")
	private WebElement adcadultroom;

	@FindBy(id = "child_room")
	private WebElement adcchildroom;

	@FindBy(id = "Submit")
	private WebElement lgnClick;

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdcloc() {
		return adcloc;
	}

	public WebElement getAdchotel() {
		return adchotel;
	}

	public WebElement getAdcroom() {
		return adcroom;
	}

	public WebElement getAdcroomNo() {
		return adcroomNo;
	}

	public WebElement getAdccheckIn() {
		return adccheckIn;
	}

	public WebElement getAdccheckOut() {
		return adccheckOut;
	}

	public WebElement getAdcadultroom() {
		return adcadultroom;
	}

	public WebElement getAdcchildroom() {
		return adcchildroom;
	}

	public WebElement getLgnClick() {
		return lgnClick;
	}

	public void searchHotel(String location, String hotels, String room, String noofroom, String checkin,
			String checkout, String adult, String child) {

		selectByText(getAdcloc(), location);
		selectByText(getAdchotel(), hotels);
		selectByText(getAdcroom(), room);
		selectByText(getAdcroomNo(), noofroom);
		selectDate(getAdccheckIn(), checkin);
		selectDate(getAdccheckOut(), checkout);
		selectByText(getAdcadultroom(), adult);
		selectByText(getAdcchildroom(), child);

		txtclick(getLgnClick());

	}

}
