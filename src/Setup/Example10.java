package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
//Option s1=driver.manage()	;
//Window s2=s1.window()	;
//s2.maximize()	;
	
}
	
	
}
