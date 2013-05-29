package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateFirstNameField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

/**  EditXidioUserNameInProfileManagement
 * This test case validates changing user profile feature
 * by logging registered user into Comcast application.
 * **/

public class EditXidioFirstNameInProfileManagement extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
  @Test
  public void testEditXidioUserNameInProfileManagement() throws Exception {
	
	driver.get(DataServiceProperties.APPURL);
	
	userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.name("user[first_name]")).clear();
    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._UPD_FIRST_NAME);
    driver.findElement(By.linkText("Save profile")).click();
    
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}

