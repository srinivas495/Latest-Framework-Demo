package com.slt.tests;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slt.drivers.DriverManager;


public final class HomepageTests extends BaseTest {

	private HomepageTests(){

	}

	@Test
	public void test3() 
	{
		
		/*
		 * Validate whether the title is containing Google Search or google search
		 * Validate whether the title is not null and the length of title is greater than 15 and less than 1000
		 * Check for the links in pages --> Testing mini bytes - Youtube
		 * number of links displayed is exactly 10 or 15 
		 */
		
		
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - YouTube", Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		System.out.println(title);
		Assert.assertTrue(Objects.nonNull(title), "Title is null");
		Assert.assertTrue(title.toLowerCase().contains("google search"));
		Assert.assertTrue(title.toLowerCase().matches("\\w.*" + "google search"));  //[a-z A-Z 0-9]
		Assert.assertTrue(title.length()>15);
		Assert.assertTrue(title.length()<100);
		//WebElement elements = TestDriverManager.getDriver().findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3"));
		//Assert.assertEquals(elements.getSize(), 257);

		/*
		 * boolean isElementPresent = false; for(WebElement element : elements) {
		 * if(element.getText().equalsIgnoreCase("Testing mini bytes - YouTube"));
		 * isElementPresent = true; break; }
		 * Assert.assertTrue(isElementPresent,"Testing mini bytes not found");
		 */

	}


}
