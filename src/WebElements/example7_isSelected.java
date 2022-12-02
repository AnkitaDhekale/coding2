package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_isSelected 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/se");
	
	//click on create new acc link
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 
	Thread.sleep(3000);
	
	WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@class='_8esa'])[1]"));
	
	boolean result = false;
	if(result==true)
	{
		System.out.println("radio btn selected");
	}
	else
	{
		System.out.println("radio btn de-selected");
		femaleRadioBtn.click();  //selected radio btn
		
		boolean result2=femaleRadioBtn.isSelected();
	if(result2==true)
	{
		System.out.println("radio btn selected");
		
	}			
	else 
	{
		System.out.println("radio btn de-selected");
	}	
		
		
	}
	
		
	
}
	
	
	
	
	
}
