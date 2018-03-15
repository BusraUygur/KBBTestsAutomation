package com.pages.resarchtools;

import java.security.Key;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kbb.com/");
		String title = driver.getTitle();
		String expectedTitle = "Kelley Blue Book | New and Used Car Price Values, Expert Car Reviews";
		Assert.assertEquals(title, expectedTitle);

	}

//	@Test
//	public void test() throws InterruptedException {
//		WebElement element = driver.findElement(By.xpath("//a[@id='navToResearchTools']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//
//		driver.findElement(By.xpath("//a[@id='navToResearchToolsnavToCompareCars']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='selectedZipCode']")).sendKeys("22181" + Keys.ENTER);
//
//		Assert.assertTrue((driver.findElement(By.xpath("//input[@value='NewCar']")).isSelected()));
//	}
//
//	@Test
//	public void select() throws InterruptedException {
//		
////		WebElement element = driver.findElement(By.tagName("//div[@id='Compare-index']"));
////		Actions actions = new Actions(driver);
////		actions.moveToElement(element).click().sendKeys(Keys.PAGE_DOWN).perform();
////		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		
//		driver.findElement(By.xpath("//select[@id='noresultsmake']"));
//		driver.findElement(By.xpath("//option[@value='Alfa Romeo']"));
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//select[@id='noresultsmodel']"));
//		driver.findElement(By.xpath("//option[@value='4C']"));
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//select[@id='noresultsyear']"));
//		driver.findElement(By.xpath("//option[@value='2017']"));
//		
//
//	}
	
	
	
	
	
	

}
