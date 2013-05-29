package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePassword.VerifyPasswordChangesSuccessfully;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class VerifyPasswordChangeWorks extends BaseTest{
	UserLoginFunctions userLogFun=new UserLoginFunctions();
	@Test
  public void testVerifyPasswordChangeWorks() throws Exception {
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	userReg.testUserRegistrationUsingComcast(driver);
	
	driver.get(DataServiceProperties.APPURL);
	
	userLogFun.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
   
    driver.findElement(By.linkText("Change password")).click();
    
    userLogFun.ChangePassword(driver);
    Thread.sleep(2000);
    
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}

