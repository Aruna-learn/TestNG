package IntegrateExtentReportwithTestNwithAnnotations;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
   public static String subfoldername;
	 static WebDriver driver;
	 public static ExtentReports extentreports;
	 public static ExtentTest extentTest;
	 
	 
	 
	 
	 
	 @Parameters("browserName") //for crossbrwser testing
	@BeforeTest
	public void setUpBrowser(ITestContext context,@Optional("chrome")String browserName) {
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
			//get browser related information
			Capabilities caps= 	((RemoteWebDriver)driver).getCapabilities();
			String device= caps.getBrowserName();
			String author=context.getCurrentXmlTest().getParameter("author");
			
			extentTest	=extentreports.createTest(context.getName());//create the test dynamically using context
			extentTest.assignAuthor(author);
			
			extentTest.assignDevice(device);
		}
		
	
	 @BeforeSuite//we haqve generate reports befpore the suite
	 public  void initializeextentreport() {
		 ExtentSparkReporter SparkReporter_all =new ExtentSparkReporter("AllTests.html");
		 
		 ExtentSparkReporter SparkReporter_fail =new ExtentSparkReporter("FailTests.html");//fail tests 
			SparkReporter_fail.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();//filter fail tests
		 
			SparkReporter_fail.config().setDocumentTitle("Leaarning ExtentReports");
		 
		 
		 
		 extentreports=new ExtentReports();
		 
		 extentreports.attachReporter(SparkReporter_all,SparkReporter_fail);
		 extentreports.setSystemInfo("OS", System.getProperty("os.name"));
			extentreports.setSystemInfo("JavaVersion", System.getProperty("java.version"));
	 }
	 
	 
	 @AfterSuite//generate report to html
	 public  void generatereport() throws IOException {
		 extentreports.flush();
		 Desktop.getDesktop().browse(new File("AllTests.html").toURI());
		 Desktop.getDesktop().browse(new File("FailTests.html").toURI());
	 }
	 
	 
	 @AfterMethod//if method in 1st test is fail it will stop so get the status
		public void checkstatus(Method m ,ITestResult result) {
			if(result.getStatus()==ITestResult.FAILURE) {
				String screenshotpath=null;
			screenshotpath=Screenshots(result.getTestName()+".jpg");
			extentTest.addScreenCaptureFromPath(screenshotpath);
			extentTest.fail(result.getThrowable());
			
			
			}
			
			else if(result.getStatus()==ITestResult.SUCCESS) {
				extentTest.pass(m.getName()+"is passed");
				
			}
		//category also
			//extentTest.assignCategory(m.getAnnotation(Test.class).groups());
			
		}
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	public String Screenshots(String fileName) {
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
		return fileName;
	
	}
	
}
