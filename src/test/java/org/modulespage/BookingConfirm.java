package org.modulespage;

import javax.management.AttributeValueExp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.LibGlobal;

public class BookingConfirm extends LibGlobal {

	public BookingConfirm() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement adcOrdeID;

	public WebElement getAdcOrdeID() {
		return adcOrdeID;
	}

	public void bookingConfirm() {

		attributeValue(getAdcOrdeID());

	}

}
