package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.StaticWaits;

public class LandingPage {
	WebDriver driver;
	
	@FindBy (xpath="//span[text()='Account & Lists']")
	private WebElement MovetoSignInButtton;
	
	@FindBy (xpath="//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
	private WebElement SignInButton;
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement EmailOrMobilePhoneNumber;
	
	@FindBy (xpath="//span[@id='continue']")
	private WebElement ContinueButton;
	
	@FindBy (xpath="//input[@id='ap_password'][@name='password']")
	private WebElement Password;
	
	
	@FindBy (xpath="//input[@id='signInSubmit'][@type='submit']")
	private WebElement FinalSignInButton;
	
	/*@FindBy (xpath="//a//span[contains(text(),'Zero Cost Term Insurance')]")
	private WebElement ZeroCost;
	
	@FindBy (xpath="//a//span[contains(text(),'Term Insurance for NRIs')]")
	private WebElement TIForNRIs;*/
	
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public boolean VisiblityOfSignInButton()
	{
		StaticWaits.elementWait(driver, 20, "//span[text()='Account & Lists']");
		boolean result =MovetoSignInButtton.isDisplayed();
		return result;
	}
	
	public void MoveToSignInButtonOfLandingPage() throws InterruptedException 
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		StaticWaits.elementWait(driver, 20, "//span[text()='Account & Lists']");
		Actions act=new Actions(driver);
		act.moveToElement(MovetoSignInButtton);
		
		System.out.println("MoveTOSignInButton");
	}
	public void SignInButtonOfLandingPage() throws InterruptedException
	{
	
		Thread.sleep(2000);
		StaticWaits.elementWait(driver, 20, "//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']");
		SignInButton.click();
		System.out.println("SignInButton.click");
	}
	public void SendMobileNumber() throws InterruptedException
	{
		Thread.sleep(5000);
		StaticWaits.elementWait(driver, 10, "//input[@id='ap_email']");
		EmailOrMobilePhoneNumber.sendKeys("919834351007");
		System.out.println("MobileNumber.sendKeys");
	}
	
	public void ClickOnContinueButton() throws InterruptedException
	{
		ContinueButton.click();
		System.out.println("Continue.click");
	}
	
	public void sendPassword()  
	{
		StaticWaits.elementWait(driver, 10, "//input[@id='ap_password'][@name='password']");

		Password.sendKeys("Sagarjagtap@1");
		System.out.println("password.sendKeys");
	}
	public void FinalClickToSignIn()  
	{

		FinalSignInButton.click();
        System.out.println("FinalSignInOnModal.click");
	}
	
}
