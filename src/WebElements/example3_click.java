package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_click
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/se");
	//click on create new acc link
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	  Thread.sleep(3000);
	  
	  //click on female radio btn
	  
	  driver.findElement(By.xpath("//input[@class='_8esa']")).click();
	
	
}
}