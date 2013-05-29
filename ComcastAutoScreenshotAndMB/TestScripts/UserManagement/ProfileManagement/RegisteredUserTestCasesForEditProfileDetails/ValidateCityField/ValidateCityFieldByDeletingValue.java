package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateCityField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class ValidateCityFieldByDeletingValue extends BaseTest{
	UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
  @Test
  public void testValidateUserNameFieldByDeletingValueInPM() throws Exception {

	userRegDS.testUserRegistrationUsingComcast(driver);
	
	userLogin.UserLoginCredentials(driver);
    
	userLogin.ChangePassword(driver);
	
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.name("user[city]")).clear();
    driver.findElement(By.name("user[city]")).sendKeys("");
    
    driver.findElement(By.linkText("Save profile")).click();
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*City is required[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
