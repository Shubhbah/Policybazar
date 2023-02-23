package testpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.Screenshot;
import utility.StaticBrowser;

public class BaseClass 
{
	public static ExtentReports report;
	public static ExtentHtmlReporter extent;
	public static ExtentTest logger;
	static WebDriver driver;
	
	@BeforeSuite
	public void beforesuite() throws InterruptedException
	{
		driver = StaticBrowser.openChromeBrowser();
		//logger.pass("Opening the browser...");
		System.out.println("Opening the browser.....");
		this.driver= driver;
		extent = new ExtentHtmlReporter("test-output/Report/"+System.currentTimeMillis()+".html");
		report= new ExtentReports();
		report.attachReporter(extent);
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		if (result.getStatus()== ITestResult.FAILURE)
		{
			String path= Screenshot.captureScreenShot(driver);
			logger.fail("Test case is failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
		report.flush();
	}
	
	
	@AfterSuite
	public void aftersuite()
	{
		//logger.pass("Closing all browsers");
		System.out.println("Closing all browsers");
		driver.quit();
		
	}
	

}
