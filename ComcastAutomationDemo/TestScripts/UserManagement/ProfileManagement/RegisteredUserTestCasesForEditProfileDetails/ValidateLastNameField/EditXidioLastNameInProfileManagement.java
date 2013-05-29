package UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateLastNameField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

public class EditXidioLastNameInProfileManagement extends BaseTest{
 
  @Test
  public void testEditXidioLastNameInProfileManagement() throws Exception {
	UserLoginFunctions userLogin=new UserLoginFunctions();
	  
    driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    userLogin.UserLoginCredentials(driver);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    
    userLogin.ChangePassword(driver);
     
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.name("user[last_name]")).clear();
    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._UPD_LAST_NAME);
    driver.findElement(By.linkText("Save profile")).click();
    
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    assertEquals(DataServiceProperties._UPD_LAST_NAME, driver.findElement(By.name("user[last_name]")).getAttribute("value"));
    driver.findElement(By.linkText("Sign out")).click();
    
  }
}
