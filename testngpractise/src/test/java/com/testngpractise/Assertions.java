package com.testngpractise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;

public class Assertions {
@Test
public void google() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		String expected="selenium - Google Search";
		String actual=driver.getTitle();
	   // Assert.assertEquals(actual,expected,"Title matches");
		System.out.println(driver.getTitle());
		assertEquals(actual, expected,"title matches");
		
//		assertNotEquals(actual, expected);
//		assertTrue(true);
//		assertFalse(false);
//		assertNull(actual);
//		assertNotNull(expected);
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
