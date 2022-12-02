package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_practiceTestNGTestClass 
{
public void openFacebookApp() throws InterruptedException
{
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
 
 WebDriver driver=new ChromeDriver();

driver.get("https://facebook.com/");
Thread.sleep(4000);

driver.close();

}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
