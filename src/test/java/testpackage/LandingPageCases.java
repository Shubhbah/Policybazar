package testpackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage.LandingPage;

public class LandingPageCases extends BaseClass
{
	
	LandingPage landingPage;
	@Test (priority = 0)
	public void VerifySignInWithValidCredentials() throws InterruptedException
	{
		System.out.println("Testclass1Started");
		logger= report.createTest("Verify Sign in button is visible or not");
		 landingPage= new LandingPage(driver);
		 landingPage.MoveToSignInButtonOfLandingPage();;
		 landingPage.SignInButtonOfLandingPage();;
		 landingPage.SendMobileNumber();
		 landingPage.ClickOnContinueButton();
		 landingPage.sendPassword();
		 landingPage.FinalClickToSignIn();
		logger.fail("Test case is fail");
		 logger.pass("Test Case is pass");
		 System.out.println("Testclass1Finish");
	}
	
}