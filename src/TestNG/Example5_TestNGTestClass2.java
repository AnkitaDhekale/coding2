package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example5_TestNGTestClass2 
{
	
    @Test
	public void openFlipkartApp() throws InterruptedException
	{
       {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   }
	
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
	  
       Thread.sleep(4000);
       
       driver.close();
       
	   
	}  
}
