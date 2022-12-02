package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Example13_MultiBrowserTesting 
{

	
	@Test
	public void openbrowser(String browserName)
	{
		WebDriver driver=null;
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}	
		
		else if(browserName.equals("edgebrowser"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.quit();
		
	}
	
	
	
	
}
