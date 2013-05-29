package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePinCode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  ValidateChangePinCodeAllMandatoryFields
 * This test case validates Change Pin All Mandatory Fields
 * by logging registered user into Comcast application.
 * **/

public class ValidateChangePinCodeAllMandatoryFields extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();  
 
	@Test
	public void testVerifyChangePinCodeDetailsUpdatedSuccessfully() throws Exception {
	userReg.testUserRegistrationUsingComcast(driver);
	//driver.get(DataServiceProperties.APPURL);
    
    userLogin.UserLoginCredentials(driver);
    
    userLogin.ChangePassword(driver);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change pin code")).click();
    
    driver.findElement(By.name("commit")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*This field is required.[\\s\\S]*$"));
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*This field is required.[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}

