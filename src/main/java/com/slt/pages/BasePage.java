package com.slt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.slt.constants.FrameworkConstants;
import com.slt.drivers.DriverManager;
import com.slt.enums.WaitStrategy;
import com.slt.factories.ExplicitWaitFactory;

public class BasePage {
	
	protected void click(By by , WaitStrategy waitstrategy) {
		
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.click();
	}
	
	protected void sendKeys(By by, String value, WaitStrategy waitstrategy ) 
	{
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
		
	}
	
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
		
	}
	
	
	private void explicitlyWaitForElementToBeClickable(By by) {
		
		new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExpcitlyWait())
		.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private void explicitlyWaitForElementToBePresent(By by) {
		
		new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExpcitlyWait())
		.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
