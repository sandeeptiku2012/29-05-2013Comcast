package UserManagement.UserRegistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import ConfigServices.Utils.TestDataGenerator;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import Core.UserManagement.UserRegistrationFunction.Common.UserRegistrationFunction;

/**  UserRegistrationUsingComcastApplication
 * This test case validates user registration functionality
 * in the Comcast application.
 * **/

public class RegisterToXidioApplicationUsingValidCredentials extends BaseTest{
	UserRegistrationFunction userReg=new UserRegistrationFunction();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
  public void testUserRegistration() throws Exception {
	TestDataGenerator.modifyDataProperties();
	Thread.sleep(10000);
	
	driver.get(DataServiceProperties.APPURL);
	Thread.sleep(4000);
	
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Register")).click();
    
    userReg.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    driver.findElement(By.id("terms_conditions_accept")).click();
    
    userReg.CreditCardDetials(driver);
    
    driver.findElement(By.cssSelector("a.btn.submit")).click();
    
    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));

    driver.findElement(By.linkText("Sign out")).click();  
}
}