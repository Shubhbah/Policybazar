package testpackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage.LandingPage;

public class LandingPageCases extends BaseClass
{
	LandingPage landingPage;
	@Test (priority = 0)
	public void VerifySignInButtonVisiblity()
	{
		logger= report.createTest("Verify Sign in button is visible or not");
		 landingPage= new LandingPage(driver);
		 boolean result=landingPage.VisiblityOfSignInButton();
		 SoftAssert s= new SoftAssert();
		 s.assertEquals(result, true);
		 s.assertAll();
		 logger.pass("Test Case is pass");
		 
	
	}
	
	@Test  (priority = 1)
	public void VerifySignInButtonAccesiblity() throws InterruptedException
	{
		logger= report.createTest("Verify Sign in button is clickable or not");
		 landingPage= new LandingPage(driver);
		 boolean result=landingPage.AccesiblityOfSignInButton();
		 SoftAssert s= new SoftAssert();
		 s.assertEquals(result, false);
		 s.assertAll();
		 logger.pass("Test Case is pass");
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
	
//	@Test  (priority = 4)
//	public void VerifyoptionsOfTI() throws InterruptedException
//	{
//		logger= report.createTest("Verify all the options under Term insurance ");
//		 landingPage= new LandingPage(driver);
//		 boolean result=landingPage.OptionsOfTI();
//		 SoftAssert s= new SoftAssert();
//		 s.assertEquals(result, true);
//		 s.assertAll();
//		 logger.pass("Test Case is pass");
//	}
	
	
	

}
