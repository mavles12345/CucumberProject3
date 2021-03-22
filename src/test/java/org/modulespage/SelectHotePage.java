package org.modulespage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.LibGlobal;

public class SelectHotePage extends LibGlobal {

	public SelectHotePage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement adcradiobutton;

	@FindBy(id = "continue")
	private WebElement adccontinue;

	public WebElement getAdcradiobutton() {
		return adcradiobutton;
	}

	public WebElement getAdccontinue() {
		return adccontinue;
	}

	public void selectHotel() {

		txtclick(getAdcradiobutton());
		txtclick(getAdccontinue());

	}
}
