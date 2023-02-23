package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.StaticWaits;

public class LandingPage {
	WebDriver driver;
	@FindBy (xpath="//a[contains(text(),'Sign in')]")
	private WebElement SignInButton;
	
	@FindBy (xpath="//a[contains(text(),'Insurance Products111')]")
	private WebElement InsuranceProducts;
	
	@FindBy (xpath="//a[contains(text(),'Renew Your Policy111')]")
	private WebElement RenewYourPolicy;
	
	@FindBy (xpath="//*[@class='ruby-wrapper ']//a[contains(text(),'Claim')]")
	private WebElement Claim;
	
	
	@FindBy (xpath="//a[contains(text(),'Support')]")
	private WebElement Support;
	
	@FindBy (xpath="//a//span[contains(text(),'Zero Cost Term Insurance')]")
	private WebElement ZeroCost;
	
	@FindBy (xpath="//a//span[contains(text(),'Term Insurance for NRIs')]")
	private WebElement TIForNRIs;
	
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public boolean VisiblityOfSignInButton()
	{
		StaticWaits.elementWait(driver, 20, "//a[contains(text(),'Sign in')]");
		boolean result =SignInButton.isDisplayed();
		return result;
	}
	
	public boolean AccesiblityOfSignInButton() throws InterruptedException
	{
		StaticWaits.elementWait(driver, 10, "//a[contains(text(),'Sign in')]");
		boolean result =SignInButton.isEnabled();
		
		Thread.sleep(2000);
		return result;
	}
	
	public boolean OptionsOfMenuBar() throws InterruptedException
	{
		StaticWaits.elementWait(driver, 10, "//a[contains(text(),'Sign in')]");

//		System.out.println("Clicking to button");
//		
//		SignInButton.click();
//		Thread.sleep(5000);
//		System.out.println("Clicked to button");
		StaticWaits.elementWait(driver, 20, "//a[contains(text(),'Insurance Products')]");
		boolean result1= InsuranceProducts.isDisplayed();
		boolean result2= RenewYourPolicy.isDisplayed();
		boolean result3= Claim.isDisplayed();
		boolean result4= Support.isDisplayed();
		
		boolean result = result1 && result2 && result3 && result4;
		
		return result;
	}
	
	public boolean OptionsOfTI() throws InterruptedException
	{
		StaticWaits.elementWait(driver, 10, "//a[contains(text(),'Sign in')]");

		System.out.println("Clicking to button");
		
		
		boolean result1= ZeroCost.isDisplayed();
		boolean result2= TIForNRIs.isDisplayed();
		
		
		boolean result = result1 && result2 ;
		
		return result;
	}
	
}
