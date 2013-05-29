package VideoManagement.VideoSubscriptionManagement.PaidSubscriptionForVideo;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class VerifySubcriptionOfPaidVideo extends BaseTest{
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  
  @Test
  public void testVerifySubcriptionOfPaidVideo() throws Exception {
	userReg.testUserRegistrationUsingComcast(driver);
	
	Thread.sleep(2000);
	userLogin.UserLoginCredentials(driver);
	userLogin.ChangePassword(driver);
    
	Thread.sleep(2000);
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys(DataServiceProperties._SEARCH_VIDEO_BY);
    driver.findElement(By.id("go-search")).click();
    
    Thread.sleep(4000);
    assertEqual("Results for 'Norcal Publishing'",driver.findElement(By.xpath("html/body/div[1]/div[3]/div/h2")).getText());
	
	String SearchResult="Results for 'Norcal Publishing'";
	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*'"+SearchResult+"'[\\s\\S]*$"));
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Results for 'Norcal Publishing'[\\s\\S]*$"));
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Norcal Publishing[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
    driver.findElement(By.linkText("Subscribe")).click();
    driver.findElement(By.name("pin_code")).clear();
    driver.findElement(By.name("pin_code")).sendKeys("1234");
    driver.findElement(By.cssSelector("fieldset > input[type=\"submit\"]")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have been subscribed\\.[\\s\\S]*$"));

    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*It's all in the family[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Unsubscribe[\\s\\S]*$"));
    driver.findElement(By.linkText("My Channels")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*\r\nIt's all in the family [\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
private void assertEqual(String string, String text) {
	// TODO Auto-generated method stub
	
}

private void assertTrue(boolean matches) {
	// TODO Auto-generated method stub
	
}

}

