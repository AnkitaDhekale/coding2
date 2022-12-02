package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRowSizeInATable 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/Amruta/Desktop/New%20html/Webtable.HTML");
	
	WebElement rowSize=(WebElement) driver.findElement(By.xpath("//table[@id='1234']//tr")).getSize();
			System.out.println(rowSize);
	
	
List<WebElement>allRows=(List<WebElement>) driver.findElement(By.xpath("//table[@id='1234']//tr"));
//int size=allRows.size();
//System.out.println(size);
}
	
	
	
	
	
	
	
	
	
	
	
}
