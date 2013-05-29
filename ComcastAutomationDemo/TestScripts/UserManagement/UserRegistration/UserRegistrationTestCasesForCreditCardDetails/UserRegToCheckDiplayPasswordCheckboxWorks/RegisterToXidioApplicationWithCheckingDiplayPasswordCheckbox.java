package UserManagement.UserRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegToCheckDiplayPasswordCheckboxWorks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import ConfigServices.Utils.TestDataGenerator;
import Core.UserManagement.UserRegistrationFunction.Common.UserRegistrationFunction;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithCheckingDiplayPasswordCheckbox extends BaseTest{
	UserRegistrationFunction useRegFun=new UserRegistrationFunction();
	UserRegistrationValidationFuncitons userRegVal=new UserRegistrationValidationFuncitons();
  @Test
  public void testRegisterToXidioApplicationWithInvalidSecurityCodeLength() throws Exception {
		TestDataGenerator.modifyDataProperties();
		Thread.sleep(10000);
		driver.get(DataServiceProperties.APPURL);
		Thread.sleep(4000);
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(2000);
	    
	    useRegFun.RegistrationDetails(driver);
	    
	    driver.findElement(By.cssSelector("input.change_input_type")).click();
	    
	    assertEquals(DataServiceProperties._REG_PASSWORD, driver.findElement(By.name("user[password]")).getAttribute("value"));
	    
	    Thread.sleep(4000);
	    
	 }
}
