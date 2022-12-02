package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example12_Parallel2 
{
 
@Test
public void openFacebookApp() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(4000);
	
	driver.close();
	
}	
	
	
	
	
	
}
	
	
	
	
	
	
