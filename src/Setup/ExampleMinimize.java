package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleMinimize
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().minimize();
	
	//options1=driver.manage();
	//Window s2=s1.window();
	//s2.minimize();
}
	
	
	
}
