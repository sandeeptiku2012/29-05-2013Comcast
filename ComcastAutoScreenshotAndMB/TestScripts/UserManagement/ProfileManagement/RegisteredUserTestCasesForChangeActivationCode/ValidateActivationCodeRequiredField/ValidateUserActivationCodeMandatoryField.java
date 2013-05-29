package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangeActivationCode.ValidateActivationCodeRequiredField;

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

public class ValidateUserActivationCodeMandatoryField extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
		
	@Test
	public void testChangeActivationCode() throws Exception {
	//userReg.testUserRegistrationUsingComcast(driver);
	driver.get(DataServiceProperties.APPURL);
	
	userLogin.UserLoginCredentials(driver);
    
	//userLogin.ChangePassword(driver);
	
    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change activation code")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.linkText("Activate")).click();
  
    Thread.sleep(1000);
    assertEquals("Activation code is required",driver.findElement(By.xpath("//*[@id='step-2']/fieldset[1]/div[2]/label/label")).getText());
    
    driver.findElement(By.linkText("Sign out")).click();
	}
}
