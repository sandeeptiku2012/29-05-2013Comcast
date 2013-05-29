package VideoManagement.VideoSearchFunctionality.SearchVideoByInvalidData;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.DataServiceProperties;
import ConfigServices.Utils.BaseTest;
import Core.UserManagement.UserLoginFunctions.UserLoginFunctions;

public class VerifySearchByEnteringSplCharacters extends BaseTest{
 UserLoginFunctions userLogin=new UserLoginFunctions();
 
  @Test
  public void testEnsureSearchChannelStoreIsWorkingFine() throws Exception {
	driver.get(DataServiceProperties.APPURL);
	userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys(DataServiceProperties._SEARCH_VIDEO_BY);
    driver.findElement(By.id("go-search")).click();
    Thread.sleep(2000);
    /*try{
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Results for 'Norcal Publishing'[\\s\\S]*$"));
    }
    catch(Exception e){    	
    }*/
    try {
      assertTrue(isElementPresent(By.linkText("Norcal Publishing")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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

