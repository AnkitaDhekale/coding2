package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_clear 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/se");
		//
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		  WebElement  UN  =driver.findElement(By.xpath("//input[@name='email']"));UN.sendKeys("abcd");
		//Thread.sleep(2000); 
		//
		 driver.findElement(By.xpath("//input[@id='email']")) .clear();
	     //Thread.sleep(2000) 
	     //
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
		 
		     WebElement UN1 =driver.findElement(By.xpath("//input[@id='email"));UN1.sendKeys("abcd");
		       UN.sendKeys("abc");
		       Thread.sleep(20000);
	            UN.clear();
	            Thread.sleep(2000);
	             UN.sendKeys("xyz");
	}	
	
	
	
}
