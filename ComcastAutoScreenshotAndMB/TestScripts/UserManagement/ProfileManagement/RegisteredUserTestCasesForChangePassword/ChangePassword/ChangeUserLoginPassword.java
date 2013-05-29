package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePassword.ChangePassword;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

/**  ChangeUserLoginPassword
 * This test case validates changing user login password feature
 * by logging registered user into Comcast application.
 * **/

public class ChangeUserLoginPassword extends BaseTest{
  UserLoginFunctions userLogin=new UserLoginFunctions();
  @Test
  public void testLoginToCamcast() throws Exception {
	  	driver.get(DataServiceProperties.APPURL);

	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User name[\\s\\S]*$"));
	    Thread.sleep(1000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password[\\s\\S]*$"));
	    
	    userLogin.UserLoginCredentials(driver);
	    
	    //userLogin.ChangePassword(driver);
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign out[\\s\\S]*$"));
	    driver.findElement(By.linkText("Sign out")).click();
  }
}


