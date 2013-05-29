package UserManagement.UserRegistration.UserRegistrationTestCasesForAddress.UserRegWithNoAddress;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithoutEnteringAddress extends BaseTest{
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
  @Test
  public void testRegisterToXidioApplicationWithoutEnteringAddress() throws Exception {
    try{
	  driver.get(DataServiceProperties.APPURL);
    driver.findElement(By.linkText("Register_1")).click();
    }
    catch(Exception e){
    	takeScreeFailedshots();
    }
    userRegValFun.validateAddress(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Address is required[\\s\\S]*$"));
    
  }
}

