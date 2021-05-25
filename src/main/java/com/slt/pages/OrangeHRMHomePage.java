package com.slt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.slt.drivers.DriverManager;

public final class OrangeHRMHomePage {

	private final By linkWelcome = By.id("welcome");
	private final By linkLogout = By.xpath("//a[text()='Logout']");

	public OrangeHRMHomePage clickWelcome() {
		DriverManager.getDriver().findElement(linkWelcome).click();
		return this;
	}

	public OrangeHRMLoginPage clickLogout() {
		
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(linkLogout));
		DriverManager.getDriver().findElement(linkLogout).click();
		return new OrangeHRMLoginPage();
	}
	
	
}
