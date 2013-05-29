package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePinCode;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class VerifyChangePinCodeDetailsUpdatedSuccessfully extends BaseTest{
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  
  @Test
  public void testVerifyChangePinCodeDetailsUpdatedSuccessfully() throws Exception {
	userReg.testUserRegistrationUsingComcast(driver);
	  
	driver.get(DataServiceProperties.APPURL);
    
    userLogin.UserLoginCredentials(driver);
    
    userLogin.ChangePassword(driver);
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change pin code")).click();
    driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._CC_PIN_CODE);
    
    driver.findElement(By.name("commit")).click();
    
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._PASSWORD);
    
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}

