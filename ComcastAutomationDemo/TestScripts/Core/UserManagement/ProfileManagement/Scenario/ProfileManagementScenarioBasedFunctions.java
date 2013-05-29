package Core.UserManagement.ProfileManagement.Scenario;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ConfigServices.DataServiceProperties;

public class ProfileManagementScenarioBasedFunctions {

	public void VerifyNewPassAndConfirmPassMatch(WebDriver driver)
	{
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
	    driver.findElement(By.name("old_password")).clear();
	    driver.findElement(By.name("old_password")).sendKeys(DataServiceProperties._PASSWORD);
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(DataServiceProperties._PASSWORD);
	    driver.findElement(By.name("confirm_password")).clear();
	    driver.findElement(By.name("confirm_password")).sendKeys(DataServiceProperties._INVALID_PASSWORD_LENGTH);
	    driver.findElement(By.name("commit")).click();
	}
	
	public void ValidateInvalidCreditCardNumber(WebDriver driver)
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._INVALID_CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	public void ValidateInvalidMonth(WebDriver driver) throws FileNotFoundException, IOException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._INVALID_CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	public void ValidatePaymentInfoMonthMandatoryField(WebDriver driver) throws FileNotFoundException, IOException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	public void ValidateYearFieldByEnteringPastYear(WebDriver driver)
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._PAST_YEAR);
	    //Thread.sleep(2000);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	public void ValidateYearMandatoryField(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	public void ValidateSecurityCodeFieldByEnteringInvalidLength(WebDriver driver)
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._PAST_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._INVALID_CC_SECURITY_CODE_LENGTH);
	}
	
	public void ValidateSecurityCodeFieldByEnteringCharValue(WebDriver driver)
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._PAST_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._INVALID_CC_SECURITY_CODE_CHAR);
	}
	
	public void ValidatePinCodeFieldByEnteringInvalidPinLength(WebDriver driver)
	{
		driver.findElement(By.name("cc_pin_code")).clear();
	    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._INVALID_CC_PIN_CODE_LENGTH);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._PASSWORD);
	}
	
	public void ValidatePasswordFieldByEnteringInvalidPass(WebDriver driver)
	{
		driver.findElement(By.name("cc_pin_code")).clear();
	    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._INVALID_PASSWORD_LENGTH);
	}
}
