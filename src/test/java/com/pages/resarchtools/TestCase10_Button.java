package com.pages.resarchtools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Driver;

public class TestCase10_Button {

private WebDriver driver;
	
	public TestCase10_Button() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='logo-home-link']")
	public WebElement checkIfLogoIsPresentOnHomePage;
	
	@FindBy(id="entryPointShopper")
	public WebElement Price_NewUsedOptionOnHomePage;
	
	
	
	@FindBy(xpath="//a[@id='navToResearchTools']")
	public WebElement hoverToResearchTools;
	
	@FindBy(xpath="//a[@id='navToResearchToolsnavToCompareCars']")
	public WebElement compareCars;
	
	@FindBy(xpath="//input[@id='selectedZipCode']")
	public WebElement zipCodePopUpWindow;
	
	@FindBy(xpath="//input[@value='NewCar']")
	public WebElement newCarIsSelectedByDefault;
	

}
