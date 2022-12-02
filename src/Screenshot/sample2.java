package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;


public class sample2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	          WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.meesho.com/");
	          
	      File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	          System.out.println(src);
	          
	         String RS=RandomString.make(2);   //ab, cd, dd, a1, c5, u9
	         
	         File dest=new File("C:\\Screenshot//Image"+RS+"jpg");
	          
}
	
	
	
	
}
