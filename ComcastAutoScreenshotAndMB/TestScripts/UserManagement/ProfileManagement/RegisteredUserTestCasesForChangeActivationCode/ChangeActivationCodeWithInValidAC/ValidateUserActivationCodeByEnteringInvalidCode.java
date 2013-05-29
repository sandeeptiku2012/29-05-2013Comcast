package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangeActivationCode.ChangeActivationCodeWithInValidAC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.ProfileManagement.Scenario.ProfileManagementScenarioBasedFunctions;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  ChangeUserActivationCode
 * This test case validates changing user activation code feature
 * by logging registered user into Comcast application.
 * **/

public class ValidateUserActivationCodeByEnteringInvalidCode extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
		
	@Test
	public void testChangeActivationCode() throws Exception {
	userReg.testUserRegistrationUsingComcast(driver);
	//driver.get(DataServiceProperties.APPURL);
	
	userLogin.UserLoginCredentials(driver);
    
	userLogin.ChangePassword(driver);
	
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change activation code")).click();
    
    driver.findElement(By.name("user[activation_code]")).clear();
    driver.findElement(By.name("user[activation_code]")).sendKeys(DataServiceProperties._INVALID_ACTION_CODE);
    
    driver.findElement(By.linkText("Activate")).click();
  
    Thread.sleep(1000);
    assertEquals("Activation code "+DataServiceProperties._INVALID_ACTION_CODE+" is invalid", driver.findElement(By.cssSelector("label.error")).getText());
    
    driver.findElement(By.linkText("Sign out")).click();
	}
}
