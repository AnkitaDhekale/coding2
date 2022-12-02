package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		
		
	Driver.get("https://www.facebook.com/login");
		
	Driver.close();
		
		
	}
	
	
	
	
	
}
