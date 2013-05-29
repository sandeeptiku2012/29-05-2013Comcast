package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateMobileNumberField;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import ConfigServices.Utils.TestDataGenerator;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class ExitXidioUserMobileNumber extends BaseTest{
	UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	  public void testEditXidioUserEmail() throws Exception {
	    userRegDS.testUserRegistrationUsingComcast(driver);
	    
	    userLogin.UserLoginCredentials(driver);
	    
	    userLogin.ChangePassword(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    
		TestDataGenerator.updateMobileNumberDataPropertiesFields();
		Thread.sleep(4000);
	    
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._UPD_MOBILE_NUMBER);
	    
	    driver.findElement(By.linkText("Save profile")).click();
	    
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    assertEquals(DataServiceProperties._MOBILE_NUMBER, driver.findElement(By.name("user[mobile_number]")).getAttribute("value"));
	    driver.findElement(By.linkText("Sign out")).click();
	  }

}
