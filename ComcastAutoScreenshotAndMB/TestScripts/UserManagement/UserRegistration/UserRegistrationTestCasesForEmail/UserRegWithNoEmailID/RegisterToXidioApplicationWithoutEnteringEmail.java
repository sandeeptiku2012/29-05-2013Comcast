package UserManagement.UserRegistration.UserRegistrationTestCasesForEmail.UserRegWithNoEmailID;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithoutEnteringEmail extends BaseTest{
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
  
	@Test
  public void testRegisterToXidioApplicationWithoutEnteringEmail() throws Exception {
    driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateEmail(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Email is required[\\s\\S]*$"));
  }
}

