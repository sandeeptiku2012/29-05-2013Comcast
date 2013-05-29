package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePaymentInfo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  ValidateChangePaymentInfoMandatoryFields
 * This test case validates payment Details All Mandatory Fields by
 * logging registered user into Comcast application.
 * **/

public class ValidateChangePaymentInfoMandatoryFields extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
	@Test
	  public void testUserProfileChanges() throws Exception {
		try{
		userReg.testUserRegistrationUsingComcast(driver);
		//driver.get(DataServiceProperties.APPURL);
		
		userLogin.UserLoginCredentials(driver);

		userLogin.ChangePassword(driver);
		
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    
	    driver.findElement(By.linkText("Change payment info")).click();
	    
	    driver.findElement(By.name("commit")).click();
	    Thread.sleep(500);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Credit Card Number is required[\\s\\S]*$"));
	    Thread.sleep(500);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Expiration Month is required[\\s\\S]*$"));
	    Thread.sleep(500);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Expiration Year is required[\\s\\S]*$"));
	    Thread.sleep(500);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Security Code is required[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
		}
		catch(Exception e){
		takeScreeFailedshots();
		}
	
}
}

