package UserManagement.UserLogin.ValidateUserLoginUsingInValidCredentials;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;

public class LoginToXidioApplicationUsingInValidUserName extends BaseTest{
  
  @Test
  public void testLoginToXidioApplicationUsingInValidUName() throws Exception {
    driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    driver.findElement(By.name("user[user_name]")).clear();
    driver.findElement(By.name("user[user_name]")).sendKeys(DataServiceProperties._INVALID_USER_NAME);
     
    driver.findElement(By.name("user[password]")).clear();
    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._PASSWORD);
    driver.findElement(By.id("user_login")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));
  }
}

