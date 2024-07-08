package com.testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	public   WebDriver driver;
	 @Test
	public void LaunchApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
     public void EnterLoginDetails() throws InterruptedException {
		 Thread.sleep(5000); 
		driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
     @Test
     public void MyInfo() throws InterruptedException {
    	 Thread.sleep(5000); 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
 	}
	
     @Test
     public void VerifyMyinfo() throws InterruptedException {
    	 Thread.sleep(9000); 
    	WebElement info= driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']"));
    	if(info.isDisplayed()) {
    		info.clear();
    		info.sendKeys("aruna");
    	}
    	
     }
 
     public void VerifyLogin() throws InterruptedException {
   	 Thread.sleep(5000); 
    	 WebElement login=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
    	 System.out.println(login.getText());
    	
    	 driver.quit();
    	 
     }
     
     
}
