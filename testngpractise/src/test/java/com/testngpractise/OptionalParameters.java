package com.testngpractise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameters {
public  static  WebDriver driver;
	
	
	@Parameters("browserName")
	@BeforeTest
	public void initializebrowser(@Optional("chrome")String browserName) {//optional parameters default open in chrome browser if didn't mention the value in parametersfile.xml 
		
		switch (browserName.toLowerCase()) {
		case "chrome":
		driver=new ChromeDriver();
		break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		default:
		System.out.println("browser is invalid");
		break;
		}
		
		driver.manage().window().maximize();
		
	}
	
	
	@Parameters("sleep")
	@AfterTest
	public void closebrowser(Long sleep) throws NumberFormatException, InterruptedException {
		System.out.println(sleep);
		Thread.sleep(sleep);
		
		 driver.quit();
		
	}
	
	
	
	@Parameters("URL")
	@Test
	public void LaunchApp(String URL) {
		
		driver.get(URL);
		String actualTitle=driver.getTitle();
		String expecedTitle="OpenCart - Open Source Shopping Cart Solution";//error found so it will not execute he nextt code in hard assertions
		assertEquals(actualTitle, expecedTitle,"Title mismatched");
	}

	@Test
	public void verifylogo() throws InterruptedException {
		Thread.sleep(5000);
		WebElement logo=driver.findElement(By.xpath("//div[@class='container']//div//a//img"));
		
		System.out.println(logo.isDisplayed());
		assertTrue(logo.isDisplayed());
	}
	
	
	@Test
	public void imageavailable() throws InterruptedException {
		Thread.sleep(5000);
		WebElement image=driver.findElement(By.xpath("//img[@alt='The best FREE and open-source eCommerce platform']"));
		System.out.println(image.isDisplayed());
		System.out.println(image.getAttribute("alt"));
		assertTrue(image.getAttribute("alt").startsWith("The best"));
	}
	@Test
	public void DemoLogin() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Demo")).click();
		
	}
	
	@Test
	public void StoreFront() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='demonstration-box']//a")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
