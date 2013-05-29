package VideoManagement.VideoSearchFunctionality.SearchVideoByCategory;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

public class VerifySelectedCategoryAndSubCategoryVideosAreDisplayed extends BaseTest{
  UserLoginFunctions userLogin=new UserLoginFunctions();
	
  @Test
  public void testVerifySelectedCategoryAndSubCategoryVideosAreDisplayed() throws Exception {
	driver.get(DataServiceProperties.APPURL);
    
	userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText("XIDIO")).click();
    driver.findElement(By.linkText("Film")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Film[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
