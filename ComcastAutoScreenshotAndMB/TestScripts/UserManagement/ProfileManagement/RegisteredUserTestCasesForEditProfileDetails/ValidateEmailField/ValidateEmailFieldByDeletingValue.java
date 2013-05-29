package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateEmailField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class ValidateEmailFieldByDeletingValue extends BaseTest{
	UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
  @Test
  public void testValidateUserNameFieldByDeletingValueInPM() throws Exception {

	userRegDS.testUserRegistrationUsingComcast(driver);
	
	userLogin.UserLoginCredentials(driver);
    
	userLogin.ChangePassword(driver);
	
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.name("user[email]")).clear();
    driver.findElement(By.name("user[email]")).sendKeys("");
    
    driver.findElement(By.linkText("Save profile")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Email is required[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}
