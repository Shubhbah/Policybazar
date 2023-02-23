package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.StaticWaits;

public class LoginPage {
	WebDriver driver;
	@FindBy (xpath="//a[contains(text(),'Sign in')]")
	private WebElement SignInButton;
	
	@FindBy (xpath="(//label[contains(text(),'Mobile Number')]/preceding-sibling::input)[2]")
	private WebElement MobileNumber;
	
	@FindBy (xpath="(//*[contains(text(),'Sign in with Password')])[2]")
	private WebElement SignInWithPassword;
	
	@FindBy (xpath="//*[@name='password']")
	private WebElement password;
	
	
	@FindBy (xpath="//*[@class=\"input-block\"]/following::*[text()='Sign in']")
	private WebElement SignInOnModal;
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void ClickOnSignInButtonOfLandingPage() throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		StaticWaits.elementWait(driver, 20, "//a[contains(text(),'Sign in')]");
		SignInButton.click();
		System.out.println("SignInButton.click()");
	}
	
	public void SendMobileNumber() throws InterruptedException
	{
		Thread.sleep(5000);
		StaticWaits.elementWait(driver, 10, "(//label[contains(text(),'Mobile Number')]/preceding-sibling::input)[2]");
		MobileNumber.sendKeys("9168249239");
		System.out.println("MobileNumber.sendKeys");
	}
	
	public void ClickOnSignInWithPassword() throws InterruptedException
	{
		SignInWithPassword.click();
		System.out.println("SignInWithPassword.click");
	}
	
	public void sendPassword()  
	{
		StaticWaits.elementWait(driver, 10, "//*[@name='password']");

		password.sendKeys("Mrutyunjay");
		System.out.println("password.sendKeys");
	}
	public void ClickToSignIn()  
	{
		

		SignInOnModal.click();
        System.out.println("SignInOnModal.click");
	}
}
