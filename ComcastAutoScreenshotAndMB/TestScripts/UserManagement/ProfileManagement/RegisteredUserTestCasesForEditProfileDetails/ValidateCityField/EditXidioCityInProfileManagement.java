package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateCityField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

public class EditXidioCityInProfileManagement extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
  public void testEditXidioCityInProfileManagement() throws Exception {
	
	driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    userLogin.UserLoginCredentials(driver);
     
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.name("user[city]")).clear();
    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._UPD_CITY);
    driver.findElement(By.linkText("Save profile")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    assertEquals(DataServiceProperties._UPD_CITY, driver.findElement(By.name("user[city]")).getAttribute("value"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
