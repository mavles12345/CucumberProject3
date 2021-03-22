package org.utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {

	public static WebDriver driver;

	public WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

	public void loadUrl(String url) {

		driver.get(url);

	}

	public void fill(WebElement element, String userName) {

		element.sendKeys(userName);

	}

	public void txtclick(WebElement element) {
		element.click();

	}

	public void browserQuit() {
		driver.quit();

	}

	public void selectByText(WebElement element, String data) {

		new Select(element).selectByVisibleText(data);
		// Select s=new Select(element);
		// s.selectByVisibleText(data);

	}

	public void selectbyIndex(WebElement element, int index) {

		new Select(element).selectByIndex(index);

	}

	public void selectDate(WebElement element, String data) {

		element.clear();
		element.sendKeys(data);

	}

	public void attributeValue(WebElement element) {

		String attribute = element.getAttribute("value");
		System.out.println(attribute);

	}

	// get current URL
	public String currentURL() {

		String uRL = driver.getCurrentUrl();
		return uRL;

	}

	// setsize of Window

	public void setWindowSize() {

		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);

	}

	// get title
	public String title() {

		String titleName = driver.getTitle();
		return titleName;

	}

	// get Page Source
	public String pageSource() {

		String sourcePage = driver.getPageSource();
		return sourcePage;

	}

	// Quite
	public void quitBrowser() {

		driver.quit();

	}

	// Close
	public void closeBrowser() {
		driver.close();

	}

	// delete all cookies
	public void cookies() {
		driver.manage().deleteAllCookies();

	}

	public List<String> dropDownGetAllOPtions(WebElement element) {

		List<String> allOptions = new ArrayList();

		Select s = new Select(element);
		// List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		List<WebElement> allSelectedOptions = new Select(element).getAllSelectedOptions();

		for (WebElement eachOptins : allSelectedOptions) {
			String text = eachOptins.getText();

			allOptions.add(text);

		}
		return allOptions;
	}

	public String firstSelectedOption(WebElement element) {

		// Select s=new Select(element);
		// WebElement firstSelectedOption = s.getFirstSelectedOption();
		// firstSelectedOption.getText();

		// WebElement firstSelectedOption=new
		// Select(element).getFirstSelectedOption().getText();
		return new Select(element).getFirstSelectedOption().getText();

	}

	public void selectIndex(WebElement element, int index) {
		//new Select(element).selectByIndex(index);
		

	}

		}


