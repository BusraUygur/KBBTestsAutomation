package com.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase15_RemoveCar {

	WebDriver driver;

	@BeforeClass
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
		jsEX.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);

		WebElement list = driver.findElement(By.xpath("(//select[@class='makemodelDropdown'])[1]"));
		Select select = new Select(list);
		select.selectByIndex(2);

		Thread.sleep(2000);
		WebElement list2 = driver.findElement(By.xpath("(//select[@class='makemodelDropdown w170'])[1]"));
		Select select2 = new Select(list2);
		select2.selectByIndex(1);
		Thread.sleep(2000);

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
		
		jsEX.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);
		
		WebElement list5 = driver.findElement(By.xpath("(//select[@class='makemodelDropdown'])[1]"));
		Select select5 = new Select(list5);
		select5.selectByIndex(5);
		
		WebElement list6 = driver.findElement(By.xpath("(//select[@class='makemodelDropdown w170'])[1]"));
		Select select6 = new Select(list6);
		select6.selectByIndex(1);
		
		WebElement list7 = driver.findElement(By.xpath("(//select[@class='makemodelDropdown'])[2]"));
		Select select7 = new Select(list7);
		select7.selectByIndex(1);
		Thread.sleep(2000);

		WebElement list8 = driver.findElement(By.xpath("//*[@id=\"noresultstrim\"]"));
		Select select8 = new Select(list8);
		select8.selectByIndex(1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='box']//a[@href='/compare-cars/']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='compareButtonStyleBlue mb5 btn-main-cta right']")).click();
		Thread.sleep(2000);
		
//		String title = driver.getTitle();
//		String expectedTitle = "Compare 2017 Alfa Romeo 4C vs 2017 Bentley Bentayga | Kelley Blue Book";
//		Assert.assertEquals(title, expectedTitle);
		
		driver.findElement(By.xpath("//a[@href=\"/compare-cars/overview/2017-alfa-romeo-4c-424162/\"]")).click();
		Thread.sleep(2000);
		
//		String title2 = driver.getTitle();
//		String expectedTitle2 = "Compare 2017 Alfa Romeo 4C | Kelly Blue Book";
//		Assert.assertEquals(title2, expectedTitle2);
		
		Navigation navigator = driver.navigate();
		navigator.back();
		Thread.sleep(2000);
		
		
		
		

	}
	
	
	
	
	
}