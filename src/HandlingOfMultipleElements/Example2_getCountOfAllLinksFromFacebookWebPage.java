package HandlingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getCountOfAllLinksFromFacebookWebPage 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
//	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//	int size = allLinks.size();
//		System.out.println(size);
		
		int count = driver.findElements(By.xpath("//a")).size();
		System.out.println(count);
		
	
	
	
	
	
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
