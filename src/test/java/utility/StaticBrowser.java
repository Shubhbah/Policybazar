package utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaticBrowser {
	
	public static WebDriver openChromeBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp840G2_2\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com");
		Thread.sleep(3000);
		return driver;
	}
	

}
