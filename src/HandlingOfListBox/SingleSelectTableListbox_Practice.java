package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectTableListbox_Practice 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//click on create in account
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 
	  //step:1 
	     WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
	     
	  //step:2
	             Select s = new Select(Month);
	     
	  //step:3
	              //    s.selectByVisibleText(oct); //string text
	             //   s.selectByValue(8)            //string value
	            //  s.selectBy.visibleIndex()      //string text
}

	
	
	
	
	
}
