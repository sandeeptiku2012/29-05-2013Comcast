package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateExpiryMonthField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.ProfileManagement.Scenario.ProfileManagementScenarioBasedFunctions;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  ValidateChangePaymentInfoCreditCardNumber
 * This test case validates payment Details Credit Card with Invalid Input
 * By logging registered user into Comcast application.
 * **/

public class ValidatePaymentInfoMonthByEnteringInvalidMonth extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
	
	@Test
	  public void testUserProfileChanges() throws Exception {
		userReg.testUserRegistrationUsingComcast(driver);
		//driver.get(DataServiceProperties.APPURL);
		
		userLogin.UserLoginCredentials(driver);

		userLogin.ChangePassword(driver);
		
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    
	    driver.findElement(By.linkText("Change payment info")).click();
	    
	    profMangScenarioFun.ValidateInvalidMonth(driver);
	        
	    driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
	    
	    Thread.sleep(1000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter Expiration Month between 1 and 12.[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
}
}

