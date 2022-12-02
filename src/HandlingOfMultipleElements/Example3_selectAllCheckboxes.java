package HandlingOfMultipleElements;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_selectAllCheckboxes 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver,chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("file:///C:/Users/Amruta/Desktop/New%20html/3.html");
	
	List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement s1:allCheckBoxes)
	{
		s1.click();
		Thread.sleep(1000);
	}

	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
