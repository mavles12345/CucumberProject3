package org.modulespage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.LibGlobal;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPassWord;

	@FindBy(id = "login")
	private WebElement btnClick;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public void login(String userName, String passWord) {

		fill(getTxtUserName(), userName);
		fill(getTxtPassWord(), passWord);
		txtclick(getBtnClick());

	}

}
