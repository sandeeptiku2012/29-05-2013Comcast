package Comcast_Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import ConfigServices.Utils.TestDataGenerator;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import Core.UserManagement.UserRegistrationFunction.Common.UserRegistrationFunction;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class DemoClass_MB extends BaseTest{
	UserRegistrationFunction userReg=new UserRegistrationFunction();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
	@Test
	public void testUserRegistration() throws Exception {
	TestDataGenerator.modifyDataProperties();
	Thread.sleep(50000);
	
	driver.get(DataServiceProperties.APPURL);
	Thread.sleep(4000);
	
	/*
	 * This test case validates the registration feature by not providing first name
	 */
	    driver.findElement(By.linkText("Register")).click();
	    
	    userRegValFun.validateFirstName(driver);
	    
	    driver.findElement(By.linkText("Next")).click();
	    Thread.sleep(2000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First name is required[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Back to frontpage")).click();
	    
		/*
		 * This test case validates the registration feature by not providing Email
		 */
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateEmail(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Email is required[\\s\\S]*$"));
    
    
    driver.findElement(By.linkText("Back to frontpage")).click();
    
	/*
	 * This test case register to the Comcast Applicaton using valid Credentials
	 */
    
    driver.findElement(By.linkText("Register")).click();
    
    userReg.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    driver.findElement(By.id("terms_conditions_accept")).click();
    
    userReg.CreditCardDetials(driver);
    
    driver.findElement(By.cssSelector("a.btn.submit")).click();
    
    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));

    driver.findElement(By.linkText("Sign out")).click();  
	
    /*
	 * This test case validate Change Password with Invalid Credentials
	 */

    userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change password")).click();
    driver.findElement(By.name("old_password")).clear();
    driver.findElement(By.name("old_password")).sendKeys(DataServiceProperties._NONDIGIT_PASSWORD);
    
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(DataServiceProperties._RESET_PASSWORD);
    
    driver.findElement(By.name("confirm_password")).clear();
    driver.findElement(By.name("confirm_password")).sendKeys(DataServiceProperties._INVALID_PASSWORD);
    
    driver.findElement(By.name("commit")).click();
   
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password has not been updated[\\s\\S]*$"));
	
    /*
	 * This test case validates Change Password with Valid Credentials.
	 */
    userLogin.ChangePassword(driver);
		    
		    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign out[\\s\\S]*$"));
		   
	    /*
		 * This test case Subscribe the video by selecting category.
		 */    
		Thread.sleep(2000);
	    assertEquals("", driver.findElement(By.xpath("//img[@alt='Comcast Labs, XIDIO']")).getText());
	    driver.findElement(By.id("search-query")).clear();
	    driver.findElement(By.id("search-query")).sendKeys(DataServiceProperties._SEARCH_VIDEO_BY);
	    driver.findElement(By.id("go-search")).click();

	    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
	    
	    driver.findElement(By.linkText("Subscribe")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.name("pin_code")).clear();
	    driver.findElement(By.name("pin_code")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	    driver.findElement(By.cssSelector("fieldset > input[type=\"submit\"]")).click();
	    
	    Thread.sleep(4000);   
	    
	    
	
	    /*
		 * This test case Un subscribe the already subscribed video.
		 */
	
	    driver.findElement(By.linkText("My Channels")).click();
	    
	    driver.findElement(By.id("search-query")).clear();
	    driver.findElement(By.id("search-query")).sendKeys(DataServiceProperties._SEARCH_VIDEO_BY);
	    driver.findElement(By.id("go-search")).click();
	    
	    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
	    driver.findElement(By.linkText("Unsubscribe")).click();
	    
	    driver.findElement(By.cssSelector("fieldset.unsubscribed > input[type=\"submit\"]")).click();
    
	    /*
		 * This test case validate Provide Feedback feature.
		 */
	
	Thread.sleep(2000);
    
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys(DataServiceProperties._SEARCH_VIDEO_BY);
    driver.findElement(By.id("go-search")).click();

    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
	    
	driver.findElement(By.linkText("Give Feedback")).click();
    driver.findElement(By.xpath("(//input[@name='Submit'])[2]")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Subject is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Message is required[\\s\\S]*$"));
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).sendKeys(DataServiceProperties._VIDEIO_KEY_NAME);
    
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).sendKeys("This video is wonderfull.");
    
    driver.findElement(By.xpath("(//input[@name='Submit'])[2]")).click();
    
    Thread.sleep(2000);
    Alert javascriptAlert = driver.switchTo().alert();
    String AlertMsg=(javascriptAlert.getText().toString()); // Get text on alert box
    javascriptAlert.accept();
    
    assertEquals("Thanks for your valuable feedback. Your feedback has been communicated to the Publisher", AlertMsg);

    Thread.sleep(4000);
    
    /*
   	 * This test case validates change First Name Feature.
   	 */
    	Thread.sleep(4000);
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._UPD_FIRST_NAME);
	    driver.findElement(By.linkText("Save profile")).click();

	    Thread.sleep(4000);
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    Thread.sleep(4000);
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._UPD_CITY);
	    driver.findElement(By.linkText("Save profile")).click();
	    Thread.sleep(4000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    assertEquals(DataServiceProperties._UPD_CITY, driver.findElement(By.name("user[city]")).getAttribute("value"));

	    /*
	   	 * This test case validates change user Name Feature.
	   	 */

	    Thread.sleep(2000);
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    
	    driver.findElement(By.linkText("Change payment info")).click();
	    
	    userRegValFun.UpdateCCDetials(driver);
	        
	    driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
	    Thread.sleep(2000);
	    
	    /*
	   	 * This test case validates Change Pin Feature.
	   	 */
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.linkText("Change pin code")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys("5343");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.name("commit")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pin code has not been updated[\\s\\S]*$"));
    driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._CC_PIN_CODE);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._PASSWORD);
    driver.findElement(By.name("commit")).click();
    Thread.sleep(2000);
   
    /*
   	 * This test case validates change Activation Code Feature.
   	 */
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.linkText("Change activation code")).click();
    driver.findElement(By.name("user[activation_code]")).clear();
    driver.findElement(By.name("user[activation_code]")).sendKeys(DataServiceProperties._ACTION_CODE);
    driver.findElement(By.linkText("Activate")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.name("user[activation_code]")).clear();
    driver.findElement(By.linkText("Activate")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
}
private Object closeAlertAndGetItsText() {
	// TODO Auto-generated method stub
	return null;
}
}

