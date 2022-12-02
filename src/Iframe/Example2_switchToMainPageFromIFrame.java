package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_switchToMainPageFromIFrame 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//switch to frame
	driver.switchTo().frame("iframeResult"); //StringFrameName
	
	//click on data and time btn from iframe
	
	driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	
	Thread.sleep(3000);
	
	//switch to main page
	//driver.switchTo().parentFrame();
	 driver.switchTo().defaultContent();
	 
	 //click on menu btn from main page
	 driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	 
	 
	 
	
}
	
	
	
	
}
