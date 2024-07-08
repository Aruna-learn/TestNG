package com.testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountTimeOutSize {
	
	
	
	@Test(invocationCount=5,threadPoolSize=3)
         public void invoc() throws InterruptedException {
        	 WebDriver driver=new ChromeDriver();
        		driver.get("https://randomuser.me/");
        		Thread.sleep(3000);
        		driver.findElement(By.xpath("//li[@data-label='name']")).click();
	         String  name=driver.findElement(By.id("user_value")).getText();
	         System.out.println(name);
	         
	         
	         Thread.sleep(3000);
	         driver.findElement(By.xpath("//li[@data-label='email']")).click();
	         System.out.println("Email:"+driver.findElement(By.id("user_value")).getText());   
	       
	         
	         
	         
	         
	         
	         
	         
         }
}
