package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateEmailField;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import ConfigServices.Utils.TestDataGenerator;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class EditXidioUserEmail extends BaseTest{
	UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	  public void testEditXidioUserEmail() throws Exception {
	    userRegDS.testUserRegistrationUsingComcast(driver);
	    
	    userLogin.UserLoginCredentials(driver);
	    
	    userLogin.ChangePassword(driver);
	    Thread.sleep(4000);
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    
		TestDataGenerator.updateEmailDataPropertiesFields();
		Thread.sleep(4000);
		
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._UPD_EMAIL);
	    driver.findElement(By.linkText("Save profile")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.linkText(DataServiceProperties._UPD_EMAIL)).click();
	    Thread.sleep(4000);
	    assertEquals(DataServiceProperties._UPD_EMAIL, driver.findElement(By.name("user[email]")).getAttribute("value"));
	    driver.findElement(By.linkText("Sign out")).click();
	  }

}
