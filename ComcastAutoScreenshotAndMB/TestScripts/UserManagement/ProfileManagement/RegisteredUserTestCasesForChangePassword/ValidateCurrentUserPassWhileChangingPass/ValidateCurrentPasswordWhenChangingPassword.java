package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePassword.ValidateCurrentUserPassWhileChangingPass;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  ValidateCurrentPasswordWhenChangingPassword
 * This test case validates changing password form Profile Management
 * by registered user into Comcast application.
 * **/
public class ValidateCurrentPasswordWhenChangingPassword extends BaseTest{
 UserLoginFunctions userLogFun=new UserLoginFunctions();
 UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  @Test
  public void testValidateCurrentPasswordWhenChangingPassword() throws Exception {

	//userReg.testUserRegistrationUsingComcast(driver);
	
	driver.get(DataServiceProperties.APPURL);
    
	userLogFun.UserLoginCredentials(driver);
    
	userLogFun.ChangePassword(driver);
	Thread.sleep(2000);
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change password")).click();
    driver.findElement(By.name("old_password")).clear();
    driver.findElement(By.name("old_password")).sendKeys(DataServiceProperties._NONDIGIT_PASSWORD);
    
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(DataServiceProperties._RESET_PASSWORD);
    
    driver.findElement(By.name("confirm_password")).clear();
    driver.findElement(By.name("confirm_password")).sendKeys(DataServiceProperties._INVALID_PASSWORD);
    
    driver.findElement(By.name("commit")).click();
   
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password has not been updated[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}

