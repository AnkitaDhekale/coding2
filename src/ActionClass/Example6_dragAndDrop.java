package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_dragAndDrop 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	driver.manage().window().maximize();
	
	WebElement src= driver.findElement(By.xpath("//a[@class='button button-orange']"));
	
	WebElement dest=driver.findElement(By.xpath("ui-widget-header"));
	
	Actions act=new Actions(driver);
	
	act.dragAndDrop(src, dest).perform();
	
	//
	act.moveToElement(src).clickAndHold().perform();
	
	
	
	
}




	
	
	
	
	
	
	
	
	
	
}
