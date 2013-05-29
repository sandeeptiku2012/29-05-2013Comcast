package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateAddressField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

public class EditXidioAddressInProfileManagement extends BaseTest{
  
  @Test
  public void testEditXidioAddressInProfileManagement() throws Exception {
	UserLoginFunctions userLogin=new UserLoginFunctions();
	driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    userLogin.UserLoginCredentials(driver);

    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.name("user[address]")).clear();
    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._UPD_ADDRESS);
    driver.findElement(By.linkText("Save profile")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.linkText("Sign out")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    assertEquals(DataServiceProperties._UPD_ADDRESS, driver.findElement(By.name("user[address]")).getAttribute("value"));
  }
}
