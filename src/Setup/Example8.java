package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.crome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.flipkart.com/");
       
	String title=driver.getTitle();
	System.out.println(title);
}
	
	
}
