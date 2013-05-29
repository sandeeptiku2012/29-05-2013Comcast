package UserManagement.UserRegistration.UserRegistrationTestCasesForPassword.UserRegWithNoPassword;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithoutEnteringPassword extends BaseTest{
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
  @Test
  public void testRegisterToXidioApplicationWithoutEnteringPassword() throws Exception {
    driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validatePassword(driver);
    
    driver.findElement(By.linkText("Next")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password is required[\\s\\S]*$"));
  }
}
