package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParallel {
	
	@Test(dataProvider="datapro")//call the data provider data with name if no name use the data provider method name
	public void testdatalogin(String userna, String passwo) throws InterruptedException {//passing parameers to call the data
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000); 
		driver.findElement(By.name("username")).sendKeys(userna);//pass the data here with parameters
	    driver.findElement(By.name("password")).sendKeys(passwo);//pass the data here with parameters
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000); 
		
	}
	
	@DataProvider(parallel=true)//DataProvider execute parallely and we have 100test we can't use parallel because system performance will down to over come we use thread count in  suitte level in xml file and execute from there and i mention 2 so each time 2 ses of data it takes and run in 2 browsers
	public Object[][] datapro() { 
		Object [][] data =new Object [6][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admio";
		data[1][1]="test123";
		
		data[2][0]="Admip";
		data[2][1]="test123";
		
		data[3][0]="Admio";
		data[3][1]="test123";
	
		data[4][0]="Ami";
		data[4][1]="test12";
		
		data[5][0]="Admi";
		data[5][1]="te123";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return data;//return data
		
	}
	
	
	
	

}
