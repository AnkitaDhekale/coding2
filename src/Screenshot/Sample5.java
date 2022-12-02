package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample5
{
public static void main(String[] args) throws IOException 
{
 System.setProperty("wbdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
 
   driver.get("https://www.meetra.org.in/");
	 
   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   
   System.out.println(src);
   
   File dest=new File("C:\\Screenshot\\abc4.jpg");
   
   FileHandler.copy(src,dest);
}	
	
	
	
}
