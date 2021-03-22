package org.modulespage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.LibGlobal;

public class BookHotelPage extends LibGlobal {

	public BookHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement adcFirstName;

	@FindBy(id = "last_name")
	private WebElement adcLastName;

	@FindBy(id = "address")
	private WebElement adcaddress;

	@FindBy(xpath = "//input[@name=\"cc_num\"]")
	private WebElement adcCardNo;

	@FindBy(id = "cc_type")
	private WebElement adccreditcardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement adcMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement adcyear;

	@FindBy(id = "cc_cvv")
	private WebElement adccvv;

	@FindBy(id = "book_now")
	private WebElement adcbook;

	public WebElement getAdcFirstName() {
		return adcFirstName;
	}

	public WebElement getAdcLastName() {
		return adcLastName;
	}

	public WebElement getAdcaddress() {
		return adcaddress;
	}

	public WebElement getAdcCardNo() {
		return adcCardNo;
	}

	public WebElement getAdccreditcardtype() {
		return adccreditcardtype;
	}

	public WebElement getAdcMonth() {
		return adcMonth;
	}

	public WebElement getAdcyear() {
		return adcyear;
	}

	public WebElement getAdccvv() {
		return adccvv;
	}

	public WebElement getAdcbook() {
		return adcbook;
	}

	public void bookHotel(String firstname, String lastname, String billingaddress, String cardno, String cardtype,
			String expmonth, String expyear, String cvv) {
		fill(getAdcFirstName(), firstname);
		fill(getAdcLastName(), lastname);
		fill(getAdcaddress(), billingaddress);
		fill(getAdcCardNo(), cardno);
		fill(getAdccreditcardtype(), cardtype);
		fill(getAdcMonth(), expmonth);
		fill(getAdcyear(), expyear);
		fill(getAdccvv(), cvv);

		txtclick(getAdcbook());

	}

}
