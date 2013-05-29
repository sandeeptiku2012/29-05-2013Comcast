package UserManagement.UserRegistration.UserRegistrationTestCasesForMobileNumber.UserRegWithNoMobileNumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithoutEnteringMobileNumber extends BaseTest{
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();

  @Test
  public void testRegisterToXidioApplicationWithoutEnteringMobileNumber() throws Exception {
	driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateMobileNumber(driver);
    
    driver.findElement(By.linkText("Next")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Mobile number is required[\\s\\S]*$"));
  }
}

