package UserManagement.UserRegistration.UserRegistrationTestCasesForMobileNumber.UserRegWithInvalidMobileNumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationByEnteringInValidMobileNumber extends BaseTest{
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
	@Test
	  public void testRegisterToXidioApplicationByEnteringInValidMobileNumber() throws Exception {
		try{
		driver.get(DataServiceProperties.APPURL);
	    driver.findElement(By.linkText("Register")).click();
	    
	    userRegValFun.validateInvalidMobileNumber(driver);
	    
	    driver.findElement(By.linkText("Next")).click();
	    Thread.sleep(2000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter a valid Mobile number[\\s\\S]*$"));
		}
		catch(Exception e){
			takeScreeFailedshots();
		}
	  }
}
