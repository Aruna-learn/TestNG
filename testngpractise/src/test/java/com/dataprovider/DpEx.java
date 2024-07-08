package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DpEx {
	@Test(dataProvider="ex", dataProviderClass = ExcelDataP.class)//call the data provider data with name if no name use the data provider method name
	public void testdatalogin(String userna, String passwo) throws InterruptedException {//passing parameers to call the data
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		 
		driver.findElement(By.name("username")).sendKeys(userna);//pass the data here with parameters
	    driver.findElement(By.name("password")).sendKeys(passwo);//pass the data here with parameters
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000); 
		
	}
}
