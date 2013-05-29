package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateFirstNameField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

public class ValidateFirstNameFieldByDeletingValue extends BaseTest{
 
  @Test
  public void testValidateUserNameFieldByDeletingValueInPM() throws Exception {
	UserLoginFunctions userLogin=new UserLoginFunctions();
	driver.get(DataServiceProperties.APPURL);
	
	userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.name("user[first_name]")).clear();
    driver.findElement(By.name("user[first_name]")).sendKeys("");
    driver.findElement(By.linkText("Save profile")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First name is required[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
