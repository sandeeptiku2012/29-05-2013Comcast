package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateExpiryMonthField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class VerifyPaymentInfoExpiryMonthUpdatedSuccessfully extends BaseTest{
	UserLoginFunctions userLogFun=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
	@Test
	public void testVefiryChangePaymentInfoDetailsUpdatedSuccessfully() throws Exception {
	userReg.testUserRegistrationUsingComcast(driver);
	
	userLogFun.UserLoginCredentials(driver);
    
	userLogFun.ChangePassword(driver);
	
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change payment info")).click();
    
    userRegValFun.UpdateCCExpiryMonth(driver);
    
    driver.findElement(By.name("commit")).click();
    
    Thread.sleep(2000);
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    driver.findElement(By.linkText("Sign out")).click();
  }
}
