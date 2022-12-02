package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handlingOfDropdown 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	//step1:
	
	    WebElement loginBtn=driver.findElement(By.xpath("//a[text()='Login']"));
	
	//step2:
	 Actions act=new Actions(driver);
	
	//step3:
	 act.moveToElement(loginBtn).perform();
	
	
	

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
