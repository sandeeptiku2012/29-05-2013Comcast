package UserManagement.UserRegistration.UserRegistrationTestCasesForPaymentDetails;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserRegistrationFunction.Common.UserRegistrationFunction;

public class RegisterToXidioApplicationDirectlyWithPaymentDetailsWithoutPersonalInfo extends BaseTest{
	UserRegistrationFunction urf=new UserRegistrationFunction();
	
	@Test
  public void testRegisterToXidioApplicationDirectlyWithPaymentDetailsWithoutPersonalInfo() throws Exception {
	driver.get(DataServiceProperties.APPURL);
	driver.findElement(By.linkText("Register")).click();
    
    driver.findElement(By.linkText("Payment")).click();
    
    urf.CreditCardDetials(driver);
    
    driver.findElement(By.cssSelector("a.btn.submit")).click();
    driver.findElement(By.linkText("Personal info")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First name is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Last name is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Address is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*City is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Zip is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Email is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Mobile number is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password is required[\\s\\S]*$"));

  }
}
