package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateZipField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

public class EditXidioZipInProfileManagement extends BaseTest{
 
  @Test
  public void testEditXidioZipInProfileManagement() throws Exception {
	UserLoginFunctions userLogin=new UserLoginFunctions();
    driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    userLogin.UserLoginCredentials(driver);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    assertEquals(DataServiceProperties._ZIP, driver.findElement(By.name("user[zip]")).getAttribute("value"));
    
    driver.findElement(By.name("user[zip]")).clear();
    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._UPD_ZIP);
    driver.findElement(By.linkText("Save profile")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    assertEquals(DataServiceProperties._UPD_ZIP, driver.findElement(By.name("user[zip]")).getAttribute("value"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
