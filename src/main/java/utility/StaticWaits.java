package utility;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticWaits 
{
	
	public static void elementWait(WebDriver driver, int waitingTime, String Locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(Locator)));
	
	}

}
