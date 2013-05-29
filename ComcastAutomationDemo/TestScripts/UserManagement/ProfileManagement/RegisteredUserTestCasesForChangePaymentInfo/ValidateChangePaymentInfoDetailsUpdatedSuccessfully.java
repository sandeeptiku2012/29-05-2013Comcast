package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePaymentInfo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;
import Core.UserManagement.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;
import DataServices.UserRegistrationUsingComcastApplication.UserRegistrationUsingComcast;

/**  ChangeCreditCardDetails
 * This test case validates payment Details updation feature by
 * logging registered user into Comcast application.
 * **/

public class ValidateChangePaymentInfoDetailsUpdatedSuccessfully extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
	@Test
	  public void testUserProfileChanges() throws Exception {
		try{
		//userReg.testUserRegistrationUsingComcast(driver);
		driver.get(DataServiceProperties.APPURL);
		
		userLogin.UserLoginCredentials(driver);

		//userLogin.ChangePassword(driver);
		
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    
	    driver.findElement(By.linkText("Change payment info")).click();
	    
	    userRegValFun.UpdateCCDetials(driver);
	        
	    driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
	    
	    Thread.sleep(2000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
		}catch(Exception e){
			takeScreeFailedshots();
		}
}
}

