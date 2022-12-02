package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_switchToFrame 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//switch to frame
	//driver.switchTo().frame("iframeResult"); //String FrameName
	//driver.switchTo().frame("iframeResult"); //String FrameID
	//driver.switchTo().frame(0);  //int FrameIndex
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"']")));
	
	//click on data & time btn from IFrame
	driver.findElement(By.xpath("//button[contain(text();Click me')")).click();
	
	
}
	
	
	
	
}