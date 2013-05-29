package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePinCodeField;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.ProfileManagement.Scenario.ProfileManagementScenarioBasedFunctions;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  VerifyEnteredPinIsVisibleWhenUserClicksOnDisplayPin
 * This test case Verify Entered Pin is Visible when user clicks on Display Pin
 * by logging registered user into Comcast application.
 * **/

public class VerifyEnteredPinIsVisibleWhenUserClicksOnDisplayPin extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();  
	ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
	
	@Test
	public void testVerifyChangePinCodeDetailsUpdatedSuccessfully() throws Exception {
	//userReg.testUserRegistrationUsingComcast(driver);
	driver.get(DataServiceProperties.APPURL);
    
    userLogin.UserLoginCredentials(driver);
    
    //userLogin.ChangePassword(driver);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change pin code")).click();
    
	driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._CC_PIN_CODE);
    
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    assertEquals(DataServiceProperties._CC_PIN_CODE, driver.findElement(By.name("cc_pin_code")).getAttribute("value"));
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(2000);
        
    driver.findElement(By.linkText("Sign out")).click();
  }
}

