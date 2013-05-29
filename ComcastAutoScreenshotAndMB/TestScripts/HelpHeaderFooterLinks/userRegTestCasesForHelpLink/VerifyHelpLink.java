package HelpHeaderFooterLinks.userRegTestCasesForHelpLink;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  VerifyHelpLink
 * This test case validates Help Link by
 * logging registered user into Comcast application.
 * **/

public class VerifyHelpLink extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
	@Test
	  public void testUserProfileChanges() throws Exception {
		userReg.testUserRegistrationUsingComcast(driver);
		//driver.get(DataServiceProperties.APPURL);
		
		userLogin.UserLoginCredentials(driver);

		userLogin.ChangePassword(driver);
		
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Help")).click();

	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Help[\\s\\S]*$"));
	    	    
	    driver.findElement(By.linkText("Sign out")).click();
}
}

