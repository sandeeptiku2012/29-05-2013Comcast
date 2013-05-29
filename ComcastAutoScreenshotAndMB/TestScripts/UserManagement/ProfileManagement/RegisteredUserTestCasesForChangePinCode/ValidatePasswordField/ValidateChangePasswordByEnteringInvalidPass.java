package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePasswordField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.ProfileManagement.Scenario.ProfileManagementScenarioBasedFunctions;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  ValidateChangePinPasswordByEnteringInvalidPass
 * This test case validates Password by entering invalid Password
 * by logging registered user into Comcast application.
 * **/

public class ValidateChangePasswordByEnteringInvalidPass extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();  
	ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
	
	@Test
	public void testVerifyChangePinCodeDetailsUpdatedSuccessfully() throws Exception {
	userReg.testUserRegistrationUsingComcast(driver);
	//driver.get(DataServiceProperties.APPURL);
    
    userLogin.UserLoginCredentials(driver);
    
    userLogin.ChangePassword(driver);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change pin code")).click();
    
    profMangScenarioFun.ValidatePasswordFieldByEnteringInvalidPass(driver);
        
    driver.findElement(By.name("commit")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pin code has not been updated[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}

