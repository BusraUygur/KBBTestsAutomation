package com.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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

public class TestCase14_NotClickable {

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
		select.selectByIndex(0);

		WebElement e = driver.findElement(By.xpath("//select[@class='makemodelDropdown w170'])[1])"));
		boolean notClickable = e.isEnabled();
		if (notClickable) {
			System.out.println("Model button is not clickable");
		}

	}

}
