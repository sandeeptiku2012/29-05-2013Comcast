package VideoManagement.VideoFeedBackManagement;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

public class VerifyFeedbackSubmitedSuccessfully extends BaseTest{
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  @Test
  public void testVerifyFeedbackSubmitedSuccessfully() throws Exception {
    userReg.testUserRegistrationUsingComcast(driver);
    
   Thread.sleep(2000);
    userLogin.UserLoginCredentials(driver);
	
    userLogin.ChangePassword(driver);

    driver.findElement(By.cssSelector("img[alt=\"Ocean Life\"]")).click();
    driver.findElement(By.linkText("Give Feedback")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Give feedback to the publisher[\\s\\S]*$"));
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).sendKeys("Feedback");
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).sendKeys("This video is nice one.");
    driver.findElement(By.xpath("(//input[@name='Submit'])[2]")).click();
    Thread.sleep(2000);
    Alert javascriptAlert = driver.switchTo().alert();
    String AlertMsg=(javascriptAlert.getText().toString()); // Get text on alert box
    javascriptAlert.accept();
    
    assertEquals("Thanks for your valuable feedback. Your feedback has been communicated to the Publisher", AlertMsg);

    driver.findElement(By.linkText("Sign out")).click();
    
  }

  	private String closeAlertAndGetItsText() {
    boolean acceptNextAlert = false;
	try {
      Alert alert = driver.switchTo().alert();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alert.getText();
    } finally {
      acceptNextAlert = true;
    }
  }
}

