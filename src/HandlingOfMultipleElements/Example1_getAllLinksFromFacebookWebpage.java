package HandlingOfMultipleElements;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getAllLinksFromFacebookWebpage 
{
private static WebElement[] allLinks;

public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	java.util.List<WebElement> Links = driver.findElements(By.xpath("//a"));
		
		 

	for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}

		
		
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	

