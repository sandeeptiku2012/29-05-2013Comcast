package UserManagement.UserRegistration.UserRegistrationTestCasesForActivationCode.UserRegByClickingOnActivationCode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import ConfigServices.Utils.TestDataGenerator;
import Core.UserManagement.UserRegistrationFunction.Common.UserRegistrationFunction;

public class RegisterToXidioApplicationByClickingActivation extends BaseTest{
	UserRegistrationFunction urf=new UserRegistrationFunction();

  @Test
  public void testRegistrationToXidioApplicationByClickingActivation() throws Exception {
		TestDataGenerator.modifyDataProperties();
		Thread.sleep(10000);
		
		driver.get(DataServiceProperties.APPURL);
		Thread.sleep(4000);
    driver.findElement(By.linkText("Register")).click();
    
    //Calling UserRegistration Function
    urf.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    driver.findElement(By.id("terms_conditions_accept")).click();
    
    //Calling UserRegistration Function
    urf.CreditCardDetials(driver);
    
    driver.findElement(By.cssSelector("a.btn.submit")).click();
    /*driver.findElement(By.name("user[activation_code]")).clear();
    driver.findElement(By.name("user[activation_code]")).sendKeys(AppProperties._ACTION_CODE);
    driver.findElement(By.linkText("Activate")).click();
    Thread.sleep(2000);
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    assertTrue(isElementPresent(By.linkText(AppProperties._EMAIL)));
    driver.findElement(By.linkText("Sign out")).click();*/
    
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

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
