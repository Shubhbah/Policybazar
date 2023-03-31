package utility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static String captureScreenShot(WebDriver driver) throws IOException
	{
		String path = "C:\\Users\\Hp840G2_2\\Downloads\\PolicyBazar (1)\\PolicyBazar\\test-output\\ScreenShots\\"+ System.currentTimeMillis()+".png";    
	
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		FileHandler.copy(src, dest);
		
		return path;
		
	}

}
