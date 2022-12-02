package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_get 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.crome.driver", "C:\\Selenium\\chromedriver_win32");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://meet.google.com/tki-usry-ppe");
}
	
	
	
	
}
