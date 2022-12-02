package PopUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_AlertPopup1 
{
public static void main(String[] args) 
{
	System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer");
	
	//enter customer ID
	driver.findElement(By.xpath("//input[@type='text']]")).sendKeys("ABC");
	
	//click on submit btn
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		//getText from alert popup
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	// click on cancel btn from alert popup
	//
	driver.switchTo().alert().dismiss();
	
	//click on OK btn from 2nd alert popup
	driver.switchTo().alert().accept();
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
