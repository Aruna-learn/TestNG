package com.testngpractise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	public void Facebook() {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("sdet",Keys.ENTER);
		driver.getTitle();

		//Hard Assertions

		//Title verify
		String actualTitle=driver.getTitle();
		String expecedTitle="Log in to Facebookk";//error found so it will not execute he nextt code in hard assertions
		assertEquals(actualTitle, expecedTitle,"Title mismatched");

		//URL verify
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/";
		assertNotEquals(actualURL, expectedURL,"URL mismatched");


		//Text verify
		String actualText=driver.findElement(By.name("email")).getAttribute("value");
		String expecedText="";
		assertEquals(actualText, expecedText,"UserText  is mismatched");



		//Border verify
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border");
				String expecedBorder="1px solid rgb(240, 40, 73)";//converted hexadecimal border to rgb
		assertEquals(actualBorder, expecedBorder,"Border mismatched");


		//Error verify
		String actualError=driver.findElement(By.xpath("//div[@id='loginform']//div[2]")).getText();
		String expecedError="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		assertEquals(actualError, expecedError,"Error mismatched");



            driver.quit();






	}







}
