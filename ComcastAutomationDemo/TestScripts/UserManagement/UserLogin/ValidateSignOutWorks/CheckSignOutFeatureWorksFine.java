package UserManagement.UserLogin.ValidateSignOutWorks;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class CheckSignOutFeatureWorksFine extends BaseTest{
 UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
 UserLoginFunctions userLogin=new UserLoginFunctions();
 
  @Test
  public void testSignOutFeatureInCamcast() throws Exception {
	userRegDS.testUserRegistrationUsingComcast(driver);
	
	userLogin.UserLoginCredentials(driver);
	
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign out[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
