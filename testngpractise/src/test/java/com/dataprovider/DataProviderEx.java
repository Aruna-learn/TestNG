package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@Test(dataProvider="login")//call the data provider data with name if no name use the data provider method name
	public void testdatalogin(String userna, String passwo) throws InterruptedException {//passing parameers to call the data
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		 
		driver.findElement(By.name("username")).sendKeys(userna);//pass the data here with parameters
	    driver.findElement(By.name("password")).sendKeys(passwo);//pass the data here with parameters
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000); 
		
	}
	
	@DataProvider(name="login")//unique name for data provider to identify
	public Object[][] datapro() {  //Dataprovider method[void is replaced to return type Object[][]]
		Object [][] data =new Object [2][2];//dataprovider user single or 2dimensional array
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admi";
		data[1][1]="test123";
		return data;//return data
		
	}
	
	
	
	

}
