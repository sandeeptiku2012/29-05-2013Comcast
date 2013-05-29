package Core.UserManagement.UserRegistrationFunction.Common;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ConfigServices.DataServiceProperties;

public class UserRegistrationFunction{
	
	public void CreditCardDetials(WebDriver driver) throws FileNotFoundException, IOException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	public void RegistrationDetails(WebDriver driver)
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
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	}
}
