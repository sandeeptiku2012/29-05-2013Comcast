package UserManagement.UserRegistration.UserRegistrationTestCasesForFirstName.UserRegWithNoFirstName;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithoutEnteringFirstName extends BaseTest{
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
  @Test
  public void testRegisterToXidioApplicationWithoutFirstName() throws Exception {
    driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateFirstName(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First name is required[\\s\\S]*$"));
  }
}
