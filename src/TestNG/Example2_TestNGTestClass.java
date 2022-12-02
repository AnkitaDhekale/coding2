package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2_TestNGTestClass 
{

	@Test
     public void openfacebookapp() throws InterruptedException
 	{
	{
		System.setProperty("webdriver.driver.chromedriver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.close();
	
	
}
}