package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate 
{
public static void main(String[] args) throws InterruptedException  
{
	System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();

	driver.navigate().to("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
}


}
	
	
	

