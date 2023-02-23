package testpackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage.LandingPage;
import pompackage.LoginPage;

public class LogIn extends BaseClass
{
	LoginPage login;
	@Test (priority = 0)
	public void VerifyLoginwithcorrectcredentials () throws InterruptedException
	{
		System.out.println("Testclass2Started");
		logger= report.createTest("Verify Login with correct credentials ");
		login= new LoginPage(driver);
		login.ClickOnSignInButtonOfLandingPage();
		login.SendMobileNumber();
		login.ClickOnSignInWithPassword();
		login.sendPassword();
		login.ClickToSignIn();
		System.out.println("Testclass2Finish"); 
		
	
	}
	
	/*@Test  (priority = 1)
	public void VerifySignInButtonAccesiblity() throws InterruptedException
	{
		
	}
	
	
	@Test  (priority = 3)
	public void VerifyMenuBarOnLandingPage() throws InterruptedException
	{
		logger= report.createTest("Verify all options of menu bar on landing page");
		 landingPage= new LandingPage(driver);
		 boolean result=landingPage.OptionsOfMenuBar();
		 SoftAssert s= new SoftAssert();
		 s.assertEquals(result, true);
		 s.assertAll();
		 logger.pass("Test Case is pass");
	}
	
	@Test  (priority = 4)
	public void VerifyoptionsOfTI() throws InterruptedException
	{
		logger= report.createTest("Verify all the options under Term insurance ");
		 landingPage= new LandingPage(driver);
		 boolean result=landingPage.OptionsOfTI();
		 SoftAssert s= new SoftAssert();
		 s.assertEquals(result, true);
		 s.assertAll();
		 logger.pass("Test Case is pass");
	}
	*/
	
	

}
