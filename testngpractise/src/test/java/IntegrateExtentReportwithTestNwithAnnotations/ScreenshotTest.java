package IntegrateExtentReportwithTestNwithAnnotations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScreenshotTest extends BaseTest {
	@Test(testName="Facebook",groups= {"sanity", "smoke"})
	public void Facebook() {
		driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		extentTest.info("navigating to facebook url");
		driver.findElement(By.name("email")).sendKeys("sdet",Keys.ENTER);
		extentTest.info("enter text in email box");
		System.out.println(driver.getTitle());	

		//Soft Assertions
		SoftAssert softassert=new SoftAssert();

		//Title verify
		String actualTitle=driver.getTitle();
		String expecedTitle="Log in to Facebook";
		softassert.assertEquals(actualTitle, expecedTitle,"Title mismatched");

		//URL verify
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/";
		softassert.assertNotEquals(actualURL, expectedURL,"URL mismatched");


		//Text verify
		String actualText=driver.findElement(By.name("email")).getAttribute("value");
		String expecedText="";
		softassert.assertEquals(actualText, expecedText,"UserText  is mismatched");



		//Border verify
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder="0.8px solid rgb(240, 40, 73)";//converted hexadecimal(1px solid #f02849) border to rgb
		softassert.assertEquals(actualBorder, expectedBorder,"Border mismatched");


		//Error verify
		String actualError=driver.findElement(By.xpath("//div[@id='loginform']//div[2]")).getText();
		String expecedError="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		softassert.assertEquals(actualError, expecedError,"Error mismatched");



		driver.quit();


		softassert.assertAll();//writing in last it thorws an exception if any errors in the asserts

	}
	@Test(testName="LaunchApp",groups= {"sanity", "regression"})
	public void LaunchApp() {
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		extentTest.info("navigating to orangehrm url");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test(testName="Facebookweb",groups= {"sanity"})
	public void Facebookweb() {

		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		extentTest.info("navigating to facebook url");
		driver.findElement(By.name("email")).sendKeys("sdet",Keys.ENTER);
		String actualTitle=driver.getTitle();
		String expecedTitle="Log in to Facebookk";//error found so it will not execute he nextt code in hard assertions
		assertEquals(actualTitle, expecedTitle,"Title mismatched");
		extentTest.pass("title is matched");
	}
}
