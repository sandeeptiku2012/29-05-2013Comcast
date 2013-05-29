package UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePinCode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

/**  ChangePinCode
 * This test case validates user pin code updation feature
 * by logging registered user into Comcast application.
 * **/

public class ChangePinCode extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	public void testChangePinCode() throws Exception {
	driver.get(DataServiceProperties.APPURL);
		
	userLogin.UserLoginCredentials(driver);
    
	driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
    driver.findElement(By.linkText("Change pin code")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._INVALID_CC_PIN_CODE);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._INVALID_PASSWORD);
    driver.findElement(By.name("commit")).click();
    //driver.findElement(By.cssSelector("div.right > #uniform-undefined > span")).click();
    
    Thread.sleep(2000);
   /* assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pin code has not been updated[\\s\\S]*$"));
    driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._CC_PIN_CODE);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._PASSWORD);
    driver.findElement(By.name("commit")).click();
    Thread.sleep(2000);
*/
    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
}
}

