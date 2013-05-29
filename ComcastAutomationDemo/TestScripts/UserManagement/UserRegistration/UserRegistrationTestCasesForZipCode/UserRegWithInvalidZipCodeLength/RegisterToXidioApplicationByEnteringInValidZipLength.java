package UserManagement.UserRegistration.UserRegistrationTestCasesForZipCode.UserRegWithInvalidZipCodeLength;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationByEnteringInValidZipLength extends BaseTest{
	 UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	 
  @Test
  public void testRegisterToXidioApplicationWithEnteringInValidZip() throws Exception {
	driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateInvalidZipLength(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter Zip code 5 characters long[\\s\\S]*$"));
    driver.findElement(By.name("user[zip]")).clear();
    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
    Thread.sleep(2000);
  }
}

