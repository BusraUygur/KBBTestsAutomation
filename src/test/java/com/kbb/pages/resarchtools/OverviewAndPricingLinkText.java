package com.pages.resarchtools;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OverviewAndPricingLinkText {

	WebDriver driver;

	@Test
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.kbb.com/");
		String title = driver.getTitle();
		String expectedTitle = "Kelley Blue Book | New and Used Car Price Values, Expert Car Reviews";
		Assert.assertEquals(title, expectedTitle);

	}

	@Test
	public void test() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[@id='navToResearchTools']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

		driver.findElement(By.xpath("//a[@id='navToResearchToolsnavToCompareCars']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='selectedZipCode']")).sendKeys("22181" + Keys.ENTER);

		Assert.assertTrue((driver.findElement(By.xpath("//input[@value='NewCar']")).isSelected()));
		
		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		// WebElement element = driver.findElement(By.xpath("//div//h1[@class='title
		// white with-module']"));
		// Actions actions = new Actions(driver);
		// actions.moveToElement(element).sendKeys(Keys.PAGE_DOWN).build().perform();
		// actions.sendKeys(Keys.PAGE_DOWN).perform();
		jsEX.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);

		WebElement list = driver.findElement(By.xpath("(//select[@class='makemodelDropdown'])[1]"));
		Select select = new Select(list);
		select.selectByIndex(2);
		// driver.findElement(By.xpath("//option[@value='Alfa Romeo']"));
		// Thread.sleep(2000);
		//
		// driver.findElement(By.xpath("//select[@id='noresultsmodel']"));
		// driver.findElement(By.xpath("//option[@value='4C']"));
		Thread.sleep(2000);
		WebElement list2 = driver.findElement(By.xpath("(//select[@class='makemodelDropdown w170'])[1]"));
		Select select2 = new Select(list2);
		select2.selectByIndex(2);
		Thread.sleep(2000);
		
		// driver.findElement(By.xpath("//select[@id='noresultsyear']"));
		// driver.findElement(By.xpath("//option[@value='2017']"));
		WebElement list3 = driver.findElement(By.xpath("(//select[@class='makemodelDropdown'])[2]"));
		Select select3 = new Select(list3);
		select3.selectByIndex(1);
		Thread.sleep(2000);

		WebElement list4 = driver.findElement(By.xpath("//*[@id=\"noresultstrim\"]"));
		Select select4 = new Select(list4);
		select4.selectByIndex(1);
		Thread.sleep(2000); 

		driver.findElement(By.xpath("//div[@class='box']//a[@href='/compare-cars/']")).click();
		
		Thread.sleep(2000); 
		driver.findElement(By.linkText("Overview & Pricing")).click();
		Thread.sleep(2000); 
		
		WebElement el = driver.findElement(By.xpath("//*[@id=\"RangeBox\"]/text[2]"));
		String text = "Fair Purchase Price";
		Assert.assertEquals(el, text);
		Thread.sleep(2000);
		
		WebElement el2 = driver.findElement(By.xpath("//g[@id=\"RangeBox\"]/text[4]"));
		String text2 = "Fair Market Range";
		Assert.assertEquals(el2, text2);
		
		jsEX.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		
		List<WebElement> table = driver.findElements(By.xpath("//td[@id='configuredPrice']//preceding-sibling::td"));
		for (WebElement tables : table) {
			
		}
		
		
		
	}

	}


	
	
	
	
	
	


