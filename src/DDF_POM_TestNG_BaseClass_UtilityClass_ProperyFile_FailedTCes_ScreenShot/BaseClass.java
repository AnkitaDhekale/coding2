package DDF_POM_TestNG_BaseClass_UtilityClass_ProperyFile_FailedTCes_ScreenShot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass 
{

WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sanja\\eclipse-workspace1\\16 July A Selenium\\BrowserFiles\\chromedriver.exe");
	    RemoteWebDriver driver = new ChromeDriver();
		driver.get(UtilityClass.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
}
