package com.testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {

	@Test
	public void google() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
	
	@Test
      public void Facebook() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("aruna",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}


//if we have 1 test method we can click on run or rightlick run as testng test
//if we have many methods we can click on run all or rightclick run as  testng test
//here 1st test is ggogle the facebook but when we run it automatically takes facebook as 1st test the google because testng will run test based on alphabetical order