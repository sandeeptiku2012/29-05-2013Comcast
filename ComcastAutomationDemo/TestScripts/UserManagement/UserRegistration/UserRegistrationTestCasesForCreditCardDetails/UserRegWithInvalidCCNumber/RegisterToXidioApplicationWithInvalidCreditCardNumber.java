package UserManagement.UserRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithInvalidCCNumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import ConfigServices.Utils.TestDataGenerator;
import Core.UserManagement.UserRegistrationFunction.Common.UserRegistrationFunction;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithInvalidCreditCardNumber extends BaseTest {
	UserRegistrationFunction useRegFun=new UserRegistrationFunction();
	UserRegistrationValidationFuncitons userRegVal=new UserRegistrationValidationFuncitons();
	
  @Test
  public void testRegisterToXidioApplicationWithInvalidCreditCardNumber() throws Exception {
	TestDataGenerator.modifyDataProperties();
	Thread.sleep(10000);
	driver.get(DataServiceProperties.APPURL);
	Thread.sleep(4000);
    driver.findElement(By.linkText("Register")).click();
    Thread.sleep(2000);
    
    useRegFun.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    driver.findElement(By.id("terms_conditions_accept")).click();
    
   userRegVal.ValidateInvalidCreditCardNumber(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    
    assertEqual("Please enter a valid credit card number",driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/form[1]/div[2]/fieldset[1]/div[2]/label/label")).getText());
    try{
    	String AssertCCError="Please enter a valid credit card number";
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*'"+AssertCCError+"'[\\s\\S]*$"));
    }
    catch(Exception e){
    	
    }
  }

private void assertEqual(String string, String text) {
	// TODO Auto-generated method stub
	
}
}
