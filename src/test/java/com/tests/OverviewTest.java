package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Driver;
import com.utilities.TestBase;

public class OverviewTest extends TestBase {

//	@FindBy(xpath="//a[@class='logo-home-link']")
//	public WebElement name;
//	
//	public boolean findTitle() {
//		return true;
//	}
	private static WebDriver driver;

	public OverviewTest() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
}
