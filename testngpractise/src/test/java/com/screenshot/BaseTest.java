package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
   public static String subfoldername;
	 static WebDriver driver;	
	@BeforeTest
	public void setUpBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//for dependency injection only
	@AfterMethod
	public void capture(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			Screenshots(result.getTestContext().getName()+" -"+ result.getMethod().getMethodName()+".jpg");
		}
	
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	public void Screenshots(String fileName) {
		if(subfoldername==null) {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

	    subfoldername  = myDateObj.format(myFormatObj);
	   
		}
		TakesScreenshot takeScreenshot=(TakesScreenshot) driver;//in webdriver no getscreesnhsot so to get it takescreenshot is using and typecasting
		File sourcefile=takeScreenshot.getScreenshotAs(OutputType.FILE);//capturing screenshot in form of file
		File destfile=new File("./Screenshots/"+ subfoldername+ "/"+fileName);//store file in location
		try {
			FileUtils.copyFile(sourcefile, destfile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	
	}
	
}
