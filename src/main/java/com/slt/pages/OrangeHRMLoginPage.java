package com.slt.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.slt.drivers.DriverManager;
import com.slt.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {
	
	
	private final By textboxUsername = By.id("txtUsername");
	private final By textboxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
	private final By buttonLogin = By.id("btnLogin");
	
	
	public OrangeHRMLoginPage enterUserName(String username) {
		sendKeys(textboxUsername, username , WaitStrategy.PRESENCE);
		return this;
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE);
		return this;
	}
	
	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin, WaitStrategy.CLICKABLE);
		return new OrangeHRMHomePage();
	}
	
	public String getTitle() {
		return getPageTitle();
		
	}
	
	
	
}
