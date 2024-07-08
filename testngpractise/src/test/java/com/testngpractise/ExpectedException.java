package com.testngpractise;


 import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedException {
	@Test(expectedExceptions = {NoSuchElementException.class})
	public  void methodtime() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("abcd"));
		driver.quit();		
	}	
		
}
