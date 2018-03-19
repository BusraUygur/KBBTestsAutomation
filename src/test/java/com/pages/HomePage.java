package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Driver;

public class HomePage {

	private WebDriver driver;
	
	public HomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='logo-home-link']")
	public WebElement checkIfLogoIsPresentOnHomePage;

	@FindBy(id = "entryPointShopper")
	public WebElement Price_NewUsedOptionOnHomePage;

	@FindBy(xpath = "//a[@id='navToResearchTools']")
	public WebElement hoverToResearchTools;

	@FindBy(xpath = "//a[@id='navToResearchToolsnavToCompareCars']")
	public WebElement compareCars;

	@FindBy(xpath = "//input[@id='selectedZipCode']")
	public WebElement zipCodePopUpWindow;

	@FindBy(xpath = "//input[@value='NewCar']")
	public WebElement newCarIsSelectedByDefault;
	
	@FindBy(xpath = "(//select[@class='makemodelDropdown'])[1]")
	public WebElement selectMake;
	
	@FindBy(xpath = "(//select[@class='makemodelDropdown'])[1]")
	public WebElement selectModel;
	
	@FindBy(xpath = "(//select[@class='makemodelDropdown'])[2]")
	public WebElement selectYear;
	
	@FindBy(xpath = "//*[@id=\"noresultstrim\"]")
	public WebElement selectTrim;
	
	@FindBy(linkText = "Overview & Pricing")
	public WebElement overviewAndPricingButton;
	
	@FindBy(id = "surveyIframe")
	public WebElement surveyIframe;
	
	@FindBy(xpath = "//a[contains(text(),'No Thanks')]")
	public WebElement noThanks;
	
	@FindBy(xpath="//a[@id='navToCarValues']")
	public WebElement carValues;
	
	@FindBy(xpath="//a[@id='navToCarValuesnavToNewUsedCarPrices']")
	public WebElement newAndUsedCarPrices;
	
	
	
	
	
	

}
