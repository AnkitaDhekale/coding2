package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColSizeInARow 
{
public static void main(String[] args) 
{
	
	System.setProperty("webdrive.chrome.drive", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/Amruta/Desktop/New%20html/Webtable.HTML");
	

	int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
	System.out.println(colSize);
	
	//for header
	int colSize1 = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
	System.out.println(colSize1);
	
	     
	
}	
	
	
	
	
}
 