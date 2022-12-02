package HandlingOfDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_PracticegetRatings 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//click on close btn
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	//enter mob name
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmo note 10");
	
	//click on search ICON
	driver.findElement(By.xpath("//button[@class='Tg7LZd']")).click();
	
}
	
	
	
	
	
	
	
}
