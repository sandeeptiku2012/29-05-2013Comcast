package Core.UserManagement.UserRegistrationFunction.Scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ConfigServices.DataServiceProperties;

public class UserRegistrationValidationFuncitons {

	public void validateFirstName(WebDriver driver)
	{
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateLastName(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateAddress(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateCity(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateZip(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateEmail(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateMobileNumber(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validatePassword(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	}
	
	public void validateLengthOfPassword(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._INVALID_PASSWORD_LENGTH);
	}
	
	public void validateInvalidMobileNumber(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._INVALID_MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateNonCapitalLetterPassword(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._NONCAPITAL_LETTER_PASSWORD);
	}
	
	public void validateNonDigitPassword(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._NONDIGIT_PASSWORD);
	}
	
	public void validateInvalidZipLength(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._INVALID_ZIP_LENGTH);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateInvalidZip(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._INVALID_ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void validateInvalidEmail(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._INVALID_EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
	
	public void UpdateCCDetials(WebDriver driver) throws FileNotFoundException, IOException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._UPD_CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._UPD_CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._UPD_CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._UPD_CC_PIN_CODE);
	}
	
	public void UpdateCCExpiryMonth(WebDriver driver) throws FileNotFoundException, IOException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    //driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._UPD_CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);

	}
	
	/*Below function are to validate Credit Card Mandatory Fields*/
	public void ValidateCreditCardNumberMandatoryField(WebDriver driver) throws FileNotFoundException, IOException
	{
		 	new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
		    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
		    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
		    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
		    driver.findElement(By.name("user[cc_security_code]")).clear();
		    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
		    driver.findElement(By.name("user[cc_pin_code]")).clear();
		    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	public void ValidateSecurityCodeMandatoryField(WebDriver driver) throws FileNotFoundException, IOException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);

	}
	
	public void ValidateInvalidCreditCardNumber(WebDriver driver) throws FileNotFoundException, IOException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._INVALID_CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	public void ValidateInvalidSecurityCodeNumber(WebDriver driver) throws FileNotFoundException, IOException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._INVALID_CC_SECURITY_CODE_CHAR);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	public void ValidateSecurityCodeLength(WebDriver driver) throws FileNotFoundException, IOException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._INVALID_CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}

	public void ValidatePinCodeMandatoryField(WebDriver driver) throws FileNotFoundException, IOException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	public void ValidateInvalidPinCodeCharLength(WebDriver driver) throws FileNotFoundException, IOException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._INVALID_CC_PIN_CODE_LENGTH);
	}
}
