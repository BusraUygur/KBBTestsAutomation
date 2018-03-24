package com.tests;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.utilities.ConfigurationReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase21_UsedCarOption {
	

	@Test
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		
		driver.get(ConfigurationReader.getProperty("url"));
		String title = driver.getTitle();
		String expectedTitle = "Kelley Blue Book | New and Used Car Price Values, Expert Car Reviews";
		Assert.assertEquals(title, expectedTitle);
		
		driver.findElement(By.id("entryPointShopper")).click();
		 
		WebElement dropDown =  driver.findElement(By.id("intentDropdown0"));
		Select select = new Select(dropDown);
		
	    select.selectByVisibleText("Used");
	    
	    driver.findElement(By.id("yearDropdown0")).click();
	    
		WebElement dropDown1 =  driver.findElement(By.id("intentDropdown0"));
		Select select1 = new Select(dropDown1);
		
		 driver.findElement(By.id("yearDropdown0")).click();
		driver.findElement(By.id("2000")).click();  
	    
		WebElement dropDown11 =  driver.findElement(By.id("makeDropdown0"));
		
		
		Select select11 = new Select(dropDown11);
		
		driver.findElement(By.id("18")).click();
		
		WebElement dropDown111 =  driver.findElement(By.id("modelDropdown0"));
		Select select111 = new Select(dropDown111);
		
		driver.findElement(By.id("123")).click();
		driver.findElement(By.id("startMyResearchBtn")).click();
	    
//		driver.findElement(By.id("selectedZipCode")).sendKeys("20148");
//	driver.findElement(By.id("enterzipsubmit")).click();
//		driver.findElement(By.cssSelector("#categorySelection > div.mod-single > div.mod-category.category-3.last > div > a")).click();
//		
//		driver.findElement(By.cssSelector("#Styles-list-container > div.style-category-container > div > div.vehicle-styles-container.clear.row-white.first > div.vehicle-styles-head.accordion-sub.expandable > a")).click();
		
	

	}
}
	

