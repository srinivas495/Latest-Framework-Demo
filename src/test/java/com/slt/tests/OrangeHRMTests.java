package com.slt.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.slt.pages.OrangeHRMHomePage;
import com.slt.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {
	
	public OrangeHRMTests() {

	}
	
	@Test
	public void loginLogoutTests() {
		
		String title = new OrangeHRMLoginPage().enterUserName("Admin").enterPassword("admin123").clickLogin()
				.clickWelcome().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
				.isEqualTo("OrangeHRM");
		
		
	}
	
}
