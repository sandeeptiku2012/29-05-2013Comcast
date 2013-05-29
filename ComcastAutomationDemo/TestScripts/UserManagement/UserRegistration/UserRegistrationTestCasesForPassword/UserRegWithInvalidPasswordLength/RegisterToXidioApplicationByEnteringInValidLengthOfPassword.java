package UserManagement.UserRegistration.UserRegistrationTestCasesForPassword.UserRegWithInvalidPasswordLength;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationByEnteringInValidLengthOfPassword extends BaseTest{
 UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
 @Test
  public void testRegisterToXidioApplicationByEnteringInValidLengthOfPassword() throws Exception {
	driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
       
    userRegValFun.validateLengthOfPassword(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter at least 8 characters in Password[\\s\\S]*$"));
    
  }
}
