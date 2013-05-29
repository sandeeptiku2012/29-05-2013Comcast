package UserManagement.UserRegistration.UserRegistrationTestCasesForEmail.UserRegWithInvalidEmailID.UserRegWithInvalidEmailIDMissingInputs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationByEnteringInValidEmail extends BaseTest{
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
  @Test
  public void testRegisterToXidioApplicationByEnteringInValidEmail() throws Exception {
	driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateInvalidEmail(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter a valid email address[\\s\\S]*$"));
  }
}
