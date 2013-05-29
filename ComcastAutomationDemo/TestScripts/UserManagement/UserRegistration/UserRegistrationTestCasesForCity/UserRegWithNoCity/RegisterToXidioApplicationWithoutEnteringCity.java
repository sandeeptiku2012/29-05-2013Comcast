package UserManagement.UserRegistration.UserRegistrationTestCasesForCity.UserRegWithNoCity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithoutEnteringCity extends BaseTest{
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
  @Test
  public void testRegisterToXidioApplicationWithoutEnteringCity() throws Exception {
    driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateCity(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*City is required[\\s\\S]*$"));
  }
}

