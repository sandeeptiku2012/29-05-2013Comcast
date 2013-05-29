package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePassword.ValidateNewAndConfirmPassword;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.ProfileManagement.Scenario.ProfileManagementScenarioBasedFunctions;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class ValidateNewPasswordAndConfirmPasswordMatch extends BaseTest{
	UserLoginFunctions userLogFun=new UserLoginFunctions();
	ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
	@Test
  public void testVerifyPasswordChangeWorks() throws Exception {

	//userReg.testUserRegistrationUsingComcast(driver);
	driver.get(DataServiceProperties.APPURL);
	userLogFun.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
   
    driver.findElement(By.linkText("Change password")).click();
    
    profMangScenarioFun.VerifyNewPassAndConfirmPassMatch(driver);
    Thread.sleep(2000);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Passwords doesn't match[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}

