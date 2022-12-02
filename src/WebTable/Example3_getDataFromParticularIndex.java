package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getDataFromParticularIndex 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	

  WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/Amruta/Desktop/New%20html/Webtable.HTML");
	
	 String text=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[2]")).getText();
	System.out.println(text);
	
	String text1=driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
	
	System.out.println(text1);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
