package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.utilities.TestBase;

public class TestCase13_CheckPriceEquals extends TestBase {

	@Test
	public void test() throws InterruptedException {
		HomePage homepage = new HomePage();
		Actions actions = new Actions(driver);
		actions.moveToElement(homepage.hoverToResearchTools).perform();

		homepage.compareCars.click();
		Thread.sleep(2000);

		homepage.zipCodePopUpWindow.sendKeys("22181" + Keys.ENTER);
		Assert.assertTrue(homepage.newCarIsSelectedByDefault.isDisplayed());

		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		jsEX.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);

		WebElement list = homepage.selectMake;
		Select select = new Select(list);
		select.selectByIndex(2);
		Thread.sleep(3000);

		list = homepage.selectModel;
		select = new Select(list);
		select.selectByIndex(1);
		Thread.sleep(3000);

		list = homepage.selectYear;
		select = new Select(list);
		select.selectByIndex(1);
		Thread.sleep(3000);

		list = homepage.selectTrim;
		select = new Select(list);
		select.selectByIndex(1);
		Thread.sleep(3000);

		homepage.add.click();
		Thread.sleep(2000);

		homepage.overviewAndPricingButton.click();
		Thread.sleep(2000);

		WebElement fr = homepage.surveyIframe;
		driver.switchTo().frame(fr);

		WebElement elem = homepage.noThanks;
		elem.click();
		Thread.sleep(2000);

		// Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"RangeBox\"]/text[2]")).isDisplayed());

		jsEX.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);

		WebElement e1 = driver.findElement(By.xpath("//td[@id='configuredPrice']"));
		Thread.sleep(2000);
		// WebElement e2 = driver.findElement(By.linkText("$49,882"));
		// Assert.assertEquals(e1, e2);

		WebElement iframe = driver.findElement(By.id("PriceAdvisorFrame"));
		driver.switchTo().frame(iframe);
		
		
		
	}

}
