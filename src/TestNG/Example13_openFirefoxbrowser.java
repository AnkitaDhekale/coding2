package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Example13_openFirefoxbrowser 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	
	EdgeDriver driver=new EdgeDriver();
	
	driver.get("https://www.facebook.com/");
}
	
	
	
	
	
	
}
