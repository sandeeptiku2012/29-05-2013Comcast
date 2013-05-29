package UserManagement.UserRegistration.UserRegistrationTestCasesForTermsAndCondition.UserRegByDeclineTermAndCondition;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Common.UserRegistrationFunction;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class RegisterToXidioApplicationWithValidCredentialByDeclineTermAndCondition extends BaseTest{
	UserRegistrationFunction urf=new UserRegistrationFunction();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  
	@Test
  public void testRegistrationToXidioApplicationWithValidCredentialByDeclingTermAndCondition() throws Exception {
	userReg.testUserRegistrationUsingComcast(driver);
	  
	driver.get(DataServiceProperties.APPURL);
	driver.findElement(By.linkText("Register")).click();
    
	//Calling UserRegistration Function
    urf.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    driver.findElement(By.id("terms_conditions_decline")).click();
    Thread.sleep(2000);
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have to agree to terms and conditions[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
}

