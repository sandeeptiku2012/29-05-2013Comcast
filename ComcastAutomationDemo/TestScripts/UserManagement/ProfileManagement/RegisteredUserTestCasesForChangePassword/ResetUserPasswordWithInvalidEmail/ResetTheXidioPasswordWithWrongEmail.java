package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePassword.ResetUserPasswordWithInvalidEmail;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;

public class ResetTheXidioPasswordWithWrongEmail extends BaseTest{
  
	@Test
  public void testResetTheXidioPasswordWithWrongEmail() throws Exception {
    driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    driver.findElement(By.linkText("Reset password")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.id("user_login")).click();
    driver.findElement(By.cssSelector("#uniform-user_login > span")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(DataServiceProperties._INVALID_EMAIL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Email is wrong[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
  //Need to check email to confirm email has not received.
	//==================================================================
  }
}
