package ConfigServices.Utils;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import ConfigServices.DataServiceProperties;

public class BaseTest {
	
	public WebDriver driver;
	public String baseUrl;
	public StringBuffer verificationErrors = new StringBuffer();
	
	/*Before Annotation  for Web Driver Test cases.*/
	  @Before
	  public void setUp() throws Exception {
		  
		  String Browser=DataServiceProperties.BROWSER;
			 if(Browser.equalsIgnoreCase("firefox"))
				 driver = new FirefoxDriver();
			 else if(Browser.equalsIgnoreCase("InternetExplorer"))
				 driver=new InternetExplorerDriver();
			 else if(Browser.equalsIgnoreCase("chrome"))
			 {
				 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 		driver=new ChromeDriver();
			 }
			 else if(Browser.equalsIgnoreCase("safari"))
				driver=new SafariDriver();
			 else
				 driver = new FirefoxDriver();
			 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  }
	  
	/*After Annotation  for Web Driver Test cases.*/
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	    /*To run Test Cases on Multiple Browers Un commnet the below line*/ 
	    //TestDataGenerator.ChangeBrowser();
	    //Thread.sleep(4000);
	  }
	  
	  public void takeScreeFailedshots() throws IOException, InterruptedException{
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		    
		  	Calendar calendar = Calendar.getInstance();
			Date date = calendar.getTime();
			DateFormat stringDate = new SimpleDateFormat("ddMMyyhhmmss");	  
			String cdate = stringDate.format(date);
			String ClassName=this.getClass().getName();
			
			String c=getClass().getName(); //prints Package name + class name.
			String d=getClass().getSimpleName(); //prints only class name.
			String e=getClass().getCanonicalName(); //prints Package name + class name.
			
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			
			FileUtils.copyFile(scrFile, new File("./logs\\ScreenShots\\Comcast\\"+ClassName+"_"+cdate+".jpg"));
		    Thread.sleep(2000);
	  }
}
